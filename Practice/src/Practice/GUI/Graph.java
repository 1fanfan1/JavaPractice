package Practice.GUI;

import java.util.LinkedList;

public class Graph {

    LinkedList <Node> nodes;
    LinkedList <Edge> edges;

    public Graph(){
        nodes = new LinkedList<Node>();
        edges = new LinkedList<Edge>();
    }

    public void addNode(Node _node){
        nodes.add(_node);
    }

    public void addEdge(Edge _edge){
        edges.add(_edge);
    }

    public boolean deleteNode(Node node){
        return nodes.remove(node);
    }

    public boolean deleteEdge(Edge edge) {
        return edges.remove(edge);
    }
}
