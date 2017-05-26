package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the karta9 database table.
 * 
 */
@Entity
@Table(name="KARTA9")
@NamedQuery(name="Karta9.findAll", query="SELECT k FROM Karta9 k")
public class Karta9 implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idkar;

	private int brojkarata;

	private float cenakarte;

	@Temporal(TemporalType.DATE)
	private Date datumprodaje;

	private float suma;

	//bi-directional many-to-one association to Korisnik9
	@ManyToOne
	@JoinColumn(name="IDKOR")
	private Korisnik9 korisnik9;

	//bi-directional many-to-one association to Repertoar9
	@ManyToOne
	@JoinColumn(name="IDREP")
	private Repertoar9 repertoar9;

	public Karta9() {
	}

	public int getIdkar() {
		return this.idkar;
	}

	public void setIdkar(int idkar) {
		this.idkar = idkar;
	}

	public int getBrojkarata() {
		return this.brojkarata;
	}

	public void setBrojkarata(int brojkarata) {
		this.brojkarata = brojkarata;
	}

	public float getCenakarte() {
		return this.cenakarte;
	}

	public void setCenakarte(float cenakarte) {
		this.cenakarte = cenakarte;
	}

	public Date getDatumprodaje() {
		return this.datumprodaje;
	}

	public void setDatumprodaje(Date datumprodaje) {
		this.datumprodaje = datumprodaje;
	}

	public float getSuma() {
		return this.suma;
	}

	public void setSuma(float suma) {
		this.suma = suma;
	}

	public Korisnik9 getKorisnik9() {
		return this.korisnik9;
	}

	public void setKorisnik9(Korisnik9 korisnik9) {
		this.korisnik9 = korisnik9;
	}

	public Repertoar9 getRepertoar9() {
		return this.repertoar9;
	}

	public void setRepertoar9(Repertoar9 repertoar9) {
		this.repertoar9 = repertoar9;
	}

}