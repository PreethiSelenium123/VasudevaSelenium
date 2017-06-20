package day13;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingTest {

	public static void main(String[] args) throws IOException
	{
		File src=new File("C:\\Users\\vasu\\Desktop\\TestData.xlsx");

		FileInputStream fis=new FileInputStream(src);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet ws=wb.getSheet("Sheet1");
		ws.getRow(0).createCell(2).setCellValue("Results");
		ws.getRow(1).createCell(2).setCellValue("Pass");
		
		FileOutputStream fso=new FileOutputStream(src);
		wb.write(fso);
		wb.close();
		
	}

}
