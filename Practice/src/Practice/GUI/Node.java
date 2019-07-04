package Practice.GUI;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Node extends JPanel {
    private Color color = Color.BLUE;
    private int posX;
    private int posY;
    private int size = 30;
    private String name;
    private List<Edge> listEdge = new ArrayList<Edge>();

    public Node(String name, int posX, int posY) {
        JPanel.getDefaultLocale();
        this.name = name;
        this.posX = posX;
        this.posY = posY;
    }

    ////////////////////////////////////////////
    ////////////////////////////////////////////
    // УДАЛИ ОТСЮДА paint и из Edge тоже ///////
    ////////////////////////////////////////////
    ////////////////////////////////////////////

    @Override
    public void paint(Graphics g) {

        g.setColor(Color.BLUE);
        g.drawOval(posX, posY, size, size);
        g.setFont(new Font("Arial", Font.BOLD, 12));
        g.drawString(name, posX + 5, posY + 18);
    }

    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }

    public int getDiameter() { return size; }

    public String getName() { return name; }

    public void addListEdge(Edge edge) {
        listEdge.add(edge);
    }

    public List<Edge> getListEdge() {
        return listEdge;
    }

    public void changeColor(Color color) {
        this.color = color;
    }

}
