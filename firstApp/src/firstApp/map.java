package firstApp;
import java.util.*;

public class map {

	public static void main(String args[]) {
		
		Map<Integer,String> m1 = new HashMap<Integer,String>();
		
		m1.put(1,"One");
		m1.put(2,"One");
		
		for(Map.Entry<Integer, String> entry:m1.entrySet()) {
			System.out.println(entry.getValue());
		}
		
	}
}
