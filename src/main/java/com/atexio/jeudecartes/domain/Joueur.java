package com.atexio.jeudecartes.domain;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Joueur {

	private Main main = new Main();

	public Main getMain() {
		return main;
	}

	public void tirerMain(Paquet paquet) {
		this.main.initialiserMain(paquet);
	}

	public void trierMain() {
		List<Carte> sortedList = this.main.getCartes().stream().sorted(
				Comparator.comparing(Carte::getCouleur).thenComparing(Comparator.comparingInt(Carte::getValeur)))
				.collect(Collectors.toList());
		this.main.setCartes(sortedList);

		main.afficherMain();

	}

}
