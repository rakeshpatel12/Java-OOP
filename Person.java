package OopConcept;

public class Person {
	
	String name;
	int age;

	public Person(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person("Tom", 34);
		Person p2 = new Person("Tim", 32);
		Person p3 = new Person("Jim",30);
		
		System.out.println(p1.name +" " +p1.age );
		System.out.println(p2.name +" " +p2.age );
		System.out.println(p3.name +" " +p3.age );
		
		System.out.println("===============");
		p2=p1;
		
		System.out.println(p1.name +" " +p1.age );
		System.out.println(p2.name +" " +p2.age );
		System.out.println(p3.name +" " +p3.age );
		System.out.println("===============");
		
		p1=p3;
		System.out.println(p1.name +" " +p1.age );
		System.out.println(p2.name +" " +p2.age );
		System.out.println(p3.name +" " +p3.age );
		System.out.println("===============");
		
	
		p3=p2;
		System.out.println(p1.name +" " +p1.age );
		System.out.println(p2.name +" " +p2.age );
		System.out.println(p3.name +" " +p3.age );
		
		
		
		
	}

}
