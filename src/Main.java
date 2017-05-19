/**
 * Created by ros_rcsoyama on 5/11/2017.
 */
import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import java.awt.Graphics;

public class Main extends JFrame implements ActionListener {

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (Exception evt) {}

        JFrame f = new JFrame("Text Field Examples");
        f.getContentPane().setLayout(new FlowLayout());
        f.getContentPane().add(new JTextField("Text field 1"));
        f.getContentPane().add(new JTextField("Text field 2", 8));
        JTextField t = new JTextField("Text field 3", 8);
        t.setHorizontalAlignment(JTextField.RIGHT);
        f.getContentPane().add(t);
        t = new JTextField("Text field 4", 8);
        t.setHorizontalAlignment(JTextField.CENTER);
        f.getContentPane().add(t);
        f.getContentPane().add(new JTextField("Text field 5", 3));

        f.pack();
        f.setVisible(true);

        new Main().setVisible(true);
    }

    private Main(){
        //name of the screen
        super("Start Screen");

        //makes the size of the screen width by height
        setSize(1000,1000);
        setResizable(false);

        //When you close the frame, end code
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        /*
        (this is for above)
         FlowLayout
         GridBagLayout
         GridLayout (row,column)
         BorderLayout ( add(button, BorderLayout.WEST)CENTER)
         */

        //makes a new button
        JButton loadButton = new JButton("blank1");
        JButton CreateButton = new JButton("blank2");

        //menu bar

        JMenuBar bar = new JMenuBar();
        //name of the tab on bar
        JMenu file = new JMenu("STUFF");
        //shit inside of menu in the tab
        JMenuItem save = new JMenuItem("Save");
        JMenuItem load = new JMenuItem("Load");
        JMenuItem exit = new JMenuItem("Exit");

        Drawing oval = new Drawing();
        file.add(oval);


        //closes shit
        exit.addActionListener((ActionEvent actionEvent) -> {
            System.out.println("Closed");
            System.exit(0); });

        //making button
        JMenuItem extra = new JMenu("Extra");
        JMenuItem hello = new JMenuItem("hey");
        JMenuItem hello2 = new JMenuItem("hey yo");


        //add text
        JLabel label1 = new JLabel("KILLME");
        //make the shit inside the tab
        file.add(save);
        file.add(load);
        file.add(extra);
        file.addSeparator();
        file.add(exit);
        //makes the thing inside of the "extra" tab inside of the "stuff" tab
        extra.add(hello);
        extra.add(hello2);
        //makes the tab inside the bar
        bar.add(file);
        setJMenuBar(bar);

        //makes the action listener parameters this
        loadButton.setActionCommand("Test");
        CreateButton.setActionCommand("Teeest");


        //makes the button work
        loadButton.addActionListener(this);
        CreateButton.addActionListener(this);

        //Creates the button onto the UI
        add(loadButton);
        add(CreateButton);

      add(label1);
    }



       @Override
    public void actionPerformed(ActionEvent actionEvent) {
           String name = actionEvent.getActionCommand();
           //you can set .equals to .equalsIgnoreCase if want
           if (name.equals("Test")) {
               System.out.println("Good shit");

           } else if (name.equals("Teeest")) {
               System.out.println("Good job");
           } else if (name.equalsIgnoreCase("exit")) {
                System.out.println("Closed");
                System.exit(0);
           }
       }
}

    class Drawing extends JPanel {
        public void paint(Graphics g) {
            setSize(300,300);
            //Graphics2D g2d = (Graphics2D) g;
            g.setColor(Color.BLACK);
            g.fillOval(100,100,100,100);

        }
    }

