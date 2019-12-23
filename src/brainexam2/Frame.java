package brainexam2;

import javax.swing.JFrame;


public class Frame extends JFrame
{
	View mView;
	
	public Frame()
	{
		mView = new View();
		
		add(mView);
		
		setTitle("Game");
		setSize(600, 400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
