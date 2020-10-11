package gr.codehub.project1.testApp;

import gr.codehub.project1.istore.Store;
import gr.codehub.project1.models.OnlineCustomer;
import gr.codehub.project1.models.Product;
import gr.codehub.project1.models.SimpleRetailStore;

public class TestApp {

	public static void main(String[] args) {
		//Online Customer Test
	    OnlineCustomer customer1 = new OnlineCustomer("Anna", "Anna89", OnlineCustomer.CustomerCategory.BUSINESS);
        OnlineCustomer customer2 = new OnlineCustomer("David", "David123", OnlineCustomer.CustomerCategory.GOVERNMENT);
        OnlineCustomer customer3 = new OnlineCustomer("Jessica", "JessicaM", OnlineCustomer.CustomerCategory.INDIVIDUAL);

        System.out.println("Customers:\n");
        System.out.println("\tName=" + customer1.getName() + ", username=" + customer1.getUsername() + ", category=" + customer1.getCategory());
        System.out.println("\tName=" + customer2.getName() + ", username=" + customer2.getUsername() + ", category=" + customer2.getCategory());
        System.out.println("\tName=" + customer3.getName() + ", username=" + customer3.getUsername() + ", category=" + customer3.getCategory());

        customer1.buyByCash(1010.00);
        customer1.buyByCredit(400.85);
        customer2.buyByCash(1000);
        customer2.buyByCredit(370.00);
        customer3.buyByCash(100.00);
        customer3.buyByCredit(150);
    

	

    //SimpleRetailStore
        Product x1 = new Product("Painting Picasso.Guernica",100,1000); 
        Product x2 = new Product("Painting Tsarouxis. NaftisA",200,2000);
        Product x4 = new Product("Chair. Luis XV",0,0);
        x4.setPriceWhenBuy(100);
        x4.setPriceWhenSell(1000);
        Store mariaStore= new SimpleRetailStore();
        x1.setAvailable(false); mariaStore.buy(x1);
        mariaStore.buy(x2);
        mariaStore.buy(x2);
        mariaStore.buy(x4);
        mariaStore.sell(x1);
        x4.setAvailable(false);
        mariaStore.sell(x2);
        mariaStore.sell(x4);
        System.out.println(mariaStore.getRevenue());
        mariaStore.sell(x2);
        mariaStore.sell(x2);
        mariaStore.sell(x2);
        System.out.println(mariaStore.getRevenue());

	

	
	


	}

}
