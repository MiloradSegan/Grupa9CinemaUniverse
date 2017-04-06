package cinemaJPA;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the REPERTOAR9 database table.
 * 
 */
@Entity
@NamedQuery(name="Repertoar9.findAll", query="SELECT r FROM Repertoar9 r")
public class Repertoar9 implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idrep;

	private int cena;

	private String dan;

	private int mesta;

	private String sala;

	private String tipprojekcije;

	//bi-directional many-to-one association to Karta9
	@OneToMany(mappedBy="repertoar9")
	private List<Karta9> karta9s;

	//bi-directional many-to-one association to Film9
	@ManyToOne
	@JoinColumn(name="IDFIL")
	private Film9 film9;

	//bi-directional many-to-one association to Rezervacija9
	@OneToMany(mappedBy="repertoar9")
	private List<Rezervacija9> rezervacija9s;

	public Repertoar9() {
	}

	public int getIdrep() {
		return this.idrep;
	}

	public void setIdrep(int idrep) {
		this.idrep = idrep;
	}

	public int getCena() {
		return this.cena;
	}

	public void setCena(int cena) {
		this.cena = cena;
	}

	public String getDan() {
		return this.dan;
	}

	public void setDan(String dan) {
		this.dan = dan;
	}

	public int getMesta() {
		return this.mesta;
	}

	public void setMesta(int mesta) {
		this.mesta = mesta;
	}

	public String getSala() {
		return this.sala;
	}

	public void setSala(String sala) {
		this.sala = sala;
	}

	public String getTipprojekcije() {
		return this.tipprojekcije;
	}

	public void setTipprojekcije(String tipprojekcije) {
		this.tipprojekcije = tipprojekcije;
	}

	public List<Karta9> getKarta9s() {
		return this.karta9s;
	}

	public void setKarta9s(List<Karta9> karta9s) {
		this.karta9s = karta9s;
	}

	public Karta9 addKarta9(Karta9 karta9) {
		getKarta9s().add(karta9);
		karta9.setRepertoar9(this);

		return karta9;
	}

	public Karta9 removeKarta9(Karta9 karta9) {
		getKarta9s().remove(karta9);
		karta9.setRepertoar9(null);

		return karta9;
	}

	public Film9 getFilm9() {
		return this.film9;
	}

	public void setFilm9(Film9 film9) {
		this.film9 = film9;
	}

	public List<Rezervacija9> getRezervacija9s() {
		return this.rezervacija9s;
	}

	public void setRezervacija9s(List<Rezervacija9> rezervacija9s) {
		this.rezervacija9s = rezervacija9s;
	}

	public Rezervacija9 addRezervacija9(Rezervacija9 rezervacija9) {
		getRezervacija9s().add(rezervacija9);
		rezervacija9.setRepertoar9(this);

		return rezervacija9;
	}

	public Rezervacija9 removeRezervacija9(Rezervacija9 rezervacija9) {
		getRezervacija9s().remove(rezervacija9);
		rezervacija9.setRepertoar9(null);

		return rezervacija9;
	}

}