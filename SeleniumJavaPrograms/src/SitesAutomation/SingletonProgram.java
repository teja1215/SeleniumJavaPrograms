package SitesAutomation;

public class SingletonProgram 
{
	 private static SingletonProgram obj=new SingletonProgram();
	 private SingletonProgram(){}  
	   
	 public static synchronized SingletonProgram getA(){  
	  return obj;  
	 }  
	  
	 public void doSomething(){   
	 }  
}
