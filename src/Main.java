/**
 * Created by ros_rcsoyama on 5/11/2017.
 */
import javax.swing.JFrame;
import javax.swing.JButton;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


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
        setLayout(new BorderLayout());

        /*
        (this is for above)
         FlowLayout
         GridBagLayout
         GridLayout (row,column)
         BorderLayout ( add(button, BorderLayout.WEST)CENTER)
         */

        //makes a new button
        JButton loadButton = new JButton("Load");
        JButton CreateButton = new JButton("Create");

        //makes the action listener peramiters this
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
