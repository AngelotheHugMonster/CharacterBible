package bibleSystem;

/**
 * <header><b> Tag </b></header>
 * <body>
 * 	This is the way information is stored in Entries, 
 * 	<p>
 * 	Entries are just a name and an empty bag,<br>
 * 	Tags are blocks of info that can fill that bag.
 * 	<p>
 * 	Each Tag is composed of: 
 * 	<OL>
 * 		<LI>
 * 			A TagLabel (To serve as a header when it's displayed and to prevent duplicates)
 * 		</LI>
 * 		<LI>
 * 			A "description" (To hold a block of text for information)
 * 		</LI>
 * 	</OL>
 * </body>
 * 
 * <hr>
 * @see TagLabel
 * @see Entry
 * @author Angelo
 * @version 2017-11-24
 */
public class Tag
{
	private TagLabel label;
	private String desc;
	
	public Tag(TagLabel label, String desc)
	{
		this.label = label;
		this.desc = desc;
	}
	
	////////////////////
	//Getters
	////////////////////
	public TagLabel getLabel()
	{
		return this.label;
	}
	public String getDescription()
	{
		return this.desc;
	}
}
