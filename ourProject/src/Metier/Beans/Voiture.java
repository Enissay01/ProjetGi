package Metier.Beans;

import java.util.ArrayList;

public class Voiture {
int idVoiture;
String marque;
String type;
String dateMiseServise;
float prix;
ArrayList<Location> mesLocations ;
public Voiture(String marque, String type, String dateMiseServise, float prix, ArrayList<Location> mesLocations) {
	super();
	this.marque = marque;
	this.type = type;
	this.dateMiseServise = dateMiseServise;
	this.prix = prix;
	this.mesLocations = mesLocations;
}
public Voiture() {
	super();
	mesLocations = new ArrayList<Location>();
	// TODO Auto-generated constructor stub
}
public int getIdVoiture() {
	return idVoiture;
}
public void setIdVoiture(int idVoiture) {
	this.idVoiture = idVoiture;
}
public String getMarque() {
	return marque;
}
public void setMarque(String marque) {
	this.marque = marque;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public String getDateMiseServise() {
	return dateMiseServise;
}
public void setDateMiseServise(String dateMiseServise) {
	this.dateMiseServise = dateMiseServise;
}
public float getPrix() {
	return prix;
}
public void setPrix(float prix) {
	this.prix = prix;
}
public ArrayList<Location> getMesLocations() {
	return mesLocations;
}
public void setMesLocations(ArrayList<Location> mesLocations) {
	this.mesLocations = mesLocations;
}



}
