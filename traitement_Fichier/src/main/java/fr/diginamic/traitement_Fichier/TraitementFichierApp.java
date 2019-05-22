package fr.diginamic.traitement_Fichier;

import fr.diginamic.traitement_Fichier.services.ServiceDeTraitement;

public class TraitementFichierApp {
	
	

	public static void main(String[] args) {
		
		ServiceDeTraitement serviceT = new ServiceDeTraitement();
		
		serviceT.controlleur();
	
	}	
}
