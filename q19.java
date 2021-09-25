package HomeWork;

import java.util.Arrays;

public class q19 {

	public static void main(String[] args) {

		String s1 = "aabbbcdddddddaab";
		String s2 = "";
		for (int i = 0; i < s1.length(); i++) {

			int rank = 1;
			for (int j = i + 1; j < s1.length(); j++) {
				if (s1.charAt(i) == s1.charAt(j))
					rank++;

			}
			if (rank == 1) {
				s2 = s2 + s1.charAt(i);
			}
		}
		System.out.println(s2);

		int na[] = new int[s2.length()];
		char ca[] = new char[s2.length()];
		int index = 0;
		for (int i = 0; i < s2.length(); i++) {

			ca[index++] = s2.charAt(i);

		}
		System.out.println(Arrays.toString(ca));

		for (int i = 0; i < s1.length(); i++) {

			for (int j = 0; j < ca.length; j++) {
				if (s1.charAt(i) == ca[j])
					na[j]++;
			}

		}
		System.out.println(Arrays.toString(na));
		int max = Integer.MIN_VALUE;
		int index1=0;
		for (int i = 0; i < na.length; i++) {
			if(na[i]> max)
			{
				max= na[i];
				index1=i;
			}
		}
		System.out.println(na[index1]+ " " + ca[index1]);
		
		
	}

}
