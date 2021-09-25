package HomeWork;

public class lastIndexOf 
{

	public static void main(String[] args) 
	{
		String s1 = "aabcddaabcddbaabccdbaabbd";
		String s2 = "aab";
		for (int i = s1.length() - 1; i >= 0; i--) 
		{
			if (s1.charAt(i) == s2.charAt(0)) 
			{
				int c = 0;
				int k = i;
				int j = 0;
				while (j < s2.length()) 
				{
					if (s1.charAt(k) != s2.charAt(j))
						c++;
					k++;
					j++;
				}
				if (c == 0) 
				{
					System.out.println(i);
					break;
				}
			}
		}

	}

}
