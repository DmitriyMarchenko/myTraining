package homeWork08;

import java.io.FileWriter;
import java.io.IOException;

public class SaveData {

	public static void save(String str) {
		try (FileWriter fw = new FileWriter("D:\\SourceIT\\src\\homeWork08\\note.txt", true)) {
			fw.write(str);
			fw.flush();
		} catch (IOException SaveData) {
			System.out.println(SaveData.getMessage());
		}
	}
}

