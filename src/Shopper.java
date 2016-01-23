package e3soln;
import java.util.Observer;
import java.util.Observable; 

public class Shopper implements Observer  {

	private String name; 
    /**
     * Creates a new {@link e3soln.Shopper} with the given name.
     * @param name name of the new {@link e3soln.Shopper}
     */
    // constructor
	public Shopper(String name){
		this.name = name;
	}

    /**
     * Returns the name of this {@link e3soln.Shopper}.
     * @return the name of this {@link e3soln.Shopper}
     */
    // getName
	public String getName(){
		return name;	
	}

    /**
     * Prints a message about a price change.
     */
    // update

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		Product product = ((PriceChange) arg). getProduct();
		String priceFormat = String.format("%s was notified about a price change of %s at %s to %.2f.", this.name, product.getName(), product.getStore(), product.getPrice());
		System.out.println(priceFormat);





	   }
		
	}
	
