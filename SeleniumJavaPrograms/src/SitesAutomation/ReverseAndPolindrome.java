package SitesAutomation;

public class ReverseAndPolindrome
{
	public static void main(String[] args) 
	{
		int a=121,r=0,temp=a;
		for(int i=0;i<a;)
		{
			r=r*10+a%10;
			a=a/10;
		
		}
		System.out.println(r);
		if(temp==r)
		{
			System.out.println("polindrome");
		}
		else
			System.out.println("not  a polindrome");
	}

}
