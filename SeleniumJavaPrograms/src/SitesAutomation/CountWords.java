package SitesAutomation;

import java.util.HashMap;
import java.util.Map;

public class CountWords 
{
	public static void main(String[] args) 
	{
	 String str="aaa bbb cccc aaa ";
	 Map<String,Integer> map=new HashMap<String,Integer>();
	 String[] arr=str.split(" ");
	 for(String value:arr)
	 {
		 
			 if(map.containsKey(value))
			 {
				 map.put(value,map.get(value)+1);
			 }
			 else
				 map.put(value, 1);
	 }
	 System.out.println(map);
	 for(Map.Entry<String,Integer> hm:map.entrySet())
	 {
		 if(hm.getValue()>1)
		 System.out.println(hm.getKey()+"="+hm.getValue());
	 }
}
}
