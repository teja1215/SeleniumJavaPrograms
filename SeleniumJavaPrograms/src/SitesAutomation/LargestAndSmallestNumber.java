package SitesAutomation;

public class LargestAndSmallestNumber 
{
public static void main(String[] args) 
{
  int a[]= {40,25,30,35,20,45};
  int max=a[0];
  int min=a[0];
  for(int i=0;i<a.length;i++)
  {
	  if(max<a[i])
	  {
		  max=a[i];
	  }
	  if(min>a[i])
	  {
		  min=a[i];
	  }
  }
  System.out.println("maxmium number is"+max);
  System.out.println("minimum number is"+min);
}
}
