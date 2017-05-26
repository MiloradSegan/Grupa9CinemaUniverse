package beans;

import java.io.Serializable;
import java.util.List;

import managers.filmManager;

public class sviFilmoviBean implements Serializable {
	private static final long serialVersionUID = 1L;
	private List<String> nazivi;
	
	public sviFilmoviBean() {
		nazivi = new filmManager().getNaziveFilmova();
	}

	public List<String> getNazivi() {
		return nazivi;
	}

	public void setNazivi(List<String> nazivi) {
		this.nazivi = nazivi;
	}

}
