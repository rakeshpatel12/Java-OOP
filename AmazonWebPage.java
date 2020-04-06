package OopConcept;

public class AmazonWebPage {
	
	String header;
	String title;
	String footer;
	
	public AmazonWebPage()
	{
		System.out.println("Welcome to Amazon");
	}

	public AmazonWebPage(String header, String title, String footer) 
	{
		this.header = header;
		this.title = title;
		this.footer = footer;
	}

	public AmazonWebPage(String header, String title)
	{
		this.header = header;
		this.title = title;
	}



}
