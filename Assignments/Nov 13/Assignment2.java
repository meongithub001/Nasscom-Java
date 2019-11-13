
import java.util.ArrayList;
import java.util.Iterator;

public class Assignment2 {

	public static void main(String[] args) {
		ArrayList<Integer> myList = new ArrayList<Integer>();
		myList.add(56);
		myList.add(7);
		myList.add(19);
		myList.add(24);
		myList.add(68);
		myList.add(17);
		
		Iterator<Integer> itr = myList.iterator();
		
		while(itr.hasNext()) {
			Object o = itr.next();
			Integer i = (Integer) o;
			int n = i.intValue();
			if(isPrime(n))
				System.out.println(n);			
		}
	}
	
	private static boolean isPrime(Integer i) {
		int n = i.intValue();
		for(int x = 2; x<=n/2; x++) {
			if(n % x == 0)
				return false;
		}
		return true;
	}
}
