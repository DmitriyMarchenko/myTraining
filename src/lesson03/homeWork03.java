package lesson03;

import java.util.Scanner;

/**
 * @author Marchenko Dmitriy
 * @data 11.12.2017
 */
public class homeWork03 {
	private static Scanner scan03;

	public static void main(String[] args) {
		scan03 = new Scanner(System.in);
		System.out.println("Введите ширину строки:");
		int a = scan03.nextInt();
		System.out.println("Введите высту строки:");
		int b = scan03.nextInt();
		System.out.println("Вы ввели: " + a + " и " + b);
		scan03.close();
		String[] myS1 = new String[a];
		String[] myS2 = new String[a];
		for (int i = 0; i < a; i++) {
			myS1[i] = "*";
			myS2[i] = "+";
		}
		for (int k = 1; k <= b; k++) {
			System.out.println("");
			for (int i = 0; i < a; i++) {
				for (int j = 0; j < myS1.length; j++) {
					System.out.print(myS1[j]);
				}
				for (int y = 0; y < myS2.length; y++) {
					System.out.print(myS2[y]);
				}
			}
		}
	}
}
