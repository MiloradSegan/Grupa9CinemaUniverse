package managers;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import model.Film9;
import model.Korisnik9;

public class korisnikManager {
	
	public Korisnik9 saveKorisnika(String ime, String prezime, String user, String pass, String email) {
		try {
			EntityManager em = JPAUtils.getEntityManager();
			em.getTransaction().begin();
			Korisnik9 k = new Korisnik9();
			k.setImekor(ime);
			k.setPrezimekor(prezime);
			k.setUsernamekor(user);
			k.setPasswordkor(pass);
			k.setEmailkor(email);
			em.persist(k);
			em.getTransaction().commit();
			em.close();
			return k;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	public Korisnik9  korisnikUser(String usernamekor){
		EntityManager em = JPAUtils.getEntityManager();
		TypedQuery<Korisnik9>query = em.createQuery("select k from Korisnik9 k where k.usernamekor like :usernamekor", Korisnik9.class);
		query.setParameter("usernamekor", "%"+usernamekor+"%");
		Korisnik9 result = query.getSingleResult();
		em.close();
		return result;
	}
	public List<String> getUserNames(){
		EntityManager em = JPAUtils.getEntityManager();
		TypedQuery<String> query = (TypedQuery<String>) em.createQuery("select k.usernamekor from Korisnik9 k");
		List<String> rez = query.getResultList();
		em.close();
		return rez;
		
	}
}
