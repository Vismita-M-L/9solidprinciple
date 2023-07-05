package com.techlabs.solidprinciples;

public class Invoice {
	private int invoiceid;
	private String name;
	private double amount;
	private double tax;
	public Invoice(int invoiceid, String name, double amount, double tax) {
		super();
		this.invoiceid = invoiceid;
		this.name = name;
		this.amount = amount;
		this.tax = tax;
	}
	public int getInvoiceid() {
		return invoiceid;
	}
	public void setInvoiceid(int invoiceid) {
		this.invoiceid = invoiceid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public double getTax() {
		return tax;
	}
	public void setTax(double tax) {
		this.tax = tax;
	}
	public double CalculateTax() {
	double taxAmount = amount * (tax / 100);
    return  taxAmount;
	}
	 public double calculateTotalAmount() {
	        return amount + (amount * (tax / 100));
	    }

}
