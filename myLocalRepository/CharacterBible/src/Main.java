import java.awt.*;

import GUI.*;
import bibleSystem.*;

/**
 * <b> PROJECT </b> - CharacterBible
 * <header> <b>Purpose:</b> </header>
 * <body> 
 * To create a tool that'll make it easy to organize everything about a story or novel. <br>
 * From the characters, to the locations, to the different groups and their relationships <br> 
 * </body>
 * 
 * <hr>
 * @author Angelo Arriaga
 * @version 2017-11-24
 */
public class Main 
{
	public static Graphics g;
	
	public static void main(String[] args)
	{
		//testTags();
		//testJListExample();
		testBible();
	}
    
	
	
	////////////////////
	//Test Methods
	//
	//Methods meant to show some functionality
	////////////////////
	/**
	 * <header><b>Test Method - testTags()</b></header>
	 * <body>
	 * This Method is just to demonstrate the functionality of the <i>Tag</i> class and how it's used <br>
	 * in conjunction with the <i>Entry</i> class
	 * </body>
	 * 
	 * <hr>
	 * @see Tag
	 * @see Entry
	 * @author Angelo Arriaga
	 * @version 2017-11-24
	 */
	public static void testTags()
	{
		Tag t = new Tag(TagLabel.DATE_OF_BIRTH, "October 3rd, 2000");
		Tag t1 = new Tag(TagLabel.DATE_OF_DEATH, "January 3rd, 2047");
		
		Entry ent = new Entry("Angelo");
		
		ent.addTag(t);
		ent.addTag(t1);
		
		ent.testPrintTags();
	}
	/**
	 * <header><b>Test Method - testJListExample()</b></header>
	 * <body>
	 * This Method is just to test how JMenuBars, JMenus, and JLists work together
	 * </body>
	 * 
	 * <hr>
	 * @see GUI.JListExample
	 * @author Angelo Arriaga
	 * @version 2017-11-24
	 */
	public static void testJListExample()
	{
		new JListExample();
	}
	/**
	 * 
	 */
	public static void testBible()
	{
		Bible b = new Bible();
		
		Entry eA = new Entry("Angelo");
		Tag a1 = new Tag(TagLabel.AFFLIATION, "Courier");
		Tag a2 = new Tag(TagLabel.DATE_OF_BIRTH, "October 3rd, 2000");
		Tag a3 = new Tag(TagLabel.AFFLIATION, "Marine");
		eA.addTag(a1);
		eA.addTag(a2);
		eA.addTag(a3);
		
		Entry eB = new Entry("Alice");
		Tag b1 = new Tag(TagLabel.AFFLIATION, "Courier");
		Tag b2 = new Tag(TagLabel.DATE_OF_BIRTH, "August 25th, 1998");
		eB.addTag(b1);
		eB.addTag(b2);
		
		b.addEntry(eA);
		b.addEntry(eB);
		
		b.testPrint();
	}
}
