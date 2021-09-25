package HomeWork;

import java.util.Iterator;

public class q20 {

	public static void main(String[] args) {
		String s1 = "aaabbbbccddd";
		String s2="";
		 for (int i = 0; i < s1.length(); i++) {
			
			 int rank =1;
			 for (int j = i+1; j < s1.length(); j++) {
				
				 if(s1.charAt(i)== s1.charAt(j))
					 rank++;
			}
			 if(rank==1)
				 s2 = s2 + s1.charAt(i);
		}
		 System.out.println(s2);
	}

}
