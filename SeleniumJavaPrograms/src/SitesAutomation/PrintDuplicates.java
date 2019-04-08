package SitesAutomation;

public class PrintDuplicates 
{
public static void main(String[] args) 
{
String str="ravitejareddy";
int count=0;
char[] ch=str.toCharArray();
System.out.println("duplicate characters are");
for(int i=0;i<str.length();i++)
{
	for(int j=i+1;j<str.length();j++)
	{
		if(ch[i]==ch[j])
		{
			System.out.println(ch[i]);
			
		}
	}
}
}
}
