/**
 * The class Shoe creates a shoe with the brand, description, name, and cost. 
 * @author Matt Duggan
 *
 */
public class Shoe implements ShoeListing{
	private String brand;
	private String name;
	private double cost;
	private String description;
	
	/**
	 * Constructor for a shoe. 
	 * @param brand The maker of the shoe. 
	 * @param name The name of the shoe. 
	 * @param cost The cost of the shoe. 
	 * @param description A short detail about the type of shoe. 
	 */
	public Shoe(String brand, String name, double cost, String description) {
		this.brand=brand;
		this.name=name;
		this.cost=cost;
		this.description=description;
	}
	
	/**
	 * The format for the information of a type shoe. 
	 */
	public String toString() {
		String shoeInformation = "Shoe: " + name 
				+ "\nBy: " + brand 
				+ "\nDetails: " + description 
				+ "\nCost: $" + cost;
		return shoeInformation;
	}
}
