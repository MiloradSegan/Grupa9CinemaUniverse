package cinemaJPA;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the KARTA9 database table.
 * 
 */
@Entity
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

	//bi-directional many-to-one association to Repertoar9
	@ManyToOne
	@JoinColumn(name="IDREP")
	private Repertoar9 repertoar9;

	//bi-directional many-to-one association to Zaposleni9
	@ManyToOne
	@JoinColumn(name="IDZAP")
	private Zaposleni9 zaposleni9;

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

	public Repertoar9 getRepertoar9() {
		return this.repertoar9;
	}

	public void setRepertoar9(Repertoar9 repertoar9) {
		this.repertoar9 = repertoar9;
	}

	public Zaposleni9 getZaposleni9() {
		return this.zaposleni9;
	}

	public void setZaposleni9(Zaposleni9 zaposleni9) {
		this.zaposleni9 = zaposleni9;
	}

}