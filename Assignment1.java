
import java.util.ArrayList;
import java.util.Iterator;

public class Assignment1 {

	public static void main(String[] args) {
		ArrayList<String> myList = new ArrayList<String>();
		myList.add("Surya");
		myList.add("Aryan");
		myList.add("Pavan");
		myList.add("Pooja");
		myList.add("Ayush");
		
		Iterator<String> i = myList.iterator();
		
		while(i.hasNext()) {
			Object o = i.next();
			String s = (String) o;
			StringBuffer sb = new StringBuffer(s); 
			System.out.println(sb.reverse());			
		}
	}
}
