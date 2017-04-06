package cinemaJPA;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the REZERVACIJA9 database table.
 * 
 */
@Entity
@NamedQuery(name="Rezervacija9.findAll", query="SELECT r FROM Rezervacija9 r")
public class Rezervacija9 implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idrez;

	private int mestarez;

	//bi-directional many-to-one association to Repertoar9
	@ManyToOne
	@JoinColumn(name="IDREP")
	private Repertoar9 repertoar9;

	//bi-directional many-to-one association to Korisnik9
	@ManyToOne
	@JoinColumn(name="IDKOR")
	private Korisnik9 korisnik9;

	public Rezervacija9() {
	}

	public int getIdrez() {
		return this.idrez;
	}

	public void setIdrez(int idrez) {
		this.idrez = idrez;
	}

	public int getMestarez() {
		return this.mestarez;
	}

	public void setMestarez(int mestarez) {
		this.mestarez = mestarez;
	}

	public Repertoar9 getRepertoar9() {
		return this.repertoar9;
	}

	public void setRepertoar9(Repertoar9 repertoar9) {
		this.repertoar9 = repertoar9;
	}

	public Korisnik9 getKorisnik9() {
		return this.korisnik9;
	}

	public void setKorisnik9(Korisnik9 korisnik9) {
		this.korisnik9 = korisnik9;
	}

}