package gr.codehub.project1.models;


public class OnlineCustomer extends Customer {
	 public enum CustomerCategory {
			INDIVIDUAL,
			BUSINESS,
			GOVERNMENT;
			
			
		}
	    
	    private String username;
	    private CustomerCategory category;

	    public OnlineCustomer(String name, String username, CustomerCategory category) {
	        super(name);
	        this.username = username;
	        this.category = category;
	    }

	    public String getUsername() {
	        return username;
	    }

	    public void setUsername(String username) {
	        this.username = username;
	    }

	    public CustomerCategory getCategory() {
	        return category;
	    }

	    public void setCategory(CustomerCategory category) {
	        this.category = category;
	    }

	   
	    @Override
	    public double buyByCredit(double amount) {
	        double discount, resultAmount;
	        switch (category) {
	            // Government cannot use credit card, so transaction is not processed
	            case GOVERNMENT:
	                System.out.println("name=" + this.getName() + " username=" + username + " category=" + category + " cannot use credit card, must always pay in cash!");
	                break;
	            case INDIVIDUAL:
	               
	                discount = amount * 0.05;
	            
	                resultAmount = amount - discount;
	                
	                super.buyByCredit(resultAmount);
	                
	                System.out.println("Successfully transaction. Starting amount: " + amount + " New amount: " + resultAmount);
	                break;
	            case BUSINESS:
	                // Business get online transaction discount of 5% and 2% discount on the purchase price
	                discount = amount * 0.07;
	                
	                resultAmount = amount - discount;
	              
	                super.buyByCredit(resultAmount);

	                System.out.println("Successfully transaction. Starting amount: " + amount + " New amount: " + resultAmount);
	                break;
	        }

	        return 0;
	    }

	    public double buyByCash(double amount) {
	        double discount, resultAmount;
	        switch (category) {
	            // Government get online transaction discount of 5% and 3% discount on the purchase price
	            case GOVERNMENT:

	                discount = amount * 0.08;
	                resultAmount = amount - discount;
	                super.buyByCash(resultAmount);
	                System.out.println("Successfully transaction. Starting amount: " + amount + " New amount: " + resultAmount);
	                break;
	                
	           
	            case INDIVIDUAL:
	                
	                discount = amount * 0.05;
	                
	                resultAmount = amount - discount;
	               
	                super.buyByCash(resultAmount);

	                System.out.println("Successfully transaction. Starting amount: " + amount + " New amount: " + resultAmount);
	                break;
	            // Business get online transaction discount of 5% and 2% discount on the purchase price
	            case BUSINESS: 
	                discount = amount * 0.07;
	             
	                resultAmount = amount - discount;
	               
	                super.buyByCash(resultAmount);
	                System.out.println("Successfully transaction. Starting amount: " + amount + " New amount: " + resultAmount);
	                break;
	        }

	        return 0;
	    }

}
