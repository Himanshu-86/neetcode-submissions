class Solution{
    ArrayList<Integer>[] graph;
    int[] state;
    ArrayList<Integer> ans;

    public int[] findOrder(int numCourses,int[][] prerequisites){
        graph=new ArrayList[numCourses];
        state=new int[numCourses];
        ans=new ArrayList<>();

        for(int i=0;i<numCourses;i++){
            graph[i]=new ArrayList<>();
        }

        for(int[] p:prerequisites){
            int course=p[0];
            int prerequisite=p[1];

            graph[prerequisite].add(course);
        }

        for(int i=0;i<numCourses;i++){
            if(state[i]==0){
                if(!dfs(i)){
                    return new int[0];
                }
            }
        }

        int[] result=new int[numCourses];

        for(int i=0;i<numCourses;i++){
            result[i]=ans.get(numCourses-1-i);
        }

        return result;
    }

    boolean dfs(int node){
        if(state[node]==1){
            return false;
        }

        if(state[node]==2){
            return true;
        }

        state[node]=1;

        for(int neighbor:graph[node]){
            if(!dfs(neighbor)){
                return false;
            }
        }

        state[node]=2;
        ans.add(node);

        return true;
    }
}