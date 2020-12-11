package com.pharmacie.app.models;

public class Pharmacien extends Personne {
	
	private String Prenom;
	private double numTele;
	private String Email;
	
	public  Pharmacien(double Id,String Name,String Prenom,double numTele, String Email) {
		super(Id,Name);
		this.Prenom=Prenom;
		this.numTele=numTele;
		this.Email=Email;
	}
	
	public Pharmacien() {
		// TODO Auto-generated constructor stub
	}

	public String getPrenom() {
		return Prenom;
	}
	
	public void setPrenom(String Prenom) {
		this.Prenom=Prenom;
	}
	
	public double getnumTele() {
		return numTele;
	}
	
	public void setnumTele(double stunumTele1) {
		this.numTele=stunumTele1;
	}
	
	public String getEmail() {
		return Email;
	}
	
	public void setEmail(String Email) {
		this.Email=Email;
	}

	public void stuId(double stuId) {
		// TODO Auto-generated method stub
		
	}

	public void stuName(String stuName) {
		// TODO Auto-generated method stub
		
	}
	

}
