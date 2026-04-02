class Solution {
    public boolean validTree(int n, int[][] edges) {

        if (edges.length != n - 1) return false;

        ArrayList<Integer>[] graph = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int i = 0; i < edges.length; i++) {
        graph[edges[i][0]].add(edges[i][1]);
        graph[edges[i][1]].add(edges[i][0]);
        }
        boolean[] visited = new boolean[n];
        dfs(0, graph, visited);

        for (int i = 0; i < n; i++) {
            if (!visited[i]) return false;
        }
        return true;
    }
    private void dfs(int node, ArrayList<Integer>[] graph, boolean[] visited) {
        visited[node] = true;

        for (int i : graph[node]) {
            if (!visited[i]) {
                dfs(i, graph, visited);
            }
        }
    }
}