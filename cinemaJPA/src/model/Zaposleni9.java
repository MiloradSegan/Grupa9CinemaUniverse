package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the ZAPOSLENI9 database table.
 * 
 */
@Entity
@Table(name = "ZAPOSLENI9")
@NamedQuery(name="Zaposleni9.findAll", query="SELECT z FROM Zaposleni9 z")
public class Zaposleni9 implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idzap;

	private String imezap;

	private String passwordzap;

	private String prezimezap;

	private String tipzap;

	private String usernamezap;

	//bi-directional many-to-one association to Karta9
	@OneToMany(mappedBy="zaposleni9")
	private List<Karta9> karta9s;

	public Zaposleni9() {
	}

	public int getIdzap() {
		return this.idzap;
	}

	public void setIdzap(int idzap) {
		this.idzap = idzap;
	}

	public String getImezap() {
		return this.imezap;
	}

	public void setImezap(String imezap) {
		this.imezap = imezap;
	}

	public String getPasswordzap() {
		return this.passwordzap;
	}

	public void setPasswordzap(String passwordzap) {
		this.passwordzap = passwordzap;
	}

	public String getPrezimezap() {
		return this.prezimezap;
	}

	public void setPrezimezap(String prezimezap) {
		this.prezimezap = prezimezap;
	}

	public String getTipzap() {
		return this.tipzap;
	}

	public void setTipzap(String tipzap) {
		this.tipzap = tipzap;
	}

	public String getUsernamezap() {
		return this.usernamezap;
	}

	public void setUsernamezap(String usernamezap) {
		this.usernamezap = usernamezap;
	}

	public List<Karta9> getKarta9s() {
		return this.karta9s;
	}

	public void setKarta9s(List<Karta9> karta9s) {
		this.karta9s = karta9s;
	}

	public Karta9 addKarta9(Karta9 karta9) {
		getKarta9s().add(karta9);
		karta9.setZaposleni9(this);

		return karta9;
	}

	public Karta9 removeKarta9(Karta9 karta9) {
		getKarta9s().remove(karta9);
		karta9.setZaposleni9(null);

		return karta9;
	}

}