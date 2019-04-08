package SitesAutomation;

import java.util.HashMap;
import java.util.Map;

public class CountingDuplicateCharacters 
{
public static void main(String[] args) 
{
 String str="aaa bbb cccc aaa ";
 HashMap<Character,Integer>map=new HashMap<Character,Integer>();
 char[] arr=str.toCharArray();
 for(char value:arr)
 {
	 if(Character.isAlphabetic(value))
	 {
		 if(map.containsKey(value))
		 {
			 map.put(value,map.get(value)+1);
		 }
		 else
			 map.put(value, 1);
	 }
 }
 System.out.println(map);
 for(Map.Entry<Character,Integer> hm:map.entrySet())
 {
	 System.out.println(hm.getKey()+"="+hm.getValue());
	 
 }
 
 
}
}
