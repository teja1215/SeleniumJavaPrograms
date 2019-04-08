package SitesAutomation;

public class DuplicatesFindInArray 
{
public static void main(String[] args)
{
	int a[]= {1,2,3,3,4,4,5,6,5,6,7};
	int count=0;
	for(int i=0;i<a.length;i++)
	{
		for(int j=i+1;j<a.length;j++)
		{
			if(a[i]==a[j])
			{
				System.out.println("repeated elements are "+ a[j]);
				count++;
				break;
			}
		}
	}
}
}
