package Collections;

public class NumberIntoWord 
{
	public static void main(String[] args) {

		int num = 567;
		String s = "";
		String s4="";
		while (num != 0) {
			int num1 = num % 10;
			switch (num1) {
			case 5:
				s = s + " five";
				break;
			case 6:
				s = s + " six";
				break;
			case 7:
				s = s + " seven";
				break;

			}
			num = num / 10;
		}
		System.out.println(s);
		
		String [] s1 = s.split(" ");
		for(int i=s1.length-1;i>0;i--) {
			s4 =s4+ " "+s1[i];
			
		}
		System.out.println(s4);
	}
}
