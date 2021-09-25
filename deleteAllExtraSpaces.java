package HomeWork;

public class deleteAllExtraSpaces {

	public static void main(String[] args) {
		String s1 = "    Never    Settle   ";
		int start = 0;
		int end = s1.length() - 1;
		
		for (int i = 0;; i++) {
			if(s1.charAt(start)==' ')
				start++;
			else if(s1.charAt(end)==' ')
				end--;
			else
				break;
			
		}
		String s2 ="";
		
		for (int i = start; i <= end; i++) {
			s2 = s2 +s1.charAt(i);
		}
		System.out.println(s2);
		String s3="";
		for (int i = 0; i < s2.length(); i++) {
			
			if(s2.charAt(i)==' ' && s2.charAt(i+1)==' ')
			{}
			else
				s3 = s3 + s2.charAt(i);
		}
		System.out.println(s3);
		
	}

}
