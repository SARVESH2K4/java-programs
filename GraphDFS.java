import java.util.*;

class GraphDFS {
    private LinkedList<Integer>[] adj;

    // Constructor
    GraphDFS(int V) {
        adj = new LinkedList[V];
        for (int i = 0; i < V; i++) {
            adj[i] = new LinkedList<>();
        }
    }

    // Add edge
    void addEdge(int v, int w) {
        adj[v].add(w);
    }

    // DFS helper method
    void DFSUtil(int v, boolean[] visited) {
        visited[v] = true;
        System.out.print(v + " ");

        for (int n : adj[v]) {
            if (!visited[n]) {
                DFSUtil(n, visited);
            }
        }
    }

    // DFS traversal
    void DFS(int v) {
        boolean[] visited = new boolean[adj.length];
        DFSUtil(v, visited);
    }

    public static void main(String[] args) {
        GraphDFS g = new GraphDFS(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        System.out.println("DFS starting from vertex 2:");
        g.DFS(2);  // Output: 2 0 1 3
    }
}
