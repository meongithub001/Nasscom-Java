package november14;

public class Assignment2 {
	public static void main(String[] args) {
		String myString = "suryanarayana";
		StringBuffer result = new StringBuffer(myString);
		char tmp;
		int i;
		for(i = 1; i<myString.length(); i+=2) {
			tmp = myString.charAt(i);
			result.setCharAt(i, myString.charAt(i-1));
			result.setCharAt(i-1, tmp);
		}		
		System.out.println(result);
	}
}
