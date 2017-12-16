package lesson03;

/**
 * @author Marchenko Dmitriy
 * @data 11.12.2017
 */

public class homeWork04 {
	public static void main(String[] args) {
		int[] myArray = new int[10];
		int[] myArray2 = new int[20];
		for (int i = 0; i < 10; i++) {
			int min = 1;
			int max = 100;
			max -= min;
			int x = (int) (Math.random() * ++max) + min;

			myArray[i] = x;
			System.out.print(myArray[i] + "\t");
		}
		for (int i = 0; i <= myArray.length - 1; i++) {
			int x = myArray[i];
			myArray2[i] = x;
			// System.out.println(x);
		}

		System.out.println();
		for (int i = 0; i <= 9; i++) {
			int x = (int) myArray2[i];
			x = x * 2;
			myArray2[(int) i + 10] = (int) x;
			// System.out.println(x);
		}
		for (int i = 0; i <= myArray2.length - 1; i++) {
			System.out.print(myArray2[i] + "\t");
		}
	}
}
