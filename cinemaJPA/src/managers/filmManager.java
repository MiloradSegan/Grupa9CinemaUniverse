package managers;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import cinemaJPA.Film9;
import cinemaJPA.Komentar9;
import java.util.List;
public class filmManager {
	
	public Film9 saveFilm(String naziv, String trailer, String opis, String zanr, String glumci,/*byte[] slika,*/String reditelj) {
		try {
			EntityManager em = JPAUtils.getEntityManager();
			em.getTransaction().begin();
			Film9 f = new Film9();
			f.setNaziv(naziv);
			f.setTrailer(trailer);
			f.setOpis(opis);
			f.setZanr(zanr);
			f.setGlumci(glumci);
			//f.setSlika(slika);
			f.setReditelj(reditelj);
			em.persist(f);
			em.getTransaction().commit();
			em.close();
			return f;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	public Film9 saveFilm1(String naziv, String trailer, String opis, String zanr, String glumci, String reditelj) {
		try {
			EntityManager em = JPAUtils.getEntityManager();
			em.getTransaction().begin();
			Film9 f = new Film9();
			f.setNaziv(naziv);
			f.setTrailer(trailer);
			f.setOpis(opis);
			f.setZanr(zanr);
			f.setGlumci(glumci);
			
			f.setReditelj(reditelj);
			em.persist(f);
			em.getTransaction().commit();
			em.close();
			return f;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public Film9 getFilmForId(int id){
		try{
			EntityManager em = JPAUtils.getEntityManager();
			em.getTransaction().begin();
			
			Film9 f= em.find(Film9.class, id);
			em.close();
			
			return f;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		filmManager pma = new filmManager();
		try{
			filmManager pm = new filmManager();
		
			
			Film9 f = pm.saveFilm("Avatar2","nema","naucna fantastika","fantastika","nema"/*,null*/, "adasd");
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
	

	}
	

	
//komentar
}
