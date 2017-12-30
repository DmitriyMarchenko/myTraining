package hw07;

import java.io.File;
import java.io.IOException;

public class SetDir {

	public static void main(String[] args) {
		File dir = new File("D:\\dir.txt");
		try {
			FilesFromFolder.searchFile(dir);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
