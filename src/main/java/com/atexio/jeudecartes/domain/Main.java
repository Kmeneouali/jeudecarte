package com.atexio.jeudecartes.domain;

import java.util.ArrayList;
import java.util.List;

public class Main {

	private List<Carte> cartes = new ArrayList<Carte>(10);

	public List<Carte> getCartes() {
		return cartes;
	}

	public void setCartes(List<Carte> cartes) {
		this.cartes = cartes;
	}

	public void initialiserMain(Paquet paquet) {
		for (int nbrCarte = 0; nbrCarte < 10; nbrCarte++) {
			this.cartes.add(paquet.getCartes().get(nbrCarte));

		}
		afficherMain();
	}

	public void afficherMain() {
		this.cartes.stream().forEach(c -> System.out.println(c.AfficherCarte()));
	}

}
