package SitesAutomation;

public class StringSeparate
{
	static void splitstring(String s)
	{
	StringBuffer numbers=new StringBuffer();
	StringBuffer alphabets=new StringBuffer();
	StringBuffer special=new StringBuffer();
	for(int i=0;i<s.length();i++)
	{
		if(Character.isAlphabetic(s.charAt(i)))
		{
			alphabets.append(s.charAt(i));
		}
		else if(Character.isDigit(s.charAt(i)))
		{
			numbers.append(s.charAt(i));
		}
		else 
		{
			special.append(s.charAt(i));
		}	
	}
	System.out.println("the alphabets= "+alphabets);
	System.out.println("the numbers= "+numbers);
	System.out.println("the special characters= "+special);
}
public static void main(String[] args)
{ 
	String s= "cap$@gem23ini=+4efg";
	//StringSeparate obj=new StringSeparate();
	splitstring(s);
	
}
}
