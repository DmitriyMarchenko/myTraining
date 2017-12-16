package lesson03;

import java.util.Scanner;

/**
 * @author Marchenko Dmitriy
 * @data 11.12.2017
 */

public class homeWork02 {
	private static Scanner scanN;

	public static void main(String args[]) {
		System.out.print("Введите любое целое число: ");
		scanN = new Scanner(System.in);
		int countN = scanN.nextInt();
		scanN.close();
		for (long i = 2; i < countN; i++) {

			boolean a = true;
			long q = (long) Math.sqrt(i);
			for (long j = 2; j <= q; j++) {
				if (i % j == 0) {

					a = false;
					break;
				}
			}
			if (a) {
				System.out.println(i + " Простое число");
			}
		}
	}
}
