package Ui;

import Controller.GraphDrawer;
import Model.Edge;
import Model.FordFulkerson;
import Model.Graph;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.LinkedList;

public abstract class ButtonCommand implements ActionListener {
    public abstract void actionPerformed(ActionEvent e);
}

class StartCommand extends ButtonCommand {
     FordFulkerson algorithm;
     Graphicsview frame;
     public   StartCommand(Graph graph, GraphDrawer drawer, Graphicsview frame){
         algorithm=new FordFulkerson(graph,drawer);
         this.frame=frame;

     }
    public void actionPerformed(ActionEvent e) {
        frame.goToStart.setEnabled(true);
        frame.goToEnd.setEnabled(true);
        frame.nextButton.setEnabled(true);
        frame.prevButton.setEnabled(true);
        frame.startButton.setEnabled(false);
        algorithm.graphToMatrix();
        int max_flow = algorithm.maxFlow(0, algorithm.result.length - 1);
        System.out.println(max_flow);
        algorithm.matrixToGraph();
       algorithm.drawer.repaint();
       algorithm.drawer.updateUI();
       frame.counter.setText("" + frame.drawer.graphList.size() + "/" + frame.drawer.graphList.size());
   }
}


class PrevCommand extends ButtonCommand {

    GraphDrawer drawer;
    JTextField counter;

    public PrevCommand(GraphDrawer drawer, JTextField counter) {
        this.drawer = drawer;
        this.counter = counter;
    }


    public void actionPerformed(ActionEvent e) {
        if (!drawer.graphList.isEmpty()) {
            if (drawer.iteration - 1 >= 0) // меняем индекс состояния в списке
                --drawer.iteration;

            drawer.setGraph(drawer.graphList.get(drawer.iteration));
            drawer.repaint();

            counter.setText("" + (drawer.iteration + 1) + "/" + drawer.graphList.size());

            drawer.setGraph(drawer.graphList.get(drawer.iteration));
            drawer.repaint();
        }
    }
}


class NextCommand extends ButtonCommand {

    GraphDrawer drawer;
    JTextField counter;

    public NextCommand(GraphDrawer drawer, JTextField counter) {
        this.drawer = drawer;
        this.counter = counter;
    }


    public void actionPerformed(ActionEvent e) {
        if (!drawer.graphList.isEmpty()){
            if (drawer.iteration + 1 < drawer.graphList.size()) // меняем индекс состояния в списке
                ++drawer.iteration;

            drawer.setGraph(drawer.graphList.get(drawer.iteration));
            drawer.repaint();

            counter.setText("" + (drawer.iteration + 1) + "/" + drawer.graphList.size());

        }
    }
}
class goToStartCommand extends ButtonCommand {

    GraphDrawer drawer;
    JTextField counter;


    public  goToStartCommand(GraphDrawer drawer, JTextField counter) {
        this.drawer = drawer;
        this.counter = counter;
    }

    public void actionPerformed(ActionEvent e) {
        if (!drawer.graphList.isEmpty()){
            drawer.setGraph(drawer.graphList.getFirst());

            drawer.iteration = 0;
            drawer.repaint();


            counter.setText("" + 1 + "/" + drawer.graphList.size());

            drawer.repaint();
        }
    }
}
class  goToEndCommand extends ButtonCommand {

    GraphDrawer drawer;
    JTextField counter;


    public  goToEndCommand(GraphDrawer drawer, JTextField counter) {
        this.drawer = drawer;
        this.counter = counter;
    }

    public void actionPerformed(ActionEvent e) {
        if (!drawer.graphList.isEmpty()){

            drawer.setGraph(drawer.graphList.getLast());
            drawer.iteration = drawer.graphList.size() - 1;
            drawer.repaint();

            counter.setText("" + drawer.graphList.size() + "/" + drawer.graphList.size());
        }
    }
}
