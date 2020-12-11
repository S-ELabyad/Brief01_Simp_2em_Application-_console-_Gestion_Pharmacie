package com.pharmacie.app.models;

public class Medicamment extends Personne{

	private String Description;
	private double Price;
	
	
	
	public  Medicamment(double Id,String Name,String Description, double Price) {
		super(Id,Name);
		this.Description=Description;
		this.Price=Price;
		
	}

	public Medicamment() {
		
	}

	public String getMedDescription() {
		return Description;
	}
	
	public void MedDescription(String MedDescription) {
		this.Description=MedDescription;
	}
	
	
	
	public double getMedPrice() {
		return Price;
	}
	
	public void MedPrice(double MedPrice) {
		this.Price=MedPrice;
	}


	public void perDescription(String medDescription) {
		// TODO Auto-generated method stub
		
	}

	public void MedName(String medName) {
		// TODO Auto-generated method stub
		
	}

	public void perId(double medId) {
		// TODO Auto-generated method stub
		
	}

	
		
		
	

}
