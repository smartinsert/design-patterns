package observer.ex1;

import java.util.Observable;
import java.util.Observer;

class Buyer implements Observer {

	public void update(Observable observable, Object arg1) {

		System.out.println("The latest price received " + (Double) arg1);
	}

}

class Stock extends Observable {
	public void sendPrice(int count) {
		try {
			for (int i = 1; i < 10; i++) {
				setChanged();
				notifyObservers(Math.random() * count * 10);
				System.out.println("Stock-0");
				Thread.sleep(3000);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}



public class ObserverDemo {

	public static void main(String[] args) {
		Stock stock = new Stock();

		Buyer buyer = new Buyer();
		stock.addObserver(buyer);
		stock.sendPrice(10);


	}

}
