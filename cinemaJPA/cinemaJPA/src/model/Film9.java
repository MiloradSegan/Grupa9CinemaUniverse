package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the film9 database table.
 * 
 */
@Entity
@Table(name="FILM9")
@NamedQuery(name="Film9.findAll", query="SELECT f FROM Film9 f")
public class Film9 implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idfil;

	private String glumci;

	private String naziv;

	private Float ocena;

	private String opis;

	private String reditelj;

	@Lob
	private byte[] slika;

	private String trailer;

	private String zanr;

	//bi-directional many-to-one association to Komentar9
	@OneToMany(mappedBy="film9")
	private List<Komentar9> komentar9s;

	//bi-directional many-to-one association to Ocena9
	@OneToMany(mappedBy="film9")
	private List<Ocena9> ocena9s;

	//bi-directional many-to-one association to Repertoar9
	@OneToMany(mappedBy="film9")
	private List<Repertoar9> repertoar9s;

	public Film9() {
	}

	public int getIdfil() {
		return this.idfil;
	}

	public void setIdfil(int idfil) {
		this.idfil = idfil;
	}

	public String getGlumci() {
		return this.glumci;
	}

	public void setGlumci(String glumci) {
		this.glumci = glumci;
	}

	public String getNaziv() {
		return this.naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public Float getOcena() {
		return this.ocena;
	}

	public void setOcena(Float ocena) {
		this.ocena = ocena;
	}

	public String getOpis() {
		return this.opis;
	}

	public void setOpis(String opis) {
		this.opis = opis;
	}

	public String getReditelj() {
		return this.reditelj;
	}

	public void setReditelj(String reditelj) {
		this.reditelj = reditelj;
	}

	public byte[] getSlika() {
		return this.slika;
	}

	public void setSlika(byte[] slika) {
		this.slika = slika;
	}

	public String getTrailer() {
		return this.trailer;
	}

	public void setTrailer(String trailer) {
		this.trailer = trailer;
	}

	public String getZanr() {
		return this.zanr;
	}

	public void setZanr(String zanr) {
		this.zanr = zanr;
	}

	public List<Komentar9> getKomentar9s() {
		return this.komentar9s;
	}

	public void setKomentar9s(List<Komentar9> komentar9s) {
		this.komentar9s = komentar9s;
	}

	public Komentar9 addKomentar9(Komentar9 komentar9) {
		getKomentar9s().add(komentar9);
		komentar9.setFilm9(this);

		return komentar9;
	}

	public Komentar9 removeKomentar9(Komentar9 komentar9) {
		getKomentar9s().remove(komentar9);
		komentar9.setFilm9(null);

		return komentar9;
	}

	public List<Ocena9> getOcena9s() {
		return this.ocena9s;
	}

	public void setOcena9s(List<Ocena9> ocena9s) {
		this.ocena9s = ocena9s;
	}

	public Ocena9 addOcena9(Ocena9 ocena9) {
		getOcena9s().add(ocena9);
		ocena9.setFilm9(this);

		return ocena9;
	}

	public Ocena9 removeOcena9(Ocena9 ocena9) {
		getOcena9s().remove(ocena9);
		ocena9.setFilm9(null);

		return ocena9;
	}

	public List<Repertoar9> getRepertoar9s() {
		return this.repertoar9s;
	}

	public void setRepertoar9s(List<Repertoar9> repertoar9s) {
		this.repertoar9s = repertoar9s;
	}

	public Repertoar9 addRepertoar9(Repertoar9 repertoar9) {
		getRepertoar9s().add(repertoar9);
		repertoar9.setFilm9(this);

		return repertoar9;
	}

	public Repertoar9 removeRepertoar9(Repertoar9 repertoar9) {
		getRepertoar9s().remove(repertoar9);
		repertoar9.setFilm9(null);

		return repertoar9;
	}

}