package fr.diginamic.traitement_Fichier.services;

import fr.diginamic.traitement_Fichier.dao.CategorieDao;
import fr.diginamic.traitement_Fichier.dao.MarqueDao;
import fr.diginamic.traitement_Fichier.dao.ProduitDao;

public class ServiceDeTraitement {
	
	public ServiceDeTraitement(/* Recoit un fichier pour le traitement?*/){
		
		
		
	}
	
	public void controlleur() {
	CategorieDao categorieDAO = new CategorieDao();
	MarqueDao marqueDAO = new MarqueDao();
	ProduitDao produitDAO = new ProduitDao();
	
	categorieDAO.recuperer();
	
	
	}
	//Ici la connexion à la base de données??? la fermeture?
	
	

}
