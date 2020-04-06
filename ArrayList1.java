package OopConcept;

import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {
		// Find largest string in Array List
		
		ArrayList<String> ar =  new ArrayList<>();
		
		ar.add("Baroda");
		ar.add("Anand");
		ar.add("Delhi");
		ar.add("Bombay");
		ar.add("Rajasthan");
		ar.add("Banglore");

		int len=0;
		int j=0;
		for(int i=0;i<ar.size();i++)
		{
			if(ar.get(i).length()>len)
			{
				len=ar.get(i).length();
				 j = i;
			}
				
			
		}
			
		System.out.println(ar.get(j) + " " + len);	
			
	}
}
