package HomeWork;

import java.util.Arrays;

public class q33 {

	public static void main(String[] args) {
		String s1="43521";
		char ca[] = new char[s1.length()];
		
		for (int i = 0; i < s1.length(); i++) {
			ca[i]= s1.charAt(i);
			
		}
		for (int i = 0; i < ca.length; i++) {
			for (int j = i+1; j < ca.length; j++) {
				
			
			if(ca[i]>ca[j])
			{
				char temp = ca[i];
				ca[i]= ca[j];
				ca[j]= temp;
			}
		}
	}
		System.out.println(Arrays.toString(ca));
		String s2 = new String(ca);
		System.out.println(s2);
	}
}
