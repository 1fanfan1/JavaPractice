<<<<<<< HEAD
package Practice.GUI;

import javax.swing.*;
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
        for (Edge edge:node.getListEdge()){
            deleteEdge(edge);
        }
        return nodes.remove(node);
    }

    public boolean deleteEdge(Edge edge) {
        return edges.remove(edge);
    }
    public  LinkedList<Node> getNodes(){ return nodes; }
}
=======
package Practice.GUI;

import javax.swing.*;
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
        for (Edge edge:node.getListEdge()){
            deleteEdge(edge);
        }
        return nodes.remove(node);
    }

    public boolean deleteEdge(Edge edge) {
        return edges.remove(edge);
    }
    public  LinkedList<Node> getNodes(){return nodes;}
}
>>>>>>> 5c138f4e2f0daa1464711446f1f07fe1571b7f9b
