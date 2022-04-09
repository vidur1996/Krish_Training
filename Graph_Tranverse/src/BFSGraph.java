import java.util.*;

public class BFSGraph {
    private int V;
    private LinkedList<Integer> adjacencyList[];


    BFSGraph(int v) {
        V = v;
        adjacencyList = new LinkedList[v];
        for (int i = 0; i < v; ++i)
            adjacencyList[i] = new LinkedList();
    }


    void addEdge(int v, int w) {
        adjacencyList[v].add(w);
    }

    void BFS(int s) {

        boolean visited[] = new boolean[V];

        LinkedList<Integer> queue = new LinkedList();

        visited[s] = true;
        queue.add(s);

        while (queue.size() != 0) {
            s = queue.poll();
            System.out.print(s + " ");

            Iterator<Integer> i = adjacencyList[s].listIterator();
            while (i.hasNext()) {
                int n = i.next();
                if (!visited[n]) {
                    visited[n] = true;
                    queue.add(n);

                }
            }
        }
    }

    public static void main(String args[]) {
        BFSGraph g = new BFSGraph(5);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(0, 4);

        g.addEdge(1, 0);
        g.addEdge(1, 4);
        g.addEdge(1, 3);
        g.addEdge(1, 3);

        g.addEdge(2, 0);
        g.addEdge(2, 1);
        g.addEdge(2, 3);

        g.addEdge(3, 2);
        g.addEdge(3, 1);
        g.addEdge(3, 4);

        g.addEdge(4, 0);
        g.addEdge(4, 1);
        g.addEdge(4, 3);

        System.out.println("Breadth First Traversal starting from vertex 0");

        g.BFS(0);
    }
}