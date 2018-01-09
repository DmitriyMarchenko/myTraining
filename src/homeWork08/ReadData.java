package homeWork08;

import java.io.FileReader;
import java.io.IOException;

public class ReadData {
	public static void read() {
		try (FileReader fr = new FileReader("D:\\SourceIT\\src\\homeWork08\\note.txt")) {
			int i;
			while ((i = fr.read()) != -1) {

				System.out.print((char) i);
			}
		} catch (IOException ex) {

			System.out.println("LoL");
		}
	}
}