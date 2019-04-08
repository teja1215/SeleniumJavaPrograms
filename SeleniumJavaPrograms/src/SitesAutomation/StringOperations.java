package SitesAutomation;

public class StringOperations 
{
	public static void main(String[] args) 
	{
	  String s="abcdefg";	
	 System.out.println( s.substring(3, 6));
	  String[] s1=s.split("@");
	  System.out.println(s1[0]);
	  String s2=s1[0];
	
	  System.out.println(s2.substring(s2.length()-3, s2.length()));
	  
	  StringBuffer s8=new StringBuffer();
	  for(int i=s2.length()-1;i>=(s2.length()-3);i--){
		  
		  s8.append(s2.charAt(i));
	  }	  
	  System.out.println(s8.reverse());
	  
	  for(String words:s1)
	{
		System.out.println(words);
	}
	String s3="abc";
	String s4="cde";
	s3=s3+s4;
	s4=s3.substring(0,s3.length()-s4.length());
	s3=s3.substring(s4.length());
	System.out.println("s3="+s3+"  s4="+s4);
	int a=30;
	int b=40;
a=a+b;
b=a-b;
a=a-b;
System.out.println(b);

System.out.println(a);
	  }
}
