/**
 * Includes all the necessary methods for being a product in our listing. 
 * @author Matt Duggan
 *
 */
public interface ProductListing {
	/**
	 * Getter for the name of the product. 
	 * @return The title 
	 */
	public String getTitle();
	/**
	 * Getter for the price of the product.
	 * @return The price. 
	 */
	public double getPrice();
	/**
	 * Getter for the description of the product.
	 * @return The description.
	 */
	public String getDescription();
}

