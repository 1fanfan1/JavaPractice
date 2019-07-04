package Practice.GUI;

import javax.swing.*;
import java.awt.*;

public class NodeDrawer extends JPanel {

    Graph graph;
    /**
     * saves reference on graph
     */
    public NodeDrawer(Graph _graph){
        graph = _graph;
    }

    /**
     * draws all graph nodes
     */
    @Override
    public void paint(Graphics g) {
        for (Node node : graph.nodes) {

            g.setColor(Color.BLUE);
            g.drawOval(node.getPosX(), node.getPosY(), node.getDiameter(), node.getDiameter());
            g.setFont(new Font("Arial", Font.BOLD, 12));
            g.drawString(node.getName(), node.getPosX() + 5, node.getPosY() + 18);
        }
    }
}
