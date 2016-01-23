package e3soln;
import java.util.Observer;
import java.util.Observable;

public class PriceWatchWebsite extends Observable implements Observer {
	private String URL; 

    /**
     * Creates a new {@link e3soln.PriceWatchWebsite} with the given URL.
     * @param url the URL of the new {@link e3soln.PriceWatchWebsite}
     */
    // constructor
	public PriceWatchWebsite(String URL){
		this.URL = URL;	
	}

    /**
     * Returns the URL of this {@link e3soln.PriceWatchWebsite}.
     * @return the URL of this {@link e3soln.PriceWatchWebsite}
     */
    // getUrl
	public String getURL() {
		return URL;
	}


    /**
     * Prints a message about a price change.
     * Notifies all observers of the change in price.
     */
    // update
	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		Product product = ((PriceChange) arg). getProduct();
		System.out.println("You are subscribed to " + URL + ".");
		String priceFormat = String.format("It was notified about a price change of " + product.getName() +
				" at " + product.getStore() + " to %.2f" + ".", product.getPrice());
		System.out.println(priceFormat);
		PriceChange newObject = new PriceChange(product);
		setChanged();
		notifyObservers(newObject);

     
		
	}
	
}