package homeWork08;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.TreeSet;

public class FileSort {
	public static void sort() throws FileNotFoundException {
		  String str;
		    TreeSet<String> tSet = new TreeSet<String>();
		    FileReader fin = new FileReader("D:\\SourceIT\\src\\homeWork08\\note.txt");
		    Scanner src = new Scanner(fin);
		    while (src.hasNextLine()) {
		        str = src.nextLine();
		    tSet.add(str);
		    }
		    System.out.println(tSet);
		    src.close();
		}
}