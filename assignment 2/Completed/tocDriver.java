import java.util.Scanner;

public class tocDriver
{	
	public static void main(String[] args)
	{
	Scanner input = new Scanner(System.in);
	
	final int TOCSIZE = 100;
	TocEntry toc[] = new TocEntry[TOCSIZE];
	int toc_curlen = 0; 
	
	String chapterTitle = "";

	while (!chapterTitle.equals("****"))
	{
		// input chapter title
		System.out.print("Enter Chapter Title: ");
		String title = System.console().readLine();
	
		if (title.equals("****"))
			break;
	
		// input chapter page number
		System.out.print("Enter starting page number: ");
		int pageNumber = Integer.parseInt(((System.console().readLine())));
		//int pageNumber = console.nextInt();
	
	toc[toc_curlen++] = new TocEntry(title, pageNumber);
	}
	
	//system.out.print("Enter Chapter Title: ");
	//string title = console.readLine();
	
	
	
	for (int i = 0; i < toc_curlen; i++)
		System.out.println(toc[i].toString());
}
}