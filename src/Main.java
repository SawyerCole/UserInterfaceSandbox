/**
 * Created by ros_rcsoyama on 5/11/2017.
 */
import javax.swing.JFrame;
import javax.swing.JButton;

import java.awt.FlowLayout;
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
        setLayout(new FlowLayout());

        //makes a new button
        JButton loadButton = new JButton("Load");

        //Creates the button onto the UI
        add(loadButton);
    }
       @Override
    public void actionPerformed(ActionEvent actionEvent) {
           System.out.print("Aye good job");
    }
}
