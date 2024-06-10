import java.util.*;

public class Main {

    private int V; 
    private LinkedList<Integer>[] adj; 

    public Main(int v) {
        V = v;
        adj = new LinkedList[v + 1]; 
        for (int i = 0; i <= v; ++i)
            adj[i] = new LinkedList();
    }

    void addEdge(int v, int w) {
        adj[v].add(w);
        adj[w].add(v); 
    }

    void sortLists() {
        for (int i = 0; i <= V; ++i) {
            Collections.sort(adj[i]);
        }
    }

    void DFS(int v) {
        boolean[] visited = new boolean[V + 1];
        List<Integer> result = new ArrayList<>(); 
        DFSUtil(v, visited, result);
        for (int node : result) {
            System.out.print(node + " ");
        }
        System.out.println();
    }

    void DFSUtil(int v, boolean[] visited, List<Integer> result) {
        visited[v] = true;
        result.add(v);

        Iterator<Integer> i = adj[v].listIterator();
        while (i.hasNext()) {
            int n = i.next();
            if (!visited[n])
                DFSUtil(n, visited, result);
        }
    }

    void BFS(int v) {
        boolean[] visited = new boolean[V + 1]; 
        List<Integer> result = new ArrayList<>(); 
        LinkedList<Integer> queue = new LinkedList<Integer>();

        visited[v] = true;
        queue.add(v);

        while (queue.size() != 0) {
            v = queue.poll();
            result.add(v);

            Iterator<Integer> i = adj[v].listIterator();
            while (i.hasNext()) {
                int n = i.next();
                if (!visited[n]) {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }

        for (int node : result) {
            System.out.print(node + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt(); 
        int M = scanner.nextInt(); 
        int V = scanner.nextInt(); 

        Main g = new Main(N);

        for (int i = 0; i < M; i++) {
            int v1 = scanner.nextInt();
            int v2 = scanner.nextInt();
            g.addEdge(v1, v2);
        }

        g.sortLists();

        g.DFS(V); 
        g.BFS(V);
    }
}