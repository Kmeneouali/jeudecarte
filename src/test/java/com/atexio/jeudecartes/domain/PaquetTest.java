package com.atexio.jeudecartes.domain;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class PaquetTest {
	Paquet paquet = new Paquet();

	@Before
	public void setUp() throws Exception {

	}

	@Test
	public void test_initialiser_paquet() {
		Paquet paquet = new Paquet();
		paquet.initialiserPaquet();
		List<Carte> cartes = paquet.getCartes();
		assertNotNull(paquet.getCartes());
		assertEquals(52, cartes.size());
		cartes.forEach(carte -> {
			assertNotNull(carte);
			assertNotNull(carte.getValeur());
			assertNotNull(carte.getCouleur());
		});
	}

}
