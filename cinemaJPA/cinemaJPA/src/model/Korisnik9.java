package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the korisnik9 database table.
 * 
 */
@Entity
@Table(name="KORISNIK9")
@NamedQuery(name="Korisnik9.findAll", query="SELECT k FROM Korisnik9 k")
public class Korisnik9 implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idkor;

	private String emailkor;

	private String imekor;

	private String passwordkor;

	private String prezimekor;

	private String usernamekor;

	private boolean zaposleni;

	//bi-directional many-to-one association to Karta9
	@OneToMany(mappedBy="korisnik9")
	private List<Karta9> karta9s;

	//bi-directional many-to-one association to Komentar9
	@OneToMany(mappedBy="korisnik9")
	private List<Komentar9> komentar9s;

	//bi-directional many-to-one association to Rezervacija9
	@OneToMany(mappedBy="korisnik9")
	private List<Rezervacija9> rezervacija9s;

	public Korisnik9() {
	}

	public int getIdkor() {
		return this.idkor;
	}

	public void setIdkor(int idkor) {
		this.idkor = idkor;
	}

	public String getEmailkor() {
		return this.emailkor;
	}

	public void setEmailkor(String emailkor) {
		this.emailkor = emailkor;
	}

	public String getImekor() {
		return this.imekor;
	}

	public void setImekor(String imekor) {
		this.imekor = imekor;
	}

	public String getPasswordkor() {
		return this.passwordkor;
	}

	public void setPasswordkor(String passwordkor) {
		this.passwordkor = passwordkor;
	}

	public String getPrezimekor() {
		return this.prezimekor;
	}

	public void setPrezimekor(String prezimekor) {
		this.prezimekor = prezimekor;
	}

	public String getUsernamekor() {
		return this.usernamekor;
	}

	public void setUsernamekor(String usernamekor) {
		this.usernamekor = usernamekor;
	}

	public boolean getZaposleni() {
		return this.zaposleni;
	}

	public void setZaposleni(boolean zaposleni) {
		this.zaposleni = zaposleni;
	}

	public List<Karta9> getKarta9s() {
		return this.karta9s;
	}

	public void setKarta9s(List<Karta9> karta9s) {
		this.karta9s = karta9s;
	}

	public Karta9 addKarta9(Karta9 karta9) {
		getKarta9s().add(karta9);
		karta9.setKorisnik9(this);

		return karta9;
	}

	public Karta9 removeKarta9(Karta9 karta9) {
		getKarta9s().remove(karta9);
		karta9.setKorisnik9(null);

		return karta9;
	}

	public List<Komentar9> getKomentar9s() {
		return this.komentar9s;
	}

	public void setKomentar9s(List<Komentar9> komentar9s) {
		this.komentar9s = komentar9s;
	}

	public Komentar9 addKomentar9(Komentar9 komentar9) {
		getKomentar9s().add(komentar9);
		komentar9.setKorisnik9(this);

		return komentar9;
	}

	public Komentar9 removeKomentar9(Komentar9 komentar9) {
		getKomentar9s().remove(komentar9);
		komentar9.setKorisnik9(null);

		return komentar9;
	}

	public List<Rezervacija9> getRezervacija9s() {
		return this.rezervacija9s;
	}

	public void setRezervacija9s(List<Rezervacija9> rezervacija9s) {
		this.rezervacija9s = rezervacija9s;
	}

	public Rezervacija9 addRezervacija9(Rezervacija9 rezervacija9) {
		getRezervacija9s().add(rezervacija9);
		rezervacija9.setKorisnik9(this);

		return rezervacija9;
	}

	public Rezervacija9 removeRezervacija9(Rezervacija9 rezervacija9) {
		getRezervacija9s().remove(rezervacija9);
		rezervacija9.setKorisnik9(null);

		return rezervacija9;
	}

}