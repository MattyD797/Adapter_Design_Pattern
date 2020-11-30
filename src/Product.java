/**
 * This is a type of product in the product listings. This is an example of a normal product
 * with just a title, price and description.
 * @author Matt Duggan
 *
 */
public class Product implements ProductListing{
	private String title;
	private double price;
	private String description;
	
	/**
	 * Constructor for the class product. Creates a title, price and description to the product. 
	 * @param title The name of the product.
	 * @param price The cost for the item. 
	 * @param description A small description of the product. 
	 */
	public Product(String title, double price, String description) {
		this.title = title;
		this.price = price;
		this.description = description;
	}
	
	/**
	 * Getter for the title of the product. 
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * Getter for the price of the product. 
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * Getter for the description of the product. 
	 */
	public String getDescription() {
		return description;
	}
}
