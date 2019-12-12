package io;
import java.io.*;

public class DataInputStreamExample {

	public static void main(String[] args) throws IOException {
		File file = new File("data.txt");
		FileInputStream fis = new FileInputStream(file);
		DataInputStream dis = new DataInputStream(fis);
		
		int data = dis.readInt();
		System.out.println("Data read: " + data);
		System.out.println("Data read: " + dis.readBoolean());
		System.out.println("Data read: " + dis.readChar());
		
		dis.close();
		fis.close();

	}

}
