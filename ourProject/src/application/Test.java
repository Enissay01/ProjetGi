package application;

import DAO.DaoAdmin;
import Metier.Beans.Admin;

public class Test {
	public static void main(String[] args) {
     DaoAdmin dao = new DaoAdmin();
     Admin ad = new Admin("yassine","hasnaoui","yassine@gmail.com","azerty123");
     dao.add(ad);
	}
}
