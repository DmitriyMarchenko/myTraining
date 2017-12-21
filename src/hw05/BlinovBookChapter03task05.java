package hw05;

public class BlinovBookChapter03task05 {

	public static void main(String[] args) {
		setBooks("Блинов", 2002, "Програмирование");
		setBooks("Измайл", 2018, "Автор");
		setBooks("Изидов", 2017, "Аврорло");

	}

	private static void setBooks(String avtor, int id, String bookName) {
		System.out.print(avtor + "\t");
		System.out.print(id + "\t");
		System.out.println(bookName);
	}
}
