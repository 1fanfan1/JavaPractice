package Practice.GUI;

import javax.swing.*;
import java.awt.*;

public class Edge extends JPanel {
    private int startPosX = 0;
    private int startPosY = 0;
    private int endPosX = 0;
    private int endPosY = 0;
    private Color color = Color.BLACK;
    private Node startNode;
    private Node endNode;
    private Integer count1 = 0;
    private Integer count2 = 0;

    public Edge(Node startNode, Node endNode, int count1, int count2) {
        this.startNode = startNode;
        this.endNode = endNode;
        this.startPosX = startNode.getPosX();
        this.startPosY = startNode.getPosY();
        this.endPosX = endNode.getPosX();
        this.endPosY = endNode.getPosY();
        this.count1 = count1;
        this.count2 = count2;
        startNode.addListEdge(this);
        endNode.addListEdge(this);
    }

    ////////////////////////////////////////////
    ////////////////////////////////////////////
    // УДАЛИ ОТСЮДА paint и из Node тоже ///////
    ////////////////////////////////////////////
    ////////////////////////////////////////////

    @Override
    public void paint(Graphics g) {
        g.setFont(new Font("Arial", Font.BOLD, 12));
        g.drawLine(startPosX, startPosY, endPosX, endPosY);
        g.setFont(new Font("Arial", Font.BOLD, 12));
        g.drawString(count1.toString() + "|", (endPosX - startPosX) / 2 - 5 - count1.toString().length(), (endPosY - startPosY) / 2);
        g.drawString(count2.toString(), (endPosX - startPosX) / 2 + 8 + count2.toString().length(), (endPosY - startPosY) / 2);
    }

    public void changeColor(Color color) {
        this.color = color;
    }

    public Node getStartNode() {
        return startNode;
    }

    public Node getEndtNode() {
        return endNode;
    }

    public Integer getWeight() { return count1; }

    public Integer getBandwidth() { return count2; }

}
