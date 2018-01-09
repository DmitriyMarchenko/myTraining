package homeWork08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputDate {
	public static void main(String args[]) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
	String str;
	System.out.println("Bвeдитe строки текста.");
	System.out.println("Bвeдитe 'exit' для завершения."); 
	do { str = br. readLine (); 
	SaveData.save() ;
	} while(!str.equals("exit")); 
	}
}
