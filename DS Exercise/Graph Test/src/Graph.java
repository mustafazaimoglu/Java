
import java.util.*;

// This class represents a directed graph using adjacency list
// representation
class Graph
{

    private List<List<Integer>> adj; //Adjacency Lists

    // Constructor
    Graph()
    {
        adj = new LinkedList<>();

        this.adj.add(new LinkedList<>());

    }

    // Function to add an edge into the graph
    void addEdge(int v, int w)
    {
        adj.get(v).add(w);
    }

    // Driver method to
    public static void main(String args[])
    {
        Graph g = new Graph();

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
        System.out.println(g.adj.get(1).get(0));
    }
}
