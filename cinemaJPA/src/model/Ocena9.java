package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the ocena9 database table.
 * 
 */
@Entity
@Table(name="OCENA9")
@NamedQuery(name="Ocena9.findAll", query="SELECT o FROM Ocena9 o")
public class Ocena9 implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idocena;

	@Temporal(TemporalType.DATE)
	private Date date;

	private float ocena;

	//bi-directional many-to-one association to Film9
	@ManyToOne
	@JoinColumn(name="IDFIL")
	private Film9 film9;

	public Ocena9() {
	}

	public int getIdocena() {
		return this.idocena;
	}

	public void setIdocena(int idocena) {
		this.idocena = idocena;
	}

	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public float getOcena() {
		return this.ocena;
	}

	public void setOcena(float ocena) {
		this.ocena = ocena;
	}

	public Film9 getFilm9() {
		return this.film9;
	}

	public void setFilm9(Film9 film9) {
		this.film9 = film9;
	}

}