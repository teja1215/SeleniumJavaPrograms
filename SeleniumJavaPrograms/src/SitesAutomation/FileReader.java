package SitesAutomation;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileReader 
{
public static void main(String[] args) throws IOException 
{
File f= new File("D:\\WebPages\\Capgemini.txt");
 java.io.FileReader fr=new java.io.FileReader(f);
 BufferedReader br=new BufferedReader(fr);
 String line = br.readLine();
 while(line != null) {
	 
	 System.out.println(line);
	 line = br.readLine();
	 
 }
 
 FileWriter fw=new java.io.FileWriter(f);
 BufferedWriter bw=new BufferedWriter(fw);
bw.append("write something to file");
bw.flush();
 br.close();
}
}
