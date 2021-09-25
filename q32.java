package HomeWork;

public class q32 {

	public static void main(String[] args) {
		String s1 = "Welcome to Java World";

		System.out.println(m1(s1));

		System.out.println(m2(s1));
		System.out.println(m3(s1));
		
		System.out.println(m4(s1));
		System.out.println(m5(s1));
		System.out.println(m6(s1));
	
	}

	private static String m6(String s1) {
		String s2="";
		for (int i = 4; i <=10; i++) {
			s2 = s2 + s1.charAt(i);
		}
		return s2;
	}

	private static String m5(String s1) {
		String s2="";
		for (int i = 0; i < s1.length(); i++) {
			
			if(s1.charAt(i)=='a')
			{
				s2 = s2 + 'e';
				
			}
			else
				s2 = s2 + s1.charAt(i);
		}
		return s2;
		
	}

	private static int m4(String s1) {
		
		int index=0;
		for (int i = 0; i < s1.length(); i++) {
			if(s1.charAt(i)=='a')
			{
				index=i;
				break;
			}
			
		}
		
		return index;

		
	}

	private static String m3(String s1) {
		return s1.concat("- Let us learn");

	}

	private static int m2(String s1) {
		return s1.compareToIgnoreCase("Welcome");

	}

	private static char m1(String s1) {
		return s1.charAt(5);

	}

}
