package SitesAutomation;

public class SortingArray 
{
 public static void main(String[] args)
 {
   int a[]= {10,20,15,30,25,40};
   for(int i=0;i<a.length;i++)
   {
	   for(int j=i+1;j<a.length;j++)
	   {
		   if(a[i]>a[j])
		   {
			   int temp=a[i];
			   a[i]=a[j];
			   a[j]=temp;
		   }
	   }
   }
   for(int s:a)
   {
	   System.out.println(s);
   }
 }
}