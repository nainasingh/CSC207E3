package e3soln;

import java.util.Observable;


/** A product in a store. **/
public class Product extends Observable {

    /**
     * Creates a {@link e3soln.Product} with the given name, price, and store.
     * @param name name of the new {@link e3soln.Product}
     * @param price price of the new {@link e3soln.Product}
     * @param store store of the new {@link e3soln.Product}
     */
    // constructor
	private String name; 
	private double price;
	private String store;
	public Product(String name, double price, String store){
		this.name = name; 
		this.price = price;
		this.store = store;
	}
	 /**
     * Returns the name of this {@link e3soln.Product}.
     * @return the name of this {@link e3soln.Product}
     */

		
    // getName
	
	public String getName() {
		return name;
	}

    /**
     * Returns the price of this {@link e3soln.Product}.
     * @return the price of this {@link e3soln.Product} 
     */
	
    // getPrice (returns a double)

	public double getPrice() {
		return price;
	}

    /**
     * Returns the store of this {@link e3soln.Product}.
     * @return the store of this {@link e3soln.Product}
     */
    // getStore
	public String getStore() {
		return store;
	}


    /**
     * Changes the price of this {@link e3soln.Product} to newPrice. All 
     * observers are notified, if the price is changed.
     * @param newPrice the new price of this {@link e3soln.Product}
     */
    // changePrice
	public void changePrice(double newPrice){
		Double d = price; 
		Double d1 = newPrice; 
		if (!d.equals(d1)) {
		String temp = String.format("%.2f", newPrice);
		double x = Double.parseDouble(temp);
		this.price = x;
		PriceChange newObject = new PriceChange(this);
		setChanged();
		notifyObservers(newObject);
		}
		
	}

    // toString()
	public String toString(){
		String string1 = String.format("The price of %s at %s is %.2f.", name, store, price);
		return string1;
	
	}
}
