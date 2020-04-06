package OopConcept;

public class AmazonWebTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AmazonWebPage aw = new AmazonWebPage();
		AmazonWebPage aw1 = new AmazonWebPage("Global Shopping", "amazon global" );
		System.out.println(aw1.header + ", " + aw1.title);
		AmazonWebPage aw3 = new AmazonWebPage("India Shopping"," amazon India","privacy policy");
		System.out.println(aw3.header + " " +aw3.title + " " +aw3.footer);
	}

}
