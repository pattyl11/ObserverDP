public class GrabStocks{
	
	/**
	 * @param args
	 */
	public static void main(String[] args){
		
		// Create the Subject object
		// It will handle updating all observers 
		// as well as deleting and adding them
		
		StockGrabber stockGrabber = new StockGrabber();
		
		// Create an Observer that will be sent updates from Subject
		
		@SuppressWarnings("unused")
		StockObserver observer1 = new StockObserver(stockGrabber);
		
		stockGrabber.setIBMPrice(167.13);
		stockGrabber.setAAPLPrice(169.30);
		stockGrabber.setGOOGPrice(173.69);
		stockGrabber.setINTCPrice(31.88);

		@SuppressWarnings("unused")
		StockObserver observer2 = new StockObserver(stockGrabber);
		
		stockGrabber.setIBMPrice(167.13);
		stockGrabber.setAAPLPrice(169.30);
		stockGrabber.setGOOGPrice(173.69);
		stockGrabber.setINTCPrice(31.88);

		// Delete one of the observers
		
		// stockGrabber.unregister(observer2);
		
		stockGrabber.setIBMPrice(167.13);
		stockGrabber.setAAPLPrice(169.30);
		stockGrabber.setGOOGPrice(173.69);
		stockGrabber.setINTCPrice(31.88);

		// Create 4 threads using the Runnable interface
		// GetTheStock implements Runnable, so it doesn't waste 
		// its one extendable class option
		
		Runnable getIBM = new GetTheStock(stockGrabber, 2, "IBM", 197.00);
		Runnable getAAPL = new GetTheStock(stockGrabber, 2, "AAPL", 677.60);
		Runnable getGOOG = new GetTheStock(stockGrabber, 2, "GOOG", 676.40);
		Runnable getINTC = new GetTheStock(stockGrabber, 2, "INTC", 46.90);
		
		// Call for the code in run to execute 
		
		new Thread(getIBM).start();
		new Thread(getAAPL).start();
		new Thread(getGOOG).start();
		new Thread(getINTC).start();
		
	}
	
}