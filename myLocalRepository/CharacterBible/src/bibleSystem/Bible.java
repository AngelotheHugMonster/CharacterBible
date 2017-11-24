package bibleSystem;

import java.util.LinkedList;

public class Bible 
{
	private LinkedList<Entry> entries = new LinkedList<>();
	
	public Bible()
	{
	}
	
	////////////////////
	//Utility
	////////////////////
	public void addEntry(Entry e)
	{
		entries.add(e);
	}
	public Entry getEntryAt(int i)
	{
		return entries.get(i);
	}
	
	////////////////////
	//Test Methods
	////////////////////
	public void testPrint()
	{
		for(Entry e: entries)
		{
			e.testPrintTags();
		}
	}
}
