package bibleSystem;

import java.util.LinkedList;
import java.util.HashMap;


/**
 * <header><b>Entry</b></header>
 * <body>
 * 	This is the representation of certain entries to be kept in the Bible
 * 	<p>
 * 	Each entry is a name with collection of tags connected to it. <br>
 * 	The intention is for Entries to be shown in the Bible as:
 * 	<p>
 * 	<b>Entry Name</b>
 * 	<UL>
 * 		<LI> 
 *     		<b>label:</b> 
 *     		<br>description 
 * 		</LI>
 * 		<LI>
 *     		<b>second label:</b> 
 *     		<br>description
 * 		</LI>
 * 		<LI> 
 * 			... 
 * 		</LI>
 * 	</UL>
 * Later on images could be a potential to be shown but the minimum <br>
 * viable product is the goal for now
 * </body>
 * 
 * <hr>
 * @see Tag
 * @see Bible
 * 
 * @author Angelo
 * @version 2017-11-24
 */
public class Entry 
{
	private String title;
	
	private LinkedList<Tag> tags = new LinkedList<>();
	
	public Entry(String title)
	{
		this.title = title;
	}
	
	////////////////////
	//Utility
	////////////////////
	/**
	 * <header><b>Utility Method - addTag()</b></header>
	 * <body>
	 * This method attempts to add Tag <i>t</i> to an Entry's <i>tags</i> list which can result in two outcomes. <br>
	 * <u>Either:</u> 
	 * <OL>
	 * <LI> 
	 * 		The Tag being added <b>does not</b> share a TagLabel with any of the other Tags the <br>
	 *      Entry may have and gets added successfully
	 * </LI>
	 * <LI>
	 *      The Tag being added <b>does</b> share a TagLabel with another Tag on the object and <br>
	 *      the process is aborted with a message printed to the console
	 * </LI>
	 * </OL>
	 * </body>
	 * 
	 * <hr>
	 * @param t - Tag attempting to be added to the Entry
	 */
	public void addTag(Tag t)
	{
		
		//No duplicates
		if(hasTag(t.getLabel()))
		{
			System.out.println("Entry '" + title + "' already has a tag with this label("+ t.getLabel() +"). Aborted");
			return;
		}
		//No duplicates
		
		this.tags.add(t);
	}
	/**
	 * <header><b>Utility Method - getTagAt(int i)</b></header>
	 * <body>
	 * This method returns the Tag at index i of the <i>tags</i> list <br>
	 * </body>
	 * 
	 * <hr>
	 * @param i - index at which the Tag desired is being stored
	 * @return Tag at index i
	 */
	public Tag getTagAt(int i)
	{
		return this.tags.get(i);
	}
	/**
	 * <header><b>Utility Method - getTagList()</b></header>
	 * <body>
	 * This method returns all Tags an Entry has as a LinkedList
	 * </body>
	 * 
	 * <hr>
	 * @return LinkedList< Tag >
	 */
	public LinkedList<Tag> getTagList()
	{
		return this.tags;
	}
	/**
	 * <header><b> Utility Method - getNumOfTags()</b></header>
	 * <body>
	 * This method returns the number of Tags an Entry has
	 * </body>
	 * 
	 * <hr>
	 * @return int
	 */
	public int getNumOfTags()
	{
		return this.tags.size();
	}
	/**
	 * <header><b> Utility Method - hasTag(TagLabel lb)</b></header>
	 * <body>
	 * This method returns true if an Entry has a Tag with lb as a TagLabel
	 * </body>
	 * 
	 * <hr>
	 * @see TagLabel
	 * @param lb - TagLabel being checked
	 * @return boolean
	 */
	public boolean hasTag(TagLabel lb)
	{
		for(Tag t: tags)
		{
			if(t.getLabel() == lb)
				return true;
		}
		//else
		return false;
	}
	/**
	 * <header><b> Test Method - testPrintTags()</b></header>
	 * <body>
	 * This method is just a temporary method meant to test if the Tag system was working
	 * </body>
	 */
	public void testPrintTags()
	{
		System.out.println(title + ":");
		for(Tag t: tags)
		{
			System.out.println(t.getLabel() + " - " + t.getDescription());
		}
	}
	
	////////////////////
	//Getters & Setters
	////////////////////
	public String getTitle()
	{
		return this.title;
	}
	public void setTitle(String title)
	{
		this.title = title;
	}
} 
