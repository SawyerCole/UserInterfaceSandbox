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

public class Main extends JFrame implements ActionListener {

    public static void main(String[] args) {

        new Main().setVisible(true);
    }

    private Main(){
        //name of the screen
        super("Start Screen");

        //makes the size of the screen width by height
        setSize(600,600);
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
        //name of tab in bar
        JMenu file = new JMenu("STUFF");
        //shit inside of bar
        JMenuItem save = new JMenuItem("Save");
        JMenuItem load = new JMenuItem("Load");
        //makes the stuff
        file.add(save);
        file.add(load);
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
    }
       @Override
    public void actionPerformed(ActionEvent actionEvent) {
           String name = actionEvent.getActionCommand();
           //you can set .equals to .equasIgnoreCase if want
           if (name.equals("Test")) {
               System.out.println("Good shit");

           } else if (name.equals("Teeest")) {
               System.out.println("Good job");
           }
       }
}
