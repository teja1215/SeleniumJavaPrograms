package SitesAutomation;

public class EnglishNumberPrint
{
public static void main(String[] args) 
{
int a=123,r;
String s="";
String s1="";
for(int i=0;i<a;)
{
	r=a%10;
	switch(r)
	{
	case 1:s=s+" "+"one";
	       break;
	case 2:s=s+" "+"two";
	       break;
	case 3:s=s+" "+"three";
	       break;
	}
	a=a/10;
}
System.out.println(s);
String [] s2=s.split(" ");
for(int i=s2.length-1;i>0;i--)
{
	s1=s1+" "+s2[i];
}
System.out.println(s1);


}
}
