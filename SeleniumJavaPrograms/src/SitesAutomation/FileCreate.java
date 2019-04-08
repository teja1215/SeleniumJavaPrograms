package SitesAutomation;

import java.io.File;
import java.io.IOException;

public class FileCreate
{
 public static void main(String[] args) throws IOException 
 {
   File f=new File("D:\\WebPages\\Capgemini.txt");
   if(f.exists())
	   System.out.println("file notcreated");
   else
	   f.createNewFile();
   
 }
}
