package SitesAutomation;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class DataDriven 
{
public static void main(String[] args) throws IOException 
{
  Map<String,String> m =new LinkedHashMap<>();
  File f=new File("C:\\Users\\RC_Reddy\\Downloads\\Book1.xls");
  FileInputStream fis=new FileInputStream(f);
  HSSFWorkbook wb= new HSSFWorkbook(fis);
  HSSFSheet s=wb.getSheet("Sheet1");
  for(int i=0;i<s.getLastRowNum()+1;i++) {
	  
	  HSSFRow hr= s.getRow(i);
	  
	  m.put(hr.getCell(0).toString(),hr.getCell(1).toString());
	  
  }
  
  System.out.println(m);
  for(Map.Entry<String,String> hm:m.entrySet())
  {
	  System.out.println(hm.getKey()+""+hm.getValue());
  }
  
  
}	


}
