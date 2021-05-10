package com.atexio.jeudecartes.domain;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class Main {

	private List<Carte> cartes = new ArrayList<Carte>(10);

	public void initialiserMain(Paquet paquet) {
		for (int nbrCarte = 0; nbrCarte < 10; nbrCarte++) {
			this.cartes.add(paquet.getCartes().get(nbrCarte));

		}
		afficherMain();
	}

	public void afficherMain() {
		this.cartes.stream().forEach(c -> System.out.println(c.toString()));
	}

}
