import java.util.*;

class GraphBFS {
    private LinkedList<Integer>[] adj;

    // Constructor
    GraphBFS(int V) {
        adj = new LinkedList[V];
        for (int i = 0; i < V; i++) {
            adj[i] = new LinkedList<>();
        }
    }

    // Add edge
    void addEdge(int v, int w) {
        adj[v].add(w);
    }

    // BFS traversal
    void BFS(int s) {
        boolean[] visited = new boolean[adj.length];
        LinkedList<Integer> queue = new LinkedList<>();

        visited[s] = true;
        queue.add(s);

        while (!queue.isEmpty()) {
            s = queue.poll();
            System.out.print(s + " ");

            for (int n : adj[s]) {
                if (!visited[n]) {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    }

    public static void main(String[] args) {
        GraphBFS g = new GraphBFS(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        System.out.println("BFS starting from vertex 2:");
        g.BFS(2);  // Output: 2 0 3 1
    }
}
