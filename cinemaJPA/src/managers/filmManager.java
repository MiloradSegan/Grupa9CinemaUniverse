package managers;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import model.Film9;
import model.Komentar9;
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
	public List<String> getNaziveFilmova(){
		EntityManager em = JPAUtils.getEntityManager();
		TypedQuery<String> query =(TypedQuery<String>) em.createQuery("select f.naziv from Film9 f");
		List<String> rez = query.getResultList();
		em.close();
		return rez;
		
	}
	public Film9  findNaziv(String naziv){
		EntityManager em = JPAUtils.getEntityManager();
		TypedQuery<Film9>query = em.createQuery("select f from Film9 f where f.naziv like :naziv", Film9.class);
		query.setParameter("naziv", "%"+naziv+"%");
		Film9 result = query.getSingleResult();
		em.close();
		return result;
	}
	public static List<Film9>  pretragaNaziv(String naziv){
		EntityManager em = JPAUtils.getEntityManager();
		TypedQuery<Film9>query = em.createQuery("select f from Film9 f where f.naziv like :naziv", Film9.class);
		query.setParameter("naziv", "%"+naziv+"%");
		List<Film9>result = query.getResultList();
		em.close();
		return result;
	}
	public List<Film9> pretragaZanr(String zanr){
		EntityManager em = JPAUtils.getEntityManager();
		TypedQuery<Film9>query = em.createQuery("select f from Film9 f where f.zanr like :zanr", Film9.class);
		query.setParameter("zanr", "%"+zanr+"%");
		List<Film9>result = query.getResultList();
		em.close();
		return result;
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
