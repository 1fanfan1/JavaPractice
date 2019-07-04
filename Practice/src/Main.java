import Practice.GUI.*;

public class Main {
    public static void main(String[] args) {
        Graphicsview app = new Graphicsview();
        app.setVisible(true);
        Node node1 = new Node("123", 10, 10);
        Node node2 = new Node("456", 100, 100);
        Node node3 = new Node("678", 80, 80);
        Node node4 = (new Node("567", 150, 150));

        app.addNode(node1);
        app.addNode(node2);
        app.addNode(node3);
        app.addNode(node4);
        app.addEdge(new Edge(node1, node2, 10, 10));

    }
}
