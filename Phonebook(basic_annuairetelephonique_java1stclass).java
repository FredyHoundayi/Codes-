package annuaire_tel;

import java.util.Scanner;

public class Phonebook {


	public static Scanner sc =null;
	public static void main(String[] args) {
		 sc = new Scanner(System.in);
		 String firstname=getUserInput("Entrez votre prenom");
		 String name=getUserInput("Entrez votre nom");
		 String phoneNumer=getUserInput("Contact");
		 
		 Contact newContact= new Contact(firstname,name,phoneNumer);
		 
		 System.out.println(newContact.toString());
		 sc.close();
		 }
		  
	public static String getUserInput (String userrequest) {
		System.out.println(userrequest);
		return sc.nextLine();
	
		
	
	}

}
