package Practice.GUI;

import java.awt.*;

public class Edge {
<<<<<<< HEAD

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
=======
    private Color color = Color.BLACK;
    private Node startNode;
    private Node endNode;
    private Integer count1 = 0;
    private Integer count2 = 0;

    public Edge(Node startNode, Node endNode, int count1, int count2) {
        this.startNode = startNode;
        this.endNode = endNode;
        this.count1 = count1;
        this.count2 = count2;
>>>>>>> 5c138f4e2f0daa1464711446f1f07fe1571b7f9b
        startNode.addListEdge(this);
        endNode.addListEdge(this);
    }


<<<<<<< HEAD
    public void setColor(Color color) { this.color = color; }
=======
    public void changeColor(Color color) {
        this.color = color;
    }
>>>>>>> 5c138f4e2f0daa1464711446f1f07fe1571b7f9b

    public Node getStartNode() {
        return startNode;
    }

    public Node getEndNode() {
        return endNode;
    }

    public Integer getWeight() {
<<<<<<< HEAD
        return weight;
    }

    public Color getColor() {
        return color;
    }



=======
        return count1;
    }

    public Integer getBandwidth() {
        return count2;
    }

>>>>>>> 5c138f4e2f0daa1464711446f1f07fe1571b7f9b
}
