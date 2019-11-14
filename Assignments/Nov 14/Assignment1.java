package november14;

import java.util.*;
public class Assignment1 {

	public static void main(String[] args) {
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		lhs.add("surya");
		lhs.add("lux");
		lhs.add("surya");
		lhs.add("rexona");
		lhs.add("liril");
		lhs.add("santoor");
		lhs.add("radar");
		lhs.add("madam");
		
		Iterator<String> itr = lhs.iterator();
		while(itr.hasNext()) {
			Object tmp = itr.next();
			String str = (String) tmp;
			StringBuffer sb = new StringBuffer(str);
			
			String string = sb.toString(), itsReverse = sb.reverse().toString();			
			if(string.equals(itsReverse)) {
				System.out.println(string);
			}				
		}
	}
}
