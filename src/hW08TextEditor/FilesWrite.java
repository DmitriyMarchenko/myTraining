package hW08TextEditor;

import java.io.FileWriter;
import java.io.IOException;

public class FilesWrite {

	public static void save(String str) {
		try (FileWriter fw = new FileWriter("D:\\SourceIT\\src\\hW08TextEditor\\note.txt", true)) {
			fw.write(str);
			fw.flush();
		} catch (IOException SaveData) {
			System.out.println(SaveData.getMessage());
		}
	}
}

