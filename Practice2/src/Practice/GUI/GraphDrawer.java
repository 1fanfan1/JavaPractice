package Practice.GUI;

import javax.swing.*;
import java.awt.*;
<<<<<<< HEAD
=======
import java.awt.event.*;
>>>>>>> 5c138f4e2f0daa1464711446f1f07fe1571b7f9b

public class GraphDrawer extends JPanel {
    Graph graph;
    NodeDrawer nodeDrawer;
    EdgeDrawer edgeDrawer;
    Node node = null;

    public GraphDrawer(Graph _graph) {
        graph = _graph;
        nodeDrawer = new NodeDrawer(graph);
        edgeDrawer = new EdgeDrawer(graph);
<<<<<<< HEAD
        //addMouseMotionListener(new MyMove());
        //addMouseListener(new MyMouse());
        //addMouseWheelListener(new MyMouse());
=======
        addMouseMotionListener(new MyMove());
        addMouseListener(new MyMouse());
        addMouseWheelListener(new MyMouse());
>>>>>>> 5c138f4e2f0daa1464711446f1f07fe1571b7f9b
    }

    @Override
    public void paint(Graphics g) {
        edgeDrawer.paint(g);
        nodeDrawer.paint(g);
<<<<<<< HEAD
    }

    public Node movingVertices(Point point) {
        for (Node _node : graph.getNodes()) {
            if (_node.movingVertices(point) != null)
                return _node;
=======

    }

    public Node moving_vertices(Point point) {
        for (Node elm : graph.getNodes()) {
            if (elm.moving_vertices(point) != null)
                return elm;
>>>>>>> 5c138f4e2f0daa1464711446f1f07fe1571b7f9b
        }
        return null;
    }

<<<<<<< HEAD
//    private class MyMouse extends MouseAdapter {
//        @Override
//        public void mousePressed(MouseEvent e) {
//            if (e.getButton() == MouseEvent.BUTTON1)
//                node = movingVertices(e.getPoint());
//        }
//
//        @Override
//        public void mouseWheelMoved(MouseWheelEvent e) {
//            System.out.println("in");
//            //Zoom in
//            if (e.getWheelRotation() > 0) {
//                for (Node node : graph.getNodes()) {
//                    node.setPosX((int) (node.getPosX() * 1.2));
//                    node.setPosY((int) (node.getPosY() * 1.2));
//                    node.setDiameter((int) (node.getDiameter() * 1.2));
//
//                }
//                repaint();
//
//            }
//            //Zoom out
//            if (e.getWheelRotation() < 0) {
//                for (Node node : graph.getNodes()) {
//                    if (node.getDiameter() > 2) {
//                        node.setPosX((int) (node.getPosX() / 1.2));
//                        node.setPosY((int) (node.getPosY() / 1.2));
//                        node.setDiameter((int) (node.getDiameter() / 1.2));
//                    }
//
//                }
//                repaint();
//            }
//        }
//    }
//
//    private class MyMove implements MouseMotionListener {
//
//        public void mouseDragged(MouseEvent e) {
//            if (node != null) {
//                node.setPosY(e.getY());
//                node.setPosX(e.getX());
//                repaint();
//            }
//        }
//
//        public void mouseMoved(MouseEvent e) {
//
//        }
//
//    }
=======
    private class MyMouse extends MouseAdapter {
        @Override
        public void mousePressed(MouseEvent e) {
            if (e.getButton() == MouseEvent.BUTTON1)
                node = moving_vertices(e.getPoint());
        }

        @Override
        public void mouseWheelMoved(MouseWheelEvent e) {
            System.out.println("in");
            //Zoom in
            if (e.getWheelRotation() > 0) {
                for (Node node : graph.getNodes()) {
                    node.setPosX((int) (node.getPosX() * 1.2));
                    node.setPosY((int) (node.getPosY() * 1.2));
                    node.setDiameter((int) (node.getDiameter() * 1.2));

                }
                repaint();

            }
            //Zoom out
            if (e.getWheelRotation() < 0) {
                for (Node node : graph.getNodes()) {
                    if (node.getDiameter() > 2) {
                        node.setPosX((int) (node.getPosX() / 1.2));
                        node.setPosY((int) (node.getPosY() / 1.2));
                        node.setDiameter((int) (node.getDiameter() / 1.2));
                    }

                }
                repaint();
            }
        }
    }

    private class MyMove implements MouseMotionListener {

        public void mouseDragged(MouseEvent e) {
            if (node != null) {
                node.setPosY(e.getY());
                node.setPosX(e.getX());
                repaint();
            }
        }

        public void mouseMoved(MouseEvent e) {

        }

    }
>>>>>>> 5c138f4e2f0daa1464711446f1f07fe1571b7f9b
}
