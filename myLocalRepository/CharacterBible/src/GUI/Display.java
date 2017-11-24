package GUI;

import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Display extends JFrame
{
	private final Dimension DEFAULT_DIMENSION = new Dimension(300,300);
	
	JFrame f;
	JPanel p;
	
	public Display()
	{
		f = new JFrame();
		
		f.setTitle("Display");
		f.setSize(DEFAULT_DIMENSION);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		p = new TestPanel();
		f.add(p);
		f.setVisible(true);
		f.pack();
	}
	
	///////////////////////////
	//Utility
	///////////////////////////
	public JPanel getPanel()
	{
		return this.p;
	}
	public void clear()
	{
		p.getGraphics().setColor(Color.BLACK);;
		p.getGraphics().clearRect(0, 0, 300, 300);;
	}
	
	
	
	///////////////////////////
	//TEST PANEL SECTIONS
	//
	//
	///////////////////////////
	class TestPanel extends JPanel
	{
		public TestPanel()
		{
			f.setPreferredSize(DEFAULT_DIMENSION);
		}
		
		@Override
		public void paintComponent(Graphics g)
		{
			g.drawRect(125, 125, 50, 50);
		}
	}
	
}
