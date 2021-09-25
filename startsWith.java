package HomeWork;

public class startsWith {

	public static void main(String[] args) {
		String s1 = "abcdefgh";
		String s2 = "ab";
		int ctr = 0;
		for (int i = 0; i < s2.length(); i++) {

			if (s1.charAt(i) == s2.charAt(i)) {
				ctr++;

			}

		}
		System.out.println(ctr);
		if (ctr == s2.length())
			System.out.println("yes");
		else
			System.out.println("not");

	}

}
