public class TocEntry
{


 // Specify the needed methods
private String chapter;
private int page;


	public TocEntry()
	{
	chapter = new String("NULL");
	page = 0;
		
	}

	public TocEntry(String tocchapter, int pg)
	{
	chapter = tocchapter;
	page = pg;
	}

	
	public String toString()
	{
		int chapterLength = chapter.length();
		int pageLength = Integer.toString(page).length();
		int lineLength = 60;
		
		for (int i = 0; i <= (lineLength - chapterLength - pageLength); i++)
		{
			chapter = chapter.concat(".");
		}
		
	return (chapter + page);
	}

}  
 
 