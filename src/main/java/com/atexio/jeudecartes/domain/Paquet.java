package com.atexio.jeudecartes.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import lombok.Getter;

@Getter
public class Paquet {

	private List<Carte> cartes = new ArrayList<Carte>(52);

	public void initialiserPaquet() {
		Stream.of(Constants.COULEURS).forEach(
				couleur -> Stream.of(Constants.VALEURS).forEach(valeur -> this.cartes.add(new Carte(couleur, valeur))));
		// mélanger le paquet
		Collections.shuffle(this.cartes);

	}

	public void afficherPaquet() {
		// afficher le paquet
		this.cartes.stream().forEach(c -> System.out.println(c.toString()));
	}

}
