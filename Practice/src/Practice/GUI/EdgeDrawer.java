package Practice.GUI;

import javax.swing.*;
import java.awt.*;

public class EdgeDrawer extends JPanel {

    Graph graph;
    /**
     * saves reference on graph
     */
    public EdgeDrawer(Graph _graph){
        graph = _graph;
    }

    /**
     * draws all graph edges
     */
    @Override
    public void paint(Graphics g) {
        for (Edge edge : graph.edges) {

            g.setFont(new Font("Arial", Font.BOLD, 12));
            g.drawLine(edge.getStartNode().getPosX(), edge.getStartNode().getPosY(),
                       edge.getEndtNode().getPosX(),  edge.getEndtNode().getPosY());

            g.setFont(new Font("Arial", Font.BOLD, 12));

            g.drawString(edge.getWeight().toString() + "|",
                    (edge.getEndtNode().getPosX() + edge.getStartNode().getPosX()) / 2 - 5 - edge.getWeight().toString().length(),
                    (edge.getEndtNode().getPosY() + edge.getStartNode().getPosY()) / 2);

            g.drawString(edge.getBandwidth().toString(),
                    (edge.getEndtNode().getPosX() + edge.getStartNode().getPosX()) / 2 + 8 + edge.getBandwidth().toString().length(),
                    (edge.getEndtNode().getPosY() + edge.getStartNode().getPosY()) / 2);

        }
    }
}
