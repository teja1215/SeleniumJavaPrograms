package SitesAutomation;

public class RemoveDuplicatesAndPrint 
{
public static void main(String[] args) 
{
String s1="ravitejaaaacdef";

StringBuffer s2 =new StringBuffer(s1);

for(int i=0 ;i<s2.length(); i++) {
	
	for(int j=i+1;j<s2.length();j++) {
		
		if(s2.charAt(i) == s2.charAt(j)) {
			
			s2 = s2.deleteCharAt(j);
			
		}
		
	}
	
}

System.out.println(s2);



}
}
