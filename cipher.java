package HomeWork;

public class cipher {

	public static void main(String[] args) {
		String s1 ="abcdXYZ";
		String s2 ="";
		
		for (int i = 0; i < s1.length(); i++) {
			if(s1.charAt(i)>='a' && s1.charAt(i)<='z')
				s2 = s2 + (char)(s1.charAt(i)-32);
			else
				s2 = s2 + s1.charAt(i);
		}
		System.out.println(s2);
		String s3 ="";
		for (int i = 0; i < s2.length(); i++) 
		{	
			s3 = s3 + (char)(155- s2.charAt(i));
		}
		System.out.println(s3);
	}

}
