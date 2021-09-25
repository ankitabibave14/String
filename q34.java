package HomeWork;

import java.util.Arrays;

public class q34 {

	public static void main(String[] args) {
	
		String s1 = "rohit rhoyooo ro rohi rohiyo";
		int ctr=0;
		for (int i = 0; i < s1.length(); i++) {
			
			if(s1.charAt(i)==' ')
				ctr++;
		}
		System.out.println(ctr);
		
		String sa[] = new String [ctr+1];
		int index=0;
		String s2="";
		for (int i = 0; i < s1.length(); i++) {
			
			if(s1.charAt(i)==' ')
			{
				sa[index++]= s2;
				s2="";
			}
			else
			{
				s2= s2 +s1.charAt(i);
				if(i== s1.length()-1)

				{
					sa[index]= s2;
				}
			}
		}
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	System.out.println(Arrays.toString(sa));
		for (int i = 0; i < sa.length; i++) {
			for (int j = i+1; j < sa.length; j++) {
				
			
			if(sa[i].length()> sa[j].length())
			{
				String temp = sa[i];
				sa[i]= sa[j];
				sa[j] = temp;
			}
		}
	}
		System.out.println(sa[0]);
System.out.println(sa[sa.length-1]);
}}
