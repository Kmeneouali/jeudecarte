package com.atexio.jeudecartes.domain;

public class Carte {

	private String couleur;
	private int valeur;

	public Carte(String couleur, int valeur) {
		this.couleur = couleur;
		this.valeur = valeur;
	}

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	public int getValeur() {
		return valeur;
	}

	public void setValeur(int valeur) {
		this.valeur = valeur;
	}

	public String AfficherCarte() {
		return "Carte [couleur=" + couleur + ", valeur=" + getTextCarte(valeur) + "]";
	}

	String getTextCarte(int valeur) {

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
