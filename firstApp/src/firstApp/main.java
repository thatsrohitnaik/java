
package firstApp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class main {

	public static void main(String[] args) {
		
      System.out.println("Hello world"+args.length);
      
      for(int i=0;i<10 ;i++) {
    	  System.out.println(i);
    	  
      }
      int[] i = {1,2,3};
      int ln = i.length;
      for(int k= 0; k< ln; k++) {
    	  System.out.println(i[k]);
      }
      int[] x = new int[5];
      String[] y = new String[5];
      ln =x.length;
      for(int l=0; l<ln; l++) {
    	   x[l]=3;
    	   y[l]="Hello";
    	   System.out.println(x[0]+y[l]);
      }
      
      for(int m: x) {
    	    System.out.println(m); 
      }
      
      for(String j: y) {
  	    System.out.println(j); 

      }
      
      Box b1 = new Box("oyeee");
      b1.height=1030;
      b1.length=20;
      System.out.println(b1.calculateArea());
      
      
      String[] a = {"a","b","c","d"};
      
      List<String> list = new ArrayList<String>();
       
      for(String h: a)
    	  list.add(h);
      
      String[] b = {"c","b"};
      
      List<String> list2 = new ArrayList<String>();
      
      
      for(String t:b)
    	  list2.add(t);
      
      
      
      for(int z=0 ;z<list.size();z++)
      {
    //	  System.out.printf(list.get(z));
      }
      
      editlist(list,list2);
      for(int z=0 ;z<list.size();z++)
      {
    	  System.out.println(list.get(z));
      }
      
      
      List<String> ll = new LinkedList<String> ();
      for(String g:a)
    	  ll.add(g);
      
      for(String z:ll)
    	  System.out.println(z);
      
	}

	public static void editlist(Collection<String> l1,Collection <String>  l2) {

		Iterator<String> it =l1.iterator();
		while(it.hasNext()) {
			if(l2.contains(it.next())) {
            it.remove();
			}
		}
		
	}
}
