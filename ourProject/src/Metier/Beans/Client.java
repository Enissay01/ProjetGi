package Metier.Beans;

public class Client extends Personne{
	String tel;
	String cin;
	String permis;
	String codeBanc;
	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Client(String tel, String cin, String permis, String codeBanc) {
		super();
		this.tel = tel;
		this.cin = cin;
		this.permis = permis;
		this.codeBanc = codeBanc;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getCin() {
		return cin;
	}
	public void setCin(String cin) {
		this.cin = cin;
	}
	public String getPermis() {
		return permis;
	}
	public void setPermis(String permis) {
		this.permis = permis;
	}
	public String getCodeBanc() {
		return codeBanc;
	}
	public void setCodeBanc(String codeBanc) {
		this.codeBanc = codeBanc;
	}
	

}
