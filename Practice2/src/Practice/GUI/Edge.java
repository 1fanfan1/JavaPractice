package Practice.GUI;

import java.awt.*;

public class Edge {

    private Color color = Color.BLACK;
    private Node startNode;
    private Node endNode;
    private Integer weight = 0;
    private Integer bandwidth = 0;

    public Edge(Node startNode, Node endNode, int weight, int bandwidth) {
        this.startNode = startNode;
        this.endNode = endNode;
        this.weight = weight;
        this.bandwidth = bandwidth;
        startNode.addListEdge(this);
        endNode.addListEdge(this);
    }


    public void setColor(Color color) { this.color = color; }

    public Node getStartNode() {
        return startNode;
    }

    public Node getEndNode() {
        return endNode;
    }

    public Integer getWeight() {
        return weight;
    }

    public Color getColor() {
        return color;
    }



}
