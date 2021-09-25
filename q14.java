package HomeWork;

public class q14 {

	public static void main(String[] args) {
		String s1="123";
		int ctr=0;
		for (int i = 0; i < s1.length(); i++) {
			
			if(s1.charAt(i)>='0' && s1.charAt(i)<='9')
				ctr++;
		}
		if(ctr== s1.length())
			System.out.println("Only digits");
		else
			System.out.println("not");
	}

}
