package Computhink.Generic;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.testng.annotations.Test;

//NishaR codes

public class ExternalTextFileContent {

	@Test
	public void readFromTextFile() throws Exception {
		FileReader read = new FileReader("D:\\00pagespdf.PDF");
		BufferedReader br = new BufferedReader(read);
		String st = br.readLine();

		System.out.println(st);

		while ((st = br.readLine()) != null) {
			System.out.println(st);
		}
	}

}
