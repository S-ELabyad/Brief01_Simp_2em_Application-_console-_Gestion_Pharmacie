package com.pharmacie.app.models;

public class Client extends Personne{

	
	private String Prenom;
	private int numTele;
	private String Email;
	private int Badge;
	
	
	public  Client(double Id,String Name,String Prenom,int numTele, String Email,int Badge) {
		super(Id,Name);
		this.Prenom=Prenom;
		this.numTele=numTele;
		this.Email=Email;
		this.Badge=Badge;
	}
	
	
	public Client() {
		// TODO Auto-generated constructor stub
	}


	public String getPrenom() {
		return Prenom;
	}
	
	public void setPrenom(String Prenom) {
		this.Prenom=Prenom;
	}
	
	public int getnumTele() {
		return numTele;
	}
	
	public void setnumTele(int numTele) {
		this.numTele=numTele;
	}
	
	public String getEmail() {
		return Email;
	}
	
	public void setEmail(String Email) {
		this.Email=Email;
	}
	
	public int getBadge() {
		return Badge;
	}
	
	public void setBadge(int Badge) {
		this.Badge=Badge;
	}


	public void clientID(int clientID1) {
		// TODO Auto-generated method stub
		
	}


	public void getId(int clientID1) {
		// TODO Auto-generated method stub
		
	}
	
		
}
