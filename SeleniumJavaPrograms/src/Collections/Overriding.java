package Collections;

 class Overriding2
{
 void ravi()
{
	System.out.println("raviteja");
}

}
 class Overriding1 extends Overriding2
 {
	 void ravi()
	 {
		 System.out.println("reddy");
	 }
 }
 class Overriding
{
	public static void main(String[] args) 
	{
	Overriding1 r= new Overriding1();
	r.ravi();
	}
}
