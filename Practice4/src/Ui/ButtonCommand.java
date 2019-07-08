package Ui;

import Controller.GraphDrawer;
import Model.Edge;
import Model.FordFulkerson;
import Model.Graph;

import java.awt.*;
import java.awt.event.*;
import java.util.LinkedList;

public abstract class ButtonCommand implements ActionListener {
    public abstract void actionPerformed(ActionEvent e);
}

class StartCommand extends ButtonCommand {
     FordFulkerson algorithm;
     public   StartCommand(Graph graph,GraphDrawer drawer){
         algorithm=new FordFulkerson(graph,drawer);

     }
    public void actionPerformed(ActionEvent e) {
        algorithm.graphToMatrix();
        int max_flow = algorithm.maxFlow(0, algorithm.result.length - 1);
        System.out.println(max_flow);
        algorithm.matrixToGraph();
       algorithm.drawer.repaint();
       algorithm.drawer.updateUI();
    }
}


class PrevCommand extends ButtonCommand {

    GraphDrawer drawer;

    public PrevCommand(GraphDrawer drawer){
        this.drawer = drawer;
    }

    public void actionPerformed(ActionEvent e) {
        if (!drawer.graphList.isEmpty()){
            if (drawer.iteration - 1 >= 0) // меняем индекс состояния в списке
                --drawer.iteration;

            drawer.setGraph(drawer.graphList.get(drawer.iteration));
            drawer.repaint();
        }

    }
}

class NextCommand extends ButtonCommand {

    GraphDrawer drawer;

    public NextCommand(GraphDrawer drawer){
        this.drawer = drawer;
    }

    public void actionPerformed(ActionEvent e) {
        if (!drawer.graphList.isEmpty()){
            if (drawer.iteration + 1 < drawer.graphList.size()) // меняем индекс состояния в списке
                ++drawer.iteration;

            drawer.setGraph(drawer.graphList.get(drawer.iteration));
            drawer.repaint();
        }
    }
}
class goToStartCommand extends ButtonCommand {

    GraphDrawer drawer;

    public  goToStartCommand(GraphDrawer drawer){
        this.drawer = drawer;
    }

    public void actionPerformed(ActionEvent e) {
        if (!drawer.graphList.isEmpty()){
            drawer.setGraph(drawer.graphList.getFirst());
            drawer.repaint();
        }
    }
}
class  goToEndCommand extends ButtonCommand {

    GraphDrawer drawer;

    public  goToEndCommand(GraphDrawer drawer){
        this.drawer = drawer;
    }

    public void actionPerformed(ActionEvent e) {
        if (!drawer.graphList.isEmpty()){

            drawer.setGraph(drawer.graphList.getLast());
            drawer.repaint();
        }
    }
}
