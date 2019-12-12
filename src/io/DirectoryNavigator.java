package io;
import java.io.File;;
public class DirectoryNavigator {
	
	public static void main(String[] args) {
		// String filepath = args[0];
		String filepath = "C:/Users/joshe/workspace/Day09";
		File file = new File(filepath);
		if (file.exists()) {
			printDirectory(file, 0);
		}

	}

	private static void printDirectory(File folder, int tabs) {
		for (File file : folder.listFiles()) {					
			for (int i=0; i<tabs; i++) {
					System.out.print("  ");
				}			
			if (file.isDirectory()){
				File[] files = file.listFiles();

				System.out.println("======== Directory: " +file.getName()+ " : Contains: " +files.length+ " Files ========");
				tabs++;
				printDirectory(file, tabs);
			} else {
				System.out.println(file.getName());
			}
		}
	}
}
