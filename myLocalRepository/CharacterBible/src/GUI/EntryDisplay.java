package GUI;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import bibleSystem.*;

public class EntryDisplay extends JFrame
{
	////////////////////
	//Class Variables
	////////////////////
	//Information
	private static Bible b = new Bible();
	private static Entry currentEntry;
	//GUI - Menu
	private static JMenuBar menuBar;
	private static JMenu menuEntry, menuTag; //Menus for Entries and Tags
		//Entry Menu
		private static JMenuItem buttonAddEntry;
		private static JSeparator separatorEntryMenu;
		//Tag Menu
		private static JMenuItem buttonAddTag;
		private static JSeparator separatorTagMenu;
	//GUI - Display
	private static JTextPane entryPane, tagPane; //Panes for showing current Entry and Tag
	private static JTextArea descArea;
	
	
	public EntryDisplay()
	{
		getContentPane().setBackground(new Color(128, 128, 128));
		////////////////////
		//Menu stuff
		////////////////////
        menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        
        menuEntry = new JMenu("Entries");
        menuBar.add(menuEntry);
        
        
        
        menuTag = new JMenu("Tags");
        menuBar.add(menuTag);
        
        //
        updateEntryMenu();
        //
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("EntryDisplay");      
        this.setSize(200,222);
        this.setLocationRelativeTo(null);
        this.getContentPane().setLayout(null);
        
        ////////////////////
        //Display stuff
        ////////////////////
        entryPane = new JTextPane();
        entryPane.setBackground(new Color(192, 192, 192));
        entryPane.setBounds(10, 10, 75, 16);
        entryPane.setEditable(false);
        getContentPane().add(entryPane);
        
        tagPane = new JTextPane();
        tagPane.setBackground(new Color(192, 192, 192));
        tagPane.setBounds(10, 38, 125, 16);
        tagPane.setEditable(false);
        getContentPane().add(tagPane);
        
        descArea = new JTextArea();
        descArea.setEditable(false);
        descArea.setBounds(10, 66, 180, 106);
        getContentPane().add(descArea);
        this.setVisible(true);
	}
	
	
	public static void main(String[] args) 
	{
		initBible();
		new EntryDisplay();
	}
	
	////////////////////
	//Private Use Methods
	////////////////////
	private static void initBible()
	{
		Entry e1 = new Entry("Angelo");
			Tag t1a = new Tag(TagLabel.AFFLIATION, "Marine");
			Tag t1b = new Tag(TagLabel.DATE_OF_BIRTH, "October 3rd, 2000");
		Entry e2 = new Entry("Alexander");
			Tag t2a = new Tag(TagLabel.AFFLIATION, "Courier");
			Tag t2b = new Tag(TagLabel.DATE_OF_BIRTH, "UNKNOWN");
		Entry e3 = new Entry("Alice");
			Tag t3a = new Tag(TagLabel.AFFLIATION, "Courier");
			Tag t3b = new Tag(TagLabel.DATE_OF_BIRTH, "August 25th, 1998");
		e1.addTag(t1a);
		e1.addTag(t1b);
		e2.addTag(t2a);
		e2.addTag(t2b);
		e3.addTag(t3a);
		e3.addTag(t3b);
		
		b.addEntry(e1);
		b.addEntry(e2);
		b.addEntry(e3);
	}
	private static void updateEntryMenu()
	{
		menuEntry.removeAll(); //wipes it
		
		//1st half of Menu
		buttonAddEntry = new JMenuItem("Add Entry");
		buttonAddEntry.addActionListener
		(
			new ActionListener()
			{
				public void actionPerformed(ActionEvent AE)
	        		{
	        			b.addEntry(new Entry("TESTING ADD FEATURE"));
	        			updateEntryMenu();
	        			updateTagMenu();
	        		}
			}
		);
        menuEntry.add(buttonAddEntry);
        
        separatorEntryMenu = new JSeparator();
        menuEntry.add(separatorEntryMenu);
		
		//2nd half of Menu
		for(Entry e: b.getEntryList())
		{
			JMenuItem m = new JMenuItem();
			m.setText(e.getTitle());
			m.addActionListener //MULTI-LINE STATEMENT
			(
				new ActionListener() 
				{
			        	public void actionPerformed(ActionEvent AE)
			        	{
			        		wipeFields();
			        		
			        		currentEntry = e;
			        		entryPane.setText(currentEntry.getTitle());
			        		tagPane.setText("Pick Tag");
			        		descArea.setText("");
			        		
			        		updateTagMenu();
			        	}
			     }	
			); //END OF MULTI-LINE STATEMENT
			
			menuEntry.add(m);
		}
	}
	private static void updateTagMenu()
	{
		menuTag.removeAll();
		
		//1st half of Menu
				buttonAddTag = new JMenuItem("Add Tag");
				buttonAddTag.addActionListener
				(
					new ActionListener()
					{
						public void actionPerformed(ActionEvent AE)
			        		{
			        			currentEntry.addTag(new Tag(TagLabel.LOCATION, "TESTING ADD FEATURE"));
			        			
			        			updateEntryMenu();
			        			updateTagMenu();
			        		}
					}
				);
		        menuTag.add(buttonAddTag);
		        
		        separatorTagMenu = new JSeparator();
		        menuTag.add(separatorTagMenu);
		
		//2nd half of Menu
		for(Tag t: currentEntry.getTagList())
		{
			JMenuItem m = new JMenuItem();
			m.setText(t.getLabel().toString());
			m.addActionListener //MULTI-LINE STATEMENT
			(
				new ActionListener() 
				{
			        	public void actionPerformed(ActionEvent AE)
			        	{
			        		wipeFields();
			        		
			        		entryPane.setText(currentEntry.getTitle());
			        		tagPane.setText(t.getLabel().toString());
			        		descArea.setText(t.getDescription());
			        	}
			     }	
			); //END OF MULTI-LINE STATEMENT
			
			menuTag.add(m);
		}
	}
	private static void wipeFields()
	{
		entryPane.setText("");
		tagPane.setText("");
		descArea.setText("");
	}
}
