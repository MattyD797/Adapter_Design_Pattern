/**
 * This is a shoe in the product listing. If a product is designated as a type of shoe the listing
 * can handle the additional information of who makes the shoe. 
 * @author Matt Duggan
 *
 */
public class ShoeListingAdapter implements ProductListing{
	private ShoeListing shoe;
	private String title;
	private String brand;
	private double price;
	private String description;
	
	/**
	 * Constructor of the shoe. 
	 * @param shoe Includes the title, name of the maker, cost and details. 
	 */
	public ShoeListingAdapter(ShoeListing shoe) {
		this.shoe = shoe;
	}
	
	/**
	 * Getter for the title of the shoe. 
	 */
	public String getTitle() {
		String temp = shoe.toString();
		title = temp.substring(temp.indexOf("Shoe:") + 6, temp.indexOf("\nBy:"));
		return title;
	}
	
	/**
	 * Getter for the price of the shoe. 
	 */
	public double getPrice() {
		String temp = shoe.toString();
		price = Double.parseDouble(temp.substring(temp.indexOf("Cost: ") + 7));
		return price;
	}
	
	/**
	 * Getter for the description of the shoe. Includes brand and description. 
	 */
	public String getDescription() {
		String temp = shoe.toString();
		description = temp.substring(temp.indexOf("Details:") + 8, temp.indexOf("\nCost:"));
		brand = temp.substring(temp.indexOf("By:"), temp.indexOf("\nDetails:"));
		return "Created by " + brand + "," + description;
	}
	
}
