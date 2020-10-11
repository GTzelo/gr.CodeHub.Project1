package gr.codehub.project1.models;

public class Product {
	 private static int currentId = 1;
	    private int id;
	    private String name;
	    private double priceWhenBuy;
	    private double priceWhenSell;
	    private boolean productAvailability;



	    public Product(String name, double priceWhenBuy, double priceWhenSell) {
	        super();
	        this.id = currentId++;
	        this.name = name;
	        this.priceWhenBuy = priceWhenBuy;
	        this.priceWhenSell = priceWhenSell;
	        this.productAvailability=true;



	    }

	    public int getId() {
	        return id;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }


	    public double getPriceWhenBuy() {
	        if(productAvailability) {
	            return priceWhenBuy;
	        }else {
	            return priceWhenBuy=0;
	        }
	    }

	    public void setPriceWhenBuy(double priceWhenBuy) {
	        this.priceWhenBuy = priceWhenBuy;
	    }

	    public double getPriceWhenSell() {
	        return priceWhenSell;
	    }

	    public void setPriceWhenSell(double priceWhenSell) {
	        this.priceWhenSell = priceWhenSell;
	    }



	 
	    public void setAvailable(boolean availability) {

	        this.productAvailability=availability;


	    }
	 
	    public boolean isAvailable() {
	        return productAvailability;
	    }
	}


