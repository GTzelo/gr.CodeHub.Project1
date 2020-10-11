package gr.codehub.project1.models;

import java.util.ArrayList;
import java.util.List;

import gr.codehub.project1.istore.Store;



public class InventoryRetailStore implements Store{
    private double totalBuyBalance;
    private double totalSellBalance;
    private List<Product> productsList;

    public InventoryRetailStore() {
        productsList = new ArrayList<>();
        totalBuyBalance = totalSellBalance = 0.0;
    }

  
    public void showInventory() {
        if(productsList.size() != 0) {
            System.out.println("Products:");
            for (Product p : productsList) {
                System.out.println("id=" + p.getId() + ", name=" + p.getName() + ", priceWhenBy=" + p.getPriceWhenBuy() + ", priceWhenSell=" + p.getPriceWhenSell());
            }
        } else {
            System.out.println("Inventory is empty.");
        }
    }

   
    public void clearOutInventory() {
       
        for(Product product : productsList) {
            double discount = product.getPriceWhenSell() * 0.1;
            totalSellBalance += (product.getPriceWhenSell() - discount);
        }

        
        productsList.clear();
    }

    
    @Override
    public void buy(Product product) {
        
        if(product.isAvailable()) {

            productsList.add(product);
            
            totalBuyBalance += product.getPriceWhenBuy();

            System.out.println("Product with id=" + product.getId() + " successfully added to the inventory.");
        }else {
            System.out.println("Product with id=" + product.getId() + " is not available to be bought.");
        }

    }

    
    @Override
    public void sell(Product product) {
   
        if(productsList.contains(product)) {
           
            int index = productsList.indexOf(product);
            Product fromInventory = productsList.get(index);

            if(fromInventory.isAvailable()) {
            	
                productsList.remove(product);

                System.out.println("Product with id=" + product.getId() + " successfully sold.");

                totalSellBalance += product.getPriceWhenSell();
            } else {
                System.out.println("Product with id=" + product.getId() + " is not available in the store.");
            }
        }else {
            System.out.println("Product with id=" + product.getId() + " is not available in the store!");
        }
    }

    
    @Override
    public double getRevenue() {
        return totalSellBalance - totalBuyBalance;
    }
}

