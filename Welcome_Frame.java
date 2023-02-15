import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.lang.*;
import javax.swing.JFrame;

// import javafx.scene.paint.Color;

public class Welcome_Frame extends JFrame{
    
    Label l1,l2,l3;
    Button b1;
    MyActionListener ml = new MyActionListener(this);

    Color c1 = new Color(176, 124, 218);
    Welcome_Frame()
    {
        super("Welcome");

        setLayout(null);
        setBounds(0,0,2000,1100);
        ml = new MyActionListener(this);

        l1 = new Label("Welcome");
		l2 = new Label("To Probability");
		l3 = new Label("Of Dice Prob");
		b1 = new Button("Let's begin!");

        l1.setBounds(865,250,500,100);
		l2.setBounds(808,350,600,100);
		l3.setBounds(825,450,500,100);
		b1.setBounds(810,600,350,60);

        Font f1 = new Font("Times",Font.BOLD,50);
		Font f2 = new Font("Times",Font.BOLD,40);
		l1.setFont(f1);
		l2.setFont(f1);
		l3.setFont(f1);
		b1.setFont(f2);
		
		add(l1);
		add(l2);
		add(l3);
		add(b1);
		
		b1.addActionListener(ml);

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