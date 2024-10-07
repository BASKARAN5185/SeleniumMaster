package framework_practice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.opc.PackagePart;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadXcelFile {
	
	@Test
	public  void  main() throws IOException {
		
		
			FileInputStream File =new FileInputStream("C:\\Users\\xmedia\\Desktop\\cyber.xlsx");
			 
				XSSFWorkbook input=new XSSFWorkbook(File);
				
				  XSSFSheet sheet = input.getSheetAt(0);
				  
				//   XSSFRow row =sheet.getRow(0);
				
			   //	 Cell cell = row.getCell(0);
				 
				  
                     for(int i=1;i<100;i++) {
                    	 
                    	 if (sheet != null) {
                    	 
                    	 String cellvalue=sheet.getRow(i).getCell(i).getStringCellValue();
                    	 
                    	 System.out.println(cellvalue);
                     }		}
				 
				 
				 }}
	


