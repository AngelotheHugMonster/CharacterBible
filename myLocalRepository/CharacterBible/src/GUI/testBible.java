package GUI;

import java.awt.*;
import javax.swing.*;

import bibleSystem.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class testBible extends JFrame {
	
	Entry e1 = new Entry("Angelo");
		Tag t1a = new Tag(TagLabel.AFFLIATION, "Marine");
		Tag t1b = new Tag(TagLabel.DATE_OF_BIRTH, "October 3rd, 2000");
			
	Entry e2 = new Entry("Alice");
		Tag t2a = new Tag(TagLabel.AFFLIATION, "Courier");
		Tag t2b = new Tag(TagLabel.DATE_OF_BIRTH, "August 25th, 1998");
		
		JList<String> currentJList;
		DefaultListModel<String> currentModel = new DefaultListModel<>();
	
	public testBible() {
		e1.addTag(t1a);
		e1.addTag(t1b);
		e2.addTag(t2a);
		e2.addTag(t2b);
		
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("testBible");      
        this.setSize(200,222);
        this.setLocationRelativeTo(null);
        getContentPane().setLayout(null);
		
		currentJList = new JList<String>(currentModel);
		currentJList.setBackground(Color.LIGHT_GRAY);
		currentJList.setSize(200, 178);
		currentJList.setLocation(0, 0);
		getContentPane().add(currentJList);
        
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        
        JMenu testingMenu = new JMenu("Testing");
        menuBar.add(testingMenu);
        
        JMenuItem buttonAngelo = new JMenuItem("Show Angelo");
        buttonAngelo.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		setEntry(e1);
        	}
        });
        testingMenu.add(buttonAngelo);
        
        JMenuItem buttonAlice = new JMenuItem("Show Alice");
        buttonAlice.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		setEntry(e2);
        	}
        });
        testingMenu.add(buttonAlice);
        
        JMenu miscMenu = new JMenu("Misc");
        menuBar.add(miscMenu);
        
        JMenuItem buttonExit = new JMenuItem("Exit");
        buttonExit.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		System.exit(JFrame.EXIT_ON_CLOSE);
        	}
        });
        miscMenu.add(buttonExit);
        this.setVisible(true);
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new testBible();
            }
        });

	}
	
	private void setEntry(Entry e)
	{
		currentModel.clear();
		
		currentModel.addElement(e.getTitle());
		for(int i=0; i<e.getNumOfTags(); i++)
		{
			currentModel.addElement(e.getTagAt(i).getDescription());
		}
	}
}
