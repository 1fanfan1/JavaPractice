package Practice.GUI;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Node {
    private Color color = Color.BLUE;
    private int posX;
    private int posY;
    private int size = 30;
    private String name;
<<<<<<< HEAD
    private List<Edge> listEdge = new ArrayList<>();
=======
    private List<Edge> listEdge = new ArrayList<Edge>();
>>>>>>> 5c138f4e2f0daa1464711446f1f07fe1571b7f9b

    public Node(String name, int posX, int posY) {
        JPanel.getDefaultLocale();
        this.name = name;
        this.posX = posX;
        this.posY = posY;
    }

    public int getDiameter() {
        return size;
    }
    public void setDiameter(int size) {
<<<<<<< HEAD
        this.size = size;
=======
        this.size=size;
>>>>>>> 5c138f4e2f0daa1464711446f1f07fe1571b7f9b
    }

    public String getName() {
        return name;
    }

    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }
<<<<<<< HEAD

    public void setPosX(int x) {
        posX = x;
    }

    public void setPosY(int y) {
        posY = y;
=======
    public void setPosX(int x) {
        posX=x;
    }

    public void setPosY(int y) {
        posY=y;
>>>>>>> 5c138f4e2f0daa1464711446f1f07fe1571b7f9b
    }

    public void addListEdge(Edge edge) {
        listEdge.add(edge);
    }

    public List<Edge> getListEdge() {
        return listEdge;
    }

    public void changeColor(Color color) {
        this.color = color;
    }

<<<<<<< HEAD
    public Node movingVertices(Point point) {
=======
    public Node moving_vertices(Point point) {
>>>>>>> 5c138f4e2f0daa1464711446f1f07fe1571b7f9b
        int center_of_the_circleX = posX + size/2;
        int center_of_the_circleY = posY + size/2;
        if (Math.sqrt(Math.pow(center_of_the_circleX - point.x, 2) + Math.pow(center_of_the_circleY - point.y, 2)) <= size/2) return this;
        else return null;
    }

}
