package com.atexio.jeudecartes.domain;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class MainTest {
	Paquet paquet;
	Main main;

	@Before
	public void setUp() throws Exception {
		paquet = new Paquet();
		paquet.initialiserPaquet();
		main = new Main();

	}

	@Test
	public void testInitialiserMain() {
		main.initialiserMain(paquet);

		List<Carte> cartes = main.getCartes();

		assertNotNull(cartes);
		assertEquals(10, cartes.size());
		cartes.forEach(carte -> {
			assertNotNull(carte);
			assertNotNull(carte.getValeur());
			assertNotNull(carte.getCouleur());
		});
	}

}
