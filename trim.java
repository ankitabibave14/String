package HomeWork;

public class trim {

	public static void main(String[] args) {
		String s1 = "    Play Bold   ";
		int st = 0;
		int en = s1.length()-1;
		while(true)
		{
			if(s1.charAt(st)==' ')
				st++;
			else if(s1.charAt(en)==' ')
				en--;
			else
				break;
		}
		String s2="";
		for (int i = st; i < en; i++) {
			s2 = s2 + s1.charAt(i);
		}
		System.out.println(s2);
	}

}
