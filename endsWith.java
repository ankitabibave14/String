package HomeWork;

public class endsWith {

	public static void main(String[] args) {
		String s1 = "abcdefg";
		String s2 = "fgfmg";
		int ctr = 0;
		int lastId = s1.length() - 1;
		for (int i = s2.length() - 1; i >= 0; i--) {
			if (s1.charAt(lastId) == s2.charAt(i)) {
				ctr++;
			}
			lastId--;
		}
		if (ctr == s2.length())
			System.out.println("yes");
		else
			System.out.println("no");

	}

}
