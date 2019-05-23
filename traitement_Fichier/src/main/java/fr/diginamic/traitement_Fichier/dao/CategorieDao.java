package fr.diginamic.traitement_Fichier.dao;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;

import fr.diginamic.traitement_Fichier.entites.Categorie;

public class CategorieDao {

	Set<String> lesCategories = new HashSet<String>();

	public CategorieDao() {

	}

	public void recuperer() {

		File file = new File("C:\\Users\\Diginam\\Documents\\Coding\\OpenFactFood\\openFoodFacts.csv");
		List<String> lines = null;
		try {
			lines = FileUtils.readLines(file);
		} catch (IOException e) {
			e.printStackTrace();
		}

		List<Categorie> categorie = new ArrayList<Categorie>();

		for (String line : lines) {

			String[] split = null;
			for (int i = 0; i < 7; i++) {
				split = line.split("\\|");
				// String tab[] = lines.get(0).split("\\|");
			}

			for (int i = 0; i < 7; i++) {
				System.out.println(split[i]);
			}

		}

		// for(String s: lines) {
		// System.out.println(s);
		// }

	}

	public void inserer() {

	}
}
