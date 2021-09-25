package HomeWork;

import java.util.Arrays;

public class q30 {

	public static void main(String[] args) {

		StringBuffer s1 = new StringBuffer("abcba");
		StringBuffer s2 = new StringBuffer("abcdcba");

		StringBuffer s3 = new StringBuffer("abba");

		StringBuffer s4 = new StringBuffer("amm");

		StringBuffer s5 = new StringBuffer("pqr");

		StringBuffer s[] = { s1, s2, s3, s4, s5 };
		String r = "abba";
		int ctr2 = 0;
		for (int i = 0; i < s.length; i++) {
			int st = 0;
			int en = s[i].length() - 1;
			int ctr1 = 0;
			while (st <= en) {

				if (s[i].charAt(st) != s[i].charAt(en))
					ctr1++;
				st++;
				en--;
			}
			if (ctr1 == 0)
				ctr2++;
		}
		System.out.println(ctr2);

	}

}
