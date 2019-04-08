package Collections;

public class ConstructorOverload
{
	String name,color;
public ConstructorOverload()
{
	name="orange";
	color="orange";
}
public ConstructorOverload(String n,String c)
{
	name=n;
	color=c;
}
public void disp()
{
	System.out.println("the name is"+name);
	System.out.println("the color is"+color);
}
public static void main(String[] args) 
{
	ConstructorOverload obj=new ConstructorOverload();
	obj.disp();
	
}
}
