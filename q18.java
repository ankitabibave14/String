package HomeWork;

import java.util.Arrays;

public class q18 {

	public static void main(String[] args) {

		String s1 = "abc def ghi";
		int ctr = 0;
		for (int i = 0; i < s1.length(); i++) {

			if (s1.charAt(i) == ' ')
				ctr++;
		}
		System.out.println(ctr);
		String sa[] = new String[ctr + 1];
		String s2 = "";
		int index = 0;
		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) == ' ')
			{
				sa[index++] = s2;
				s2="";
			}
			else
			{
				s2 = s2 + s1.charAt(i);
				if(i== s1.length()-1)
				{
					sa[index]= s2;
				}
			}
		}
		
		System.out.println(Arrays.toString(sa));
		int lastId= sa.length-1;
		for (int i = 0; i < sa.length/2; i++) {
			
			String temp= sa[i];
			sa[i]= sa[lastId];
			sa[lastId]= temp;
			lastId--;
		}
		System.out.println(Arrays.toString(sa));

	}

}
