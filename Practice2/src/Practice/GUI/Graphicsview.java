package Practice.GUI;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;


public class Graphicsview extends JFrame {
    private JMenuBar menuBar = new JMenuBar();
    private JTextArea jTextArea;
    private JButton prevButton = new JButton("Prev");
    private JButton nextButton = new JButton("Next");
    private JButton startButton = new JButton("Start");
    private JTextField counter = new JTextField();
    private JSlider jSlider;
    private List<Node> listNode = new ArrayList<Node>();
    private Container contaner;
    public Graph graph=new Graph();
    public GraphDrawer drawer=new GraphDrawer(graph);



    public Graphicsview() {
        super("Ford–Fulkerson");
        setSize(600, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        contaner = this.getContentPane();
        contaner.setLayout(new BorderLayout());
        /**
         * menu
         */
        JMenuBar menuBar = new JMenuBar();
        menuBar.add(createHelpMenu(this));
        menuBar.add(createMenu(this));
        setJMenuBar(menuBar);
        /**
         * textArea
         */
        JPanel panelText = new JPanel(new BorderLayout());
        jTextArea = new JTextArea();
        jTextArea.setLineWrap(true);
        JScrollPane scroll = new JScrollPane(jTextArea, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        panelText.add(scroll);
        contaner.add(panelText, BorderLayout.LINE_START);
        /**
         * Slider and button
         */
        jSlider = new JSlider(JSlider.HORIZONTAL, 0, 100, 0);
        JPanel panelSlider = new JPanel();
        jSlider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {

            }
        });
        panelSlider.add(jSlider);
        prevButton.addActionListener(new PrevCommand());
        panelSlider.add(prevButton);
        counter.setPreferredSize(new Dimension(30, 30));
        panelSlider.add(counter);
        nextButton.addActionListener(new NextCommand());
        panelSlider.add(nextButton);
        contaner.add(panelSlider, BorderLayout.SOUTH);
        /**
         *  button start
         */
        JPanel panelStart = new JPanel(new BorderLayout());
        startButton.addActionListener(new StartCommand());
        panelStart.add(startButton);
        contaner.add(panelStart, BorderLayout.NORTH);
        /**
         * graph
         */
        contaner.add(drawer);
    }

    private JMenu createHelpMenu(JFrame frame) {

        JMenu helpMenu = new JMenu("Help");
        JMenuItem Task = new JMenuItem("Task");
        JMenuItem About = new JMenuItem("About");
        helpMenu.add(Task);
        helpMenu.addSeparator();
        helpMenu.add(About);
        Task.addActionListener(new ActionListener() {
            JDialog dialog = new HelpMenuTask(frame);

            public void actionPerformed(ActionEvent event) {
                if (dialog == null) // в первый раз
                    dialog = new HelpMenuTask(frame);
                dialog.setVisible(true); // отобразить диалог
            }
        });
        About.addActionListener(new ActionListener() {
            JDialog dialog = new HelpMenuAbout(frame);

            public void actionPerformed(ActionEvent event) {
                if (dialog == null) // в первый раз
                    dialog = new HelpMenuAbout(frame);
                dialog.setVisible(true); // отобразить диалог
            }
        });

        return helpMenu;
    }

    private JMenu createMenu(JFrame frame) {
        JMenu menu = new JMenu("Menu");
        JMenuItem file = new JMenuItem("File");
        JMenuItem random = new JMenuItem("Random");
        menu.add(file);
        menu.addSeparator();
        menu.add(random);
        file.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        random.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        return menu;
    }


}
