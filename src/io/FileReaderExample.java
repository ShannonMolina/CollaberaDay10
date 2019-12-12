package io;
import java.io.*;
public class FileReaderExample {

	public static void main(String[] args) {
		// set up file and stream
		File inFile = new File("data1.txt");
		try {
			FileReader fileReader = new FileReader(inFile);
			BufferedReader bufReader = new BufferedReader(fileReader);
			String str;
			
			str = bufReader.readLine();
			while (str!=null) {
				System.out.println(str);
				str = bufReader.readLine();
			}
			bufReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("FileNotFoundException : " +e.getMessage());
		} catch (IOException e) {
			System.out.println("IOException : " +e.getMessage());
		}
	}

}
