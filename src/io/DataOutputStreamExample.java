package io;
import java.io.*;

public class DataOutputStreamExample {

	public static void main(String[] args) {
		File file = new File("data.txt");
		
		try(FileOutputStream fos = new FileOutputStream(file);			// try-with-resources
				DataOutputStream dos = new DataOutputStream(fos);){
				
				dos.writeInt(12345);
				dos.writeBoolean(true);
				dos.writeChar('w');
			//	dos.close(); // We don't need to explicitly close this because resources are closed
							// at the end of try-with-resources - in this case, fos and dos
		} catch (IOException e) {
			e.printStackTrace();
		} 

	}

}
