package io;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;

public class ReadNameAndSort {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("data1.txt");
		// FileOutputStream fos = new FileOutputStream(file);
		// PrintWriter pw = new PrintWriter(fos);
		
		PrintWriter pw = new PrintWriter(file);
		
		ArrayList<String> names = new ArrayList<>();
		for (int i=0; i<10; i++) 
			names.add("name "+i);
			
		pw.println(names); // prints to file
		System.out.println(names); // prints to console
		
		HashMap<Integer, String> hashMapofNames = new HashMap<Integer, String>();
		for(int i=0; i<10; i++) 
			hashMapofNames.put(i,"name " + i);
		
		pw.println(hashMapofNames); // prints to file
		pw.close();
		System.out.println(hashMapofNames); // prints to console

	}

}
