package HomeWork;

public class q10 {

	public static void main(String[] args) {

		String s1 = "abcd";
		String s2 = "bc";
		int ctr = 0;
		for (int i = 0; i < s1.length(); i++) 
		{
			if(s1.charAt(i) == s2.charAt(0))
			{
				int k=i;
				int j=0;
				while(j<s2.length())
				{
					if(s1.charAt(k) != s2.charAt(j))
						ctr++;
					j++;
					k++;
				}
			}
		}
		if(ctr==0)
			System.out.println("true");
		else
			System.out.println("false");

	}

}
