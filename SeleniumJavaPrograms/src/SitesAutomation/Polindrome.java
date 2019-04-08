package SitesAutomation;

public class Polindrome 
{
  public static void main(String[] args) 
  {
	int a=121,r,temp;
	for(r=0;a>0;)
	{
		r=r*10+a%10;
		a=a/10;
	}
	System.out.println(r);
	temp=r;
	if(temp==a)
		System.out.println("polindrome number");
	else
		System.out.println("not polindrome number");
  }
}
