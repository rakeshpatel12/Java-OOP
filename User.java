package OopConcept;

public class User {
	
	String name;
	int age;
	long phno;
	String address;
	char gender;
	
//Constructor name same as class name
//Constructor never return anything
//constructor can be overloaded 
// Constructor get called when object is created.
	
public User()//0 Parameter Constructor also called default constructor
{
	System.out.println("Default const");
}

public User(String name, int age) {
		
		this.name = name;
		this.age = age;
	}

	public User(String name, int age, long phno, String address, char gender) {
		
		this.name = name;
		this.age = age;
		this.phno = phno;
		this.address = address;
		this.gender = gender;
	}


	

	public static void main(String[] args) {

		User u1 = new User("Abc",25);
		User u2 = new User("Raj",28,989812,"Gujarat, India",'M');
		System.out.println(u1.name +" " +u1.age);
		System.out.println(u2.name + " "+u2.age+ " "+u2.phno+ " "+u2.address+ " "+u2.gender);
		

		
		
	}

}
