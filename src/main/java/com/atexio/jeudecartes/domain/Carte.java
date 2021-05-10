package com.atexio.jeudecartes.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Carte {

	private String couleur;
	private int valeur;

	public String AfficherCarte() {
		return "Carte [couleur=" + couleur + ", valeur=" + getTextRepresentationOfCard(valeur) + "]";
	}

	String getTextRepresentationOfCard(int valeur) {

		String valeurString = "";
		switch (valeur) {
		case 1:
			valeurString = "AS";
			break;
		case 11:
			valeurString = "Valet";
			break;
		case 12:
			valeurString = "Dame";
			break;
		case 13:
			valeurString = "Roi";
			break;
		default:
			valeurString += valeur;
			break;
		}
		return valeurString;
	}

}
