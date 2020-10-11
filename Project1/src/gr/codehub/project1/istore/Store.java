package gr.codehub.project1.istore;

import gr.codehub.project1.models.Product;

public interface Store {
	void buy(Product product);
    void sell(Product product);
    double getRevenue();
    void showInventory();
    void clearOutInventory();
	

}
