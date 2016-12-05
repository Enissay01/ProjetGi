package Metier.Beans;

import java.util.Date;

public class Location {
	int idLocation;
	Voiture v;
	Client c;
	Date dateDebut;
	Date dateFin;
	public Location() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Location(Voiture v, Client c, Date dateDebut, Date dateFin) {
		super();
		this.v = v;
		this.c = c;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
	}
	public int getIdLocation() {
		return idLocation;
	}
	public Voiture getV() {
		return v;
	}
	public void setV(Voiture v) {
		this.v = v;
	}
	public Client getC() {
		return c;
	}
	public void setC(Client c) {
		this.c = c;
	}
	public Date getDateDebut() {
		return dateDebut;
	}
	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}
	public Date getDateFin() {
		return dateFin;
	}
	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}
	
	

}
