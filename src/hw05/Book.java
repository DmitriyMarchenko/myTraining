package hw05;

import java.math.BigDecimal;

public class Book {
	private long id;
	private String bookName;
	private String avtorName;
	private String publishingHouse;
	private int yearPublishing;
	private int numberPages;
	private BigDecimal Price;
	private String typeBinding;

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the bookName
	 */
	public String getBookName() {
		return bookName;
	}

	/**
	 * @param bookName
	 *            the bookName to set
	 */
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	/**
	 * @return the avtorName
	 */
	public String getAvtorName() {
		return avtorName;
	}

	/**
	 * @param avtorName
	 *            the avtorName to set
	 */
	public void setAvtorName(String avtorName) {
		this.avtorName = avtorName;
	}

	/**
	 * @return the yearPublishing
	 */
	public int getYearPublishing() {
		return yearPublishing;
	}

	/**
	 * @param yearPublishing
	 *            the yearPublishing to set
	 */
	public void setYearPublishing(int yearPublishing) {
		this.yearPublishing = yearPublishing;
	}

	/**
	 * @return the publishingHouse
	 */
	public String getPublishingHouse() {
		return publishingHouse;
	}

	/**
	 * @param publishingHouse
	 *            the publishingHouse to set
	 */
	public void setPublishingHouse(String publishingHouse) {
		this.publishingHouse = publishingHouse;
	}

	/**
	 * @return the numberPages
	 */
	public int getNumberPages() {
		return numberPages;
	}

	/**
	 * @param numberPages
	 *            the numberPages to set
	 */
	public void setNumberPages(int numberPages) {
		this.numberPages = numberPages;
	}

	/**
	 * @return the price
	 */
	public BigDecimal getPrice() {
		return Price;
	}

	/**
	 * @param price
	 *            the price to set
	 */
	public void setPrice(BigDecimal price) {
		Price = price;
	}

	/**
	 * @return the typeBinding
	 */
	public String getTypeBinding() {
		return typeBinding;
	}

	/**
	 * @param typeBinding
	 *            the typeBinding to set
	 */
	public void setTypeBinding(String typeBinding) {
		this.typeBinding = typeBinding;
	}

}
