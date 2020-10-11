package gr.codehub.project1.models;

public class Customer {


	    private String name;
	    private double totalCashPurchase ;
	    private double totalCreditPurchase;
	    private int totalNumberOfTransactions;

	    public Customer(String name) {
	        super();
	        this.name = name;
	    }



	    public double buyByCredit(double amount) {
	        System.out.println("Hello "+name+" you are buying using credit cart ");
	        totalCreditPurchase=+ amount;
	        totalNumberOfTransactions++;
	        return totalCreditPurchase;




	    }

	    public double buyByCash(double amount) {
	        System.out.println("Hello "+name+" you are buying using cash ");
	        totalCashPurchase=+ amount;
	        totalNumberOfTransactions++;
	        return totalCashPurchase;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public double getTotalCashPurchase() {
	        return totalCashPurchase;
	    }


	    public void setTotalCashPurchase(double totalCashPurchase) {
	        this.totalCashPurchase = totalCashPurchase;
	    }


	    public double getTotalCreditPurchase() {
	        return totalCreditPurchase;
	    }


	    public void setTotalCreditPurchase(double totalCreditPurchase) {
	        this.totalCreditPurchase = totalCreditPurchase;
	    }


	    public int getTotalNumberOfTransactions() {
	        return totalNumberOfTransactions;
	    }

	}


