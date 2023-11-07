package Generic;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.testng.annotations.Test;

public class ExternalTextFileContent {

	@Test
	public void readFromTextFile() throws Exception{
		FileReader read=new FileReader("D:\\nisha.txt");
		BufferedReader br=new BufferedReader(read);
		String st=br.readLine();
		
		System.out.println(st);
		
		while((st=br.readLine())!=null) {
			System.out.println(st);
		}
	}
	
}
