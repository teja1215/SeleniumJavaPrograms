package SitesAutomation;

public class ArmstrongNuber
{
	public static void main(String[] args) 
	{
		int a=153,r=0,sum=0,temp=a;
		for(int i=0;i<a;)
		{
			r=a%10;
			sum=sum+r*r*r;
			a=a/10;
		
		}
		System.out.println(sum);
		if(temp==sum)
		{
			System.out.println("armstrong number");
		}
		else
			System.out.println("not");
	}
}
