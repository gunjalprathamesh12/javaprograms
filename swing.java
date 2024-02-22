
//import the swing package
import javax.swing.*;

//create a class that extends JFrame
public class swing extends JFrame {

    // create a constructor
    public swing() {
        // set the title of the frame
        setTitle("Simple Swing Example");
        // set the size of the frame
        setSize(300, 200);
        // set the default close operation
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // create a button
        JButton button = new JButton("Click Me");
        // create a label
        JLabel label = new JLabel("Hello, example using java swing");
        // add the button and the label to the frame
        add(button, "South");
        add(label, "Center");
        // make the frame visible
        setVisible(true);
    }

    // main method
    public static void main(String[] args) {
        // create an instance of the class
        swing ss = new swing();
    }
}
