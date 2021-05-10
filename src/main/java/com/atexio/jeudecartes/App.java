package com.atexio.jeudecartes;

import com.atexio.jeudecartes.domain.Joueur;
import com.atexio.jeudecartes.domain.Paquet;

public class App

{

	public static void main(String[] args) {

		Paquet paquet = new Paquet();
		paquet.initialiserPaquet();

		System.out.println("========== La main non triée ============");
		Joueur joueur = new Joueur();
		joueur.tirerMain(paquet);

		System.out.println("==========la main triée =========");
		joueur.trierMain();

	}
}
