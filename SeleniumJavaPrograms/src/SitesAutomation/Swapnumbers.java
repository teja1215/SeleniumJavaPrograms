package SitesAutomation;

public class Swapnumbers 
{
public static void main(String[] args) 
{
	String a="abc";
	String b="def";
	System.out.println("strings before swap a="+a+" b="+b);
	a=a+b;
	b=a.substring(0,a.length()-b.length());
	a=a.substring(b.length());
	System.out.println("strings After swap a="+a+" b="+b);
	
}
}
