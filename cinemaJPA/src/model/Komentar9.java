package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the KOMENTAR9 database table.
 * 
 */
@Entity
@Table(name = "KOMENTAR9")
@NamedQuery(name="Komentar9.findAll", query="SELECT k FROM Komentar9 k")
public class Komentar9 implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idkom;

	@Temporal(TemporalType.DATE)
	private Date datum;

	private String tekst;

	//bi-directional many-to-one association to Film9
	@ManyToOne
	@JoinColumn(name="IDFIL")
	private Film9 film9;

	//bi-directional many-to-one association to Korisnik9
	@ManyToOne
	@JoinColumn(name="IDKOR")
	private Korisnik9 korisnik9;

	public Komentar9() {
	}

	public int getIdkom() {
		return this.idkom;
	}

	public void setIdkom(int idkom) {
		this.idkom = idkom;
	}

	public Date getDatum() {
		return this.datum;
	}

	public void setDatum(Date datum) {
		this.datum = datum;
	}

	public String getTekst() {
		return this.tekst;
	}

	public void setTekst(String tekst) {
		this.tekst = tekst;
	}

	public Film9 getFilm9() {
		return this.film9;
	}

	public void setFilm9(Film9 film9) {
		this.film9 = film9;
	}

	public Korisnik9 getKorisnik9() {
		return this.korisnik9;
	}

	public void setKorisnik9(Korisnik9 korisnik9) {
		this.korisnik9 = korisnik9;
	}

}