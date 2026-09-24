class Solution{
    boolean[] visited;
    ArrayList<Integer>[] graph;

    public int countComponents(int n,int[][] edges){
        visited=new boolean[n];
        graph=new ArrayList[n];
        for(int i=0;i<n;i++){
            graph[i]=new ArrayList<>();
        }
        for(int[] edge:edges){
            int a=edge[0];
            int b=edge[1];

            graph[a].add(b);
            graph[b].add(a);
        }
        int count=0;

        for(int i=0;i<n;i++){
            if(!visited[i]){
                count++;
                dfs(i);
            }
        }
        return count;
    }
    void dfs(int node){
        visited[node]=true;

        for(int neighbor:graph[node]){
            if(!visited[neighbor]){
                dfs(neighbor);
            }
        }
    }
}