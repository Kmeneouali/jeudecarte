package com.atexio.jeudecartes.domain;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class JoueurTest {

	Paquet paquet;

	@Before
	public void setUp() throws Exception {
		paquet = new Paquet();
		paquet.initialiserPaquet();
	}

	@Test
	public void testTirerMain() {

		Joueur joueur = new Joueur();
		joueur.getMain().initialiserMain(paquet);
		List<Carte> cartes = joueur.getMain().getCartes();

		assertNotNull(cartes);
		assertEquals(10, cartes.size());
		cartes.forEach(carte -> {
			assertNotNull(carte);
			assertNotNull(carte.getValeur());
			assertNotNull(carte.getCouleur());
		});

	}

	@Test
	public void testTrierMain() {

	}

}
