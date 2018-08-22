package firstApp;
import java.util.*;

public class collections {

	
	public static void main(String args[]) {
		
		ArrayList<Integer> c = new ArrayList<Integer>(); 
		c.add(1);
		c.add(6);
		c.add(1);
		Collections.sort(c);  

		Iterator<Integer> i =  c.iterator();
		
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	
		
	}
	
}
