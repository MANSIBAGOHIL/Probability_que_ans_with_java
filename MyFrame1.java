import java.awt.*;
import java.awt.event.*;
import java.awt.AWTEvent.*;
import javax.swing.*;
import java.lang.*;
// import javax.swing.JTextField;
// import javax.swing.JFrame;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MyFrame1 extends JFrame{
    
    //declaring components
    JTextField t1;
    Font f1;
    JRadioButton jb1,jb2,jb3,jb4;
    MyActionListener ml = new MyActionListener(this);

    Color c1 = new Color(209, 178, 234);

    //constructor
    MyFrame1()
    {
        //for frame
        super("Probability");

        setLayout(null);
        setBounds(0,0,2000,1100);

        //to initialize components 
        t1 = new JTextField();
        jb1 = new JRadioButton("A dice is thrown, what is the probability that the number obtained is a prime number -- 1/2");
        jb2 = new JRadioButton("Find the probability of throwing a total of 8 in a single throw with two dice -- 5/36");
        jb3 = new JRadioButton("If a dice is thrown twice, what is the probability of not getting a one on either throw? -- 25/36");
        // jb4 = new ("");

        ButtonGroup TLights = new ButtonGroup();
		TLights.add(jb1);
		TLights.add(jb2);
		TLights.add(jb3);

        //to add in frame
        add(t1);
        add(jb1);
        add(jb2);
        add(jb3);


        //set size for each
        t1.setBounds(100,100,450,125);

        //for font
        f1 = new Font("Arial", Font.BOLD,20);

        t1.setFont(f1);
        jb1.setFont(f1);
        jb2.setFont(f1);
        jb3.setFont(f1);

        t1.addActionListener(ml);
        jb1.addActionListener(ml);
        jb2.addActionListener(ml);
        jb3.addActionListener(ml);

        //to close the window
        addWindowListener(new WindowAdapter()
			{
				public void windowClosing(WindowEvent we)
				{
					System.exit(0);
				}
			});
		
        getContentPane().setBackground(c1);
    }
    
    public static void main(String args[])
	{
			Welcome_Frame wf = new Welcome_Frame();
			wf.setVisible(true);
	}
}
