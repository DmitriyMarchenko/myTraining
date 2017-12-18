package lesson03;

import java.util.Scanner;

public class homeWork05 {
	private static Scanner scan05;

	public static void main(String args[]) {
		scan05 = new Scanner(System.in);
		// Set the size of a square matrix from the console
		System.out.print("Введите размер матрицы: ");
		int size = scan05.nextInt();
		System.out.print("Вы ввели: " + size);
		scan05.close();
		// part 1 - create matrix size * size
		int[][] matrix = new int[size][size];
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				matrix[i][j] = size * i + j;
			}
		}
		// Part 2 - displays the initial matrix
		System.out.println();
		System.out.println("Начальная матрица");
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				System.out.printf("%4d", matrix[i][j]);
			}
			System.out.println();
		}
	}
}
