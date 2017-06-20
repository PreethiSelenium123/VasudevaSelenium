package day13;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Writingnotepad {

	public static void main(String[] args) throws IOException 
	{
		/*String textFile="D:\\preethi.txt";
		File fc=new File(textFile);
		fc.createNewFile();
		FileWriter fw=new FileWriter(textFile);
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write("Hi Preethi");
		bw.newLine();
		bw.write("Selenium");
		bw.close();*/
		//reading
		FileReader fr=new FileReader("D:\\preethi.txt");
		BufferedReader br=new BufferedReader(fr);
		String data="";
		while ((data=br.readLine())!=null)
		{
			String [] datasplit=data.split("#");
			String username=datasplit[0];
			String passwords=datasplit[1];
			System.out.println(username+"---"+passwords);
			
		}
				
				
				
				
		
		
		

	}

}
