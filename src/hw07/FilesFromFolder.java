package hw07;

import java.io.File;
import java.io.IOException;

public class FilesFromFolder {

	public void searchFile(File dir) throws IOException {
		if (dir.isDirectory()) {
			File[] files = dir.listFiles();
			for (File file : files) {
				if (file.isDirectory())
					searchFile(file);
			}
			for (File file : files) {
				int i = 0;
				if (file.isFile()) { // проверяем, файл ли это
					i++;
					System.out.println("Файл номер " + i + " найден в " + file.getAbsolutePath());
				}
			}
		}
	}
}
