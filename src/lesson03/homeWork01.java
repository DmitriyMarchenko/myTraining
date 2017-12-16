package lesson03;

import java.util.Scanner;

/**
 * @author Marchenko Dmitriy
 * @data 11.12.2017
 */
public class homeWork01 {
	private static Scanner scan;

	public static void main(String args[]) {
		String sc = "*";
		System.out.print("Введите любое целое число: ");
		scan = new Scanner(System.in);
		int count = scan.nextInt();
		scan.close();
		for (int i = 1; i < count; i++) {
			System.out.println(sc);
			sc = sc + "*";
		}
		for (int i = 0; i < sc.length(); i++) {
			int endIndex = sc.length() - i;
			System.out.println(sc.substring(0, endIndex));
		}
		return;
	}
}
