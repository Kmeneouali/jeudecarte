package com.atexio.jeudecartes.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Carte {

	private String couleur;
	private int valeur;

	@Override
	public String toString() {
		return "Carte [couleur=" + couleur + ", valeur=" + getTextRepresentationOfCard(valeur) + "]";
	}

	String getTextRepresentationOfCard(int valeur) {

		String s = "";
		switch (valeur) {
		case 1:
			s = "AS";
			break;
		case 11:
			s = "Valet";
			break;
		case 12:
			s = "Dame";
			break;
		case 13:
			s = "Roi";
			break;
		default:
			s += valeur;
			break;
		}
		return s;
	}

}
