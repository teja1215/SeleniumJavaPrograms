package Collections;

 class Overloading
{

	public void disp(char c)
    {
        System.out.println(c);
    }
    public void disp(int c)
    {
       System.out.println(c );
    }
}

public class Classoverload
{
    public static void main(String args[])
    {
    	Overloading obj = new Overloading();
        obj.disp('a');
        obj.disp(5);
    }
}