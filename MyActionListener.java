import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;

public class MyActionListener implements ActionListener{
    
    Welcome_Frame wf;
    MyFrame1 mf1;

    MyActionListener(Welcome_Frame f)
    {
        this.wf = f;
    }

    MyActionListener(MyFrame1 f)
    {
        this.mf1 = f;
    }

    public void actionPerformed(ActionEvent e)
	{
        if(e.getActionCommand().equals("Let's begin!"))
		{
			mf1 = new MyFrame1();
			this.mf1.setVisible(true);
			this.wf.setVisible(false);
		}
    }
}
