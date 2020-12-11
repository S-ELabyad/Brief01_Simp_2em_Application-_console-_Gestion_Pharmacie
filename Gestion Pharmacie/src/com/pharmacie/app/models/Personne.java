package com.pharmacie.app.models;

public class Personne {
	private double Id;
	private String Name;

	public  Personne(double Id, String Name) {
		this.Id=Id;
		this.Name=Name;
		
	}
	
	public Personne () {
		
	}
		
	public double getId() {
		return Id;
	}
	
	public void setId(double Id) {
		this.Id=Id;
	}
	
		public String getName() {
			return Name;
		}
		
		public void setName(String Name) {
			this.Name=Name;
		}
		
		
		

}
