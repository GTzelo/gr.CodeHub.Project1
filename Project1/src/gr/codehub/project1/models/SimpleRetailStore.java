package gr.codehub.project1.models;

import gr.codehub.project1.istore.Store;

public class SimpleRetailStore implements Store {
	
	
	private double totalBuyBalance;
	private double totalSellBalance;
	

	@Override
	public void buy(Product name) {
		totalBuyBalance= + name.getPriceWhenBuy();
		
	}

	@Override
	public void sell(Product name) {  

		totalSellBalance=+ name.getPriceWhenSell();
	}

	@Override
	public double getRevenue() {
		
		return (totalSellBalance-totalBuyBalance);
	}

	@Override
	public void showInventory() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void clearOutInventory() {
		// TODO Auto-generated method stub
		
	}



}
