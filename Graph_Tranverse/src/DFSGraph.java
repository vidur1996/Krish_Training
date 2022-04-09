import java.util.*;

class DFSGraph {
    private LinkedList<Integer> adjacencyList[];
    private boolean visited[];

    DFSGraph(int vertices) {
        adjacencyList = new LinkedList[vertices];
        visited = new boolean[vertices];

        for (int i = 0; i < vertices; i++)
            adjacencyList[i] = new LinkedList<Integer>();
    }

    void addEdge(int src, int dest) {
        adjacencyList[src].add(dest);
    }

    void DFS(int vertex) {
        visited[vertex] = true;
        System.out.print(vertex + " ");

        Iterator<Integer> ite = adjacencyList[vertex].listIterator();
        while (ite.hasNext()) {
            int adj = ite.next();
            if (!visited[adj])
                DFS(adj);
        }
    }

    public static void main(String args[]) {
        DFSGraph g = new DFSGraph(5);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(0, 4);

        g.addEdge(1, 4);
        g.addEdge(1, 2);
        g.addEdge(1, 3);

        g.addEdge(2, 3);

        g.addEdge(3, 4);



        System.out.println("Following is Depth First Traversal");

        g.DFS(0);
    }
}