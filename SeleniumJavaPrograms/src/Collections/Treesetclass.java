package Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Treesetclass 
{
public static void main(String[] args) 
{
Set<String> s=new TreeSet<String>();
s.add("teja");
s.add("reddy");
s.add("abc");
Iterator i=s.iterator();
while(i.hasNext())
{
	System.out.println(i.next());
}	
}
}
