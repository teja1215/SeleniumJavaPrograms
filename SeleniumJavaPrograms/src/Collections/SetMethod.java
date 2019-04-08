package Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetMethod
{
	public static void main(String[] args) 
	{
	
Set s=new HashSet();
s.add(10);
s.add(20);
s.add("abc");
Iterator i=s.iterator();
while(i.hasNext())
{
	System.out.println(i.next());
}

	}

}
