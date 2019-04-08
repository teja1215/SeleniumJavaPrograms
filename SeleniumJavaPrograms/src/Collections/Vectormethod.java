package Collections;

import java.util.Iterator;
import java.util.Vector;

public class Vectormethod 
{
public static void main(String[] args) {
	Vector v=new Vector();
	v.add(10);
	v.add(20);
	v.add(30);
	v.add(40);
	Iterator i=v.iterator();
	while(i.hasNext())
	{
		System.out.println(i.next());
	}
}
}
