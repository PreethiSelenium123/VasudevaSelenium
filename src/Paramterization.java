import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import day16.OHRMFunTest;


public class Paramterization {

	public static void main(String[] args) throws IOException 
	{
		OHRMFunTest org=new OHRMFunTest();
		org.appLaunch();
		org.appLogin();
		
		File src=new File("C:\\Users\\vasu\\Desktop\\addEmpdata.xlsx");
		FileInputStream fis=new FileInputStream(src);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet ws=wb.getSheetAt(0);
int rowCnt=ws.getLastRowNum();
for (int i = 1; i <=rowCnt; i++) 
{
	String fname=ws.getRow(i).getCell(0).getStringCellValue();
	String lname=ws.getRow(i).getCell(1).getStringCellValue();
	String Results=org.addEmp(fname, lname);
	ws.getRow(i).createCell(2).setCellValue(Results);
	FileOutputStream fos=new FileOutputStream(src);
	wb.write(fos);
	
}
wb.close();
	}

}
