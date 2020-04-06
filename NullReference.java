package OopConcept;

public class NullReference {

	String name;
	int age;
	
	
public NullReference(String name, int age)
{
	this.name=name;
	this.age = age;
	
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NullReference obj = new NullReference("lalo",35);
		System.out.println(obj.name + " " +obj.age );
		obj = null; // reference will get cancel and referring to null

		//System.out.println(obj.name); // we can still access name with null pointer exception
		//give null pointer exception
	}

}
