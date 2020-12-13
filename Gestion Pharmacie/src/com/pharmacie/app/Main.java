package com.pharmacie.app;

import java.util.ArrayList;
import java.util.Scanner;

import com.pharmacie.app.models.Client;
import com.pharmacie.app.models.Medicamment;
import com.pharmacie.app.models.Pharmacien;


public class Main {

	public static void main(String[] args) {

		int input = 0 ;
	    Scanner scanner = new Scanner(System.in);
	    
		ArrayList<Object> listOfMedicamment = new ArrayList<>();
		ArrayList<Object> listOfPharmacien = new ArrayList<>();
		ArrayList<Object> listOfClient = new ArrayList<>();
		do {
			

			System.out.println("..........Gestion Pharmacie.........");
			System.out.println("Menu Principale");
			
			System.out.println("1-  Medicamment");
			System.out.println("2- Pharmacien");
			System.out.println("3-  client");
			
			System.out.println("Choix :");

			int inputs = scanner.nextInt(); 
				
			switch(inputs) {
			case 1:
			
				System.out.println("..........Gestion Medicamment.........");

				System.out.println("1- Ajouter Medicamment");
				System.out.println("2- Afficher Medicamment");
				System.out.println("3- Modifier Medicamment");
				System.out.println("4- Supprimer Medicamment");
				System.out.println("5- Quitter");

				System.out.println("Choix:");
				
				int choixMed = scanner.nextInt();
			
			switch (choixMed) {
			
				case 1:
					Medicamment Med = new Medicamment();
					
					System.out.println("enter Medicamment Id");
					double MedId = scanner.nextDouble();
					Med.setId(MedId);
					
					System.out.println("enter Medicamment Name");
					String MedName = scanner.next();
					Med.setName(MedName);
	
					System.out.println("enter Medicamment Description");
					String MedDescription = scanner.next();
					Med.MedDescription(MedDescription);

					
					System.out.println("enter Medicamment Price");
					double MedPrice = scanner.nextDouble();
					Med.MedPrice(MedPrice);
					
					listOfMedicamment.add("--------------------- Medicamment list -------------------" + "\n" +
					"Medicamment Id: " + Med.getId() + "\n" +
					"Medicamment Name: " + Med.getName() + "\n" + 
					"Medicamment Description: " + Med.getMedDescription() + "\n" + 
					"Medicamment Price: " + Med.getMedPrice() + "\n");
					
				break;
					
				case 2:
					for(Object object : listOfMedicamment) {
						System.out.println(object);
					}
				break;
			
				case 3:
					System.out.println("enter the Medicamment number to modify");
					int MedicammentModifyId = scanner.nextInt();
					MedicammentModifyId =getId();
					
					Medicamment Med1 = new Medicamment();
					
					System.out.println("enter Medicamment Id");
					int MedId1 = scanner.nextInt();
					Med1.setId(MedId1);
	
					
					System.out.println("enter Medicamment  Name");
					String MedName1 = scanner.next();
					Med1.setName(MedName1);
					
					
					System.out.println("enter Medicamment Description");
					String MedDescription1 = scanner.next();
					Med1. MedDescription(MedDescription1);
					
					System.out.println("enter Medicamment Price");
					double MedPrice1 = scanner.nextDouble();
					Med1.MedPrice(MedPrice1);
					
					listOfMedicamment.set(MedicammentModifyId,
					"--------------------- Medicamment list -------------------" + "\n" +
					"Medicamment Id: " + MedicammentModifyId + "\n" +
					"Medicamment Name: " + Med1.getName() + "\n" + 
					"Medicamment Description: " + Med1.getMedDescription() + "\n" + 
					"Medicamment Price: " + Med1.getMedPrice() + "\n");
				break;
				
				case 4:
					System.out.println("enter the Medicamment number to delete");
					int MedicammentdeleteId = scanner.nextInt();
					MedicammentdeleteId=getId();
					listOfMedicamment.remove(MedicammentdeleteId);
				break;
				
				case 5:
					System.out.println("thanks for using Employee application");
					break;	
			    }
			break;
			
			case 2:
			
				System.out.println("..........Gestion Medicamment.........");

				System.out.println("1- Ajouter Pharmacien");
				System.out.println("2- Afficher Pharmacien");
				System.out.println("3- Modifier Pharmacien");
				System.out.println("4- Supprimer Pharmacien");
				System.out.println("5- Quitter");

				System.out.println("Choix:");
				
				int choixPharmacien = scanner.nextInt();
			
			switch (choixPharmacien) {
			
				case 1:
					Pharmacien stu = new Pharmacien();

					System.out.println("enter Pharmacien Id");
					double stuId = scanner.nextInt();
					stu.setId(stuId);
					
					
					System.out.println("enter Pharmacien Name");
					String stuName = scanner.next();
					stu.setName(stuName);
					
					System.out.println("enter Pharmacien Prenom");
					String stuPrenom = scanner.next();
					stu.setPrenom(stuPrenom);


					System.out.println("enter Pharmacien numTele");
					double stunumTele = scanner.nextDouble();
					stu.setnumTele(stunumTele);
					

					System.out.println("enter Pharmacien email");
					String stuEmail = scanner.next();
					stu.setEmail(stuEmail);
					
					listOfPharmacien.add("--------------------- Pharmacien list -------------------" + "\n" +
					"Pharmacien Id: " + stu.getId() + "\n" + 
					"Pharmacien Name: " + stu.getName() + "\n" + "Pharmacien Prenom" + stu.getPrenom() + "\n" +
					"Pharmacien numTele: " + stu.getnumTele() + "\n" + "Pharmacien Email: " + stu.getEmail() + "\n");
					
				break;
					
				case 2:
					for(Object object : listOfPharmacien) {
						System.out.println(object);
					}
				break;
			
				case 3:
					System.out.println("enter the Pharmacien number to modify");
					int PharmacienModifyId = scanner.nextInt();
					PharmacienModifyId=getId() ;
					
					Pharmacien stu1 = new Pharmacien();
					
					System.out.println("enter Pharmacien Id");
					double stuID1 = scanner.nextInt();
					stu1.setId(stuID1);
					
					System.out.println("enter Pharmacien Name");
					String stuName1 = scanner.next();
					stu1.setName(stuName1);
					
					System.out.println("enter Pharmacien Prenom");
					String stuPrenom1 = scanner.next();
					stu1.setPrenom(stuPrenom1);

					System.out.println("enter Pharmacien numTele");
					double stunumTele1 = scanner.nextDouble();
					stu1.setnumTele(stunumTele1);

					System.out.println("enter Pharmacien Email");
					String stuEmail1 = scanner.next();
					stu1.setEmail(stuEmail1);
					

				listOfPharmacien.set( PharmacienModifyId ,
					"--------------------- Pharmacien list -------------------" + "\n" +
					"Pharmacien ID: " + stu1.getId() + "\n" +
					"Pharmacien Name: " + stu1.getName() + "\n" + "Pharmacien Prenom" + stu1.getPrenom() + "\n" +
					"Pharmacien numTele: " + stu1.getnumTele() + "\n" + "Pharmacien Email: " + stu1.getEmail() + "\n");
				break;
				
				case 4:
					System.out.println("enter the Pharmacien number to delete");
					int PharmaciendeleteId = scanner.nextInt();
					PharmaciendeleteId=getId();
					listOfPharmacien.remove(PharmaciendeleteId);
				break;
				
				case 5:
					System.out.println("thanks for using Employee application");
					break;	
			    }
			break;
			
			case 3:
				
				System.out.println("..........Gestion Client.........");

				System.out.println("1- Ajouter Client");
				System.out.println("2- Afficher Client");
				System.out.println("3- Modifier Client");
				System.out.println("4- Supprimer Client");
				System.out.println("5- Quitter");

				System.out.println("Choix:");
				
				int choixClient = scanner.nextInt();
			
			switch (choixClient) {
			
				case 1:
					Client client = new Client();

					//emp.perID(id);
					System.out.println("enter Client ID");
					int clientId = scanner.nextInt();
					client.setId(clientId);
					
					System.out.println("enter Client name");
					String ClientName = scanner.next();
					client.setName(ClientName);
					
					System.out.println("enter Client Prenom");
					String ClientPrenom = scanner.next();
					client.setPrenom(ClientPrenom);
					
					System.out.println("enter Client numTele");
					int numTele = scanner.nextInt();
					client.setnumTele(numTele);
					
					System.out.println("enter Client Email");
					String ClientEmail = scanner.next();
					client.setEmail(ClientEmail);
					

					System.out.println("enter Client Badge");
					int ClientBadge = scanner.nextInt();
					client.setBadge(ClientBadge);
					
					//vérifier la fidélité des clients
					if(client.getBadge() >= 3) {
						System.out.println("le client est devenu fidèle");
					}else {
						System.out.println("Nouveau client");
					}
					
					
					listOfClient.add("--------------------- Client list -------------------" + "\n" +
							"Client ID: " + client.getId() + "\n" +
							"Client Name: " + client.getName() + "\n" + "Client Prenom" + client.getPrenom() + "\n" +
							"Client numTele: " + client.getnumTele() + "\n" + "Client Email: " + client.getEmail() + "\n"+
							"Client Badge: " + client.getBadge() + "\n"  );
				break;
					
				case 2:
					for(Object object: listOfClient) {
						System.out.println(object);
					}
				break;
			
				case 3:
					System.out.println("enter the Client id to modify");
					int clientNumber = scanner.nextInt();
					clientNumber=getId();
					Client client1 = new Client();

					//emp.perID(id);
					System.out.println("enter client Id");
					int clientID1 = scanner.nextInt();
					client1.getId(clientID1);
					
					System.out.println("enter client name");
					String clientName1 = scanner.next();
					client1.setName(clientName1);
					
					System.out.println("enter client Prenom");
					String clientPrenom1 = scanner.next();
					client1.setPrenom(clientPrenom1);
					
					System.out.println("enter client numTele");
					int clientnumTele1 = scanner.nextInt();
					client1.setnumTele(clientnumTele1);
					
					System.out.println("enter client Email");
					String clientEmail1 = scanner.next();
					client1.setEmail(clientEmail1);
					
					System.out.println("enter client Badge");
					int clientBadge1 = scanner.nextInt();
					client1.setBadge(clientBadge1);
					
					
					
					listOfClient.set(clientNumber,
					"--------------------- client list -------------------" + "\n" +
					
					"Client ID: " + client1.getId() + "\n" +
					"Client Name: " + client1.getName() + "\n" + "Client Prenom" + client1.getPrenom() + "\n" +
					"Client numTele: " + client1.getnumTele() + "\n" + "Client Email: " + client1.getEmail() + "\n"+
					"Client Badge: " + client1.getBadge() + "\n"  );
				break;
				
				case 4:
					System.out.println("enter the client number to detete it");
					
					int clientDeletetID = scanner.nextInt();
					clientDeletetID=getId();
					listOfClient.remove(clientDeletetID);
					
				break;
				
				case 5:
					System.out.println("thanks for using Employee application");
					break;	
			    }
			break;
			}	
			
			
			
			
		}while(input != 4);
			
			scanner.close();
		}

	private static int setBadge() {
		// TODO Auto-generated method stub
		return 0;
	}

	private static int getId() {
		// TODO Auto-generated method stub
		return 0;
	}
	

	

	
}

	


		
		
	
