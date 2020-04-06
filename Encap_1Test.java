package OopConcept;

public class Encap_1Test {

	public static void main(String[] args) {

		Encap_1 e1 = new Encap_1();
		e1.setName("Microsoft");
		e1.setCeoName("Sundar");
		e1.setTotalEmp(5000);
		e1.setPolicy("Financial");
		
		System.out.println(e1.getName());
		System.out.println(e1.getCeoName());
		System.out.println(e1.getTotalEmp());
		System.out.println(e1.getPolicy());
		System.out.println("===========");
		e1.launchBrowser();
	}	

}
