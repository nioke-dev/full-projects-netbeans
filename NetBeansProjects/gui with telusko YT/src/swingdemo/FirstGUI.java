package swingdemo;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class FirstGUI {
    public static void main(String[] args) {
        Abc obj = new Abc();
        
    }
}
class Abc extends JFrame//cardLayot
{    
        public Abc ()
        {           
            
            JLabel l = new JLabel("hello world");
            JLabel ll = new JLabel("welcome navin");
            
            add(l);
            add(ll);
            
            
            setLayout(new FlowLayout());
            setVisible(true);
            setSize(400, 400);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }           
}