package OopConcept;

public class Encap_1 {
	//scope of private variable is limited to class
	private String name;
	private int totalEmp;
	private String ceoName;
	private String policy;
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getTotalEmp() {
		return totalEmp;
	}
	public void setTotalEmp(int totalEmp) {
		this.totalEmp = totalEmp;
	}
	
	public String getCeoName() {
		return ceoName;
	}
	public void setCeoName(String ceoName) {
		this.ceoName = ceoName;
	}
	
	public String getPolicy() {
		return policy;
	}
	public void setPolicy(String policy) {
		this.policy = policy;
	}
	
 
	//============================================
	
	public void launchBrowser()
	{
		System.out.println("launching Browser");
		checkOS();
		checkingRAMAllocted();
	}
	
	private void checkOS()
	{
		System.out.println("Checking OS");
	}
	
	private void checkingRAMAllocted()
	{
		System.out.println("checking RAM");
	}
	
	

}
