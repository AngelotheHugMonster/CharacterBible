package bibleSystem;

/**
 * <header><b>TagLabel</b></header>
 * <body>
 * This is an enumeration holding specified names for tags to be used in the <i>Tag</i> class
 * </body>
 * 
 * <p>
 * The current list of labels so far is:
 * <UL>
 * <LI> <b> AFFLIATION </b> </LI>
 * <LI> <b> LOCATION </b> </LI>
 * <LI> <b> DATE_OF_BIRTH </b> </LI>
 * <LI> <b> DATE_OF_CREATION </b> </LI>
 * <LI> <b> DATE_OF_DEATH </b> </LI>
 * </UL>
 * Keep in mind the number of labels will grow as this is just the minimum amount needed to create a working product
 * <hr>
 * @see Tag
 * 
 * @author Angelo Arriaga
 * @version 2017-11-24
 */
public enum TagLabel 
{
	AFFLIATION,
	LOCATION,
	DATE_OF_BIRTH,
	DATE_OF_CREATION,
	DATE_OF_DEATH
}
