package managers;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import model.Film9;
import model.Komentar9;
import model.Korisnik9;
import model.Repertoar9;
import model.Rezervacija9;


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
			k.setZaposleni(false);
			em.persist(k);
			em.getTransaction().commit();
			em.close();
			return k;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public Rezervacija9 saveRezervaciju(Integer brMesta, Korisnik9 korisnik, Repertoar9 repertoar) {
		try {
			EntityManager em = JPAUtils.getEntityManager();
			em.getTransaction().begin();
			Rezervacija9 rez = new Rezervacija9();
			rez.setMestarez(brMesta);
			rez.setKorisnik9(korisnik);
			rez.setRepertoar9(repertoar);
			em.persist(rez);
			em.getTransaction().commit();
			em.close();
			return rez;
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
	public Korisnik9  logIn(String usernamekor,String passwordkor){
		EntityManager em = JPAUtils.getEntityManager();
		TypedQuery<Korisnik9>query = em.createQuery("select k from Korisnik9 k where k.usernamekor like :usernamekor and k.passwordkor like :passwordkor", Korisnik9.class);
		query.setParameter("usernamekor", usernamekor);
		query.setParameter("passwordkor", passwordkor);
		Korisnik9 result = query.getSingleResult();
		em.close();
		return result;
	}
	public List<Korisnik9>  logIn2(String usernamekor,String passwordkor){
		EntityManager em = JPAUtils.getEntityManager();
		TypedQuery<Korisnik9>query = em.createQuery("select k from Korisnik9 k where k.usernamekor like :usernamekor and k.passwordkor like :passwordkor", Korisnik9.class);
		query.setParameter("usernamekor", usernamekor);
		query.setParameter("passwordkor", passwordkor);
		List<Korisnik9> result = query.getResultList();
		em.close();
		return result;
	}
	public Object logIn1(String usernamekor,String passwordkor){
		EntityManager em = JPAUtils.getEntityManager();
		TypedQuery<Object> q = (TypedQuery<Object>) em.createQuery("select k from Korisnik9 k where k.usernamekor like :usernamekor and k.passwordkor like :passwordkor and z from Zaposleni9 k where z.usernamezap like :usernamekor and z.passwordzap like :passwordkor");
		q.setParameter("usernamekor", usernamekor);
		q.setParameter("passwordkor", passwordkor);
		Object rez = q.getSingleResult();
			
		return rez;	
	}
	public List<Rezervacija9> getRezervacije(int idkor){
		EntityManager em = JPAUtils.getEntityManager();
		TypedQuery<Rezervacija9> q = em.createQuery("SELECT r FROM Rezervacija9 r where r.korisnik9.idkor like :idkor",Rezervacija9.class);
		q.setParameter("idkor", idkor);
		List<Rezervacija9>result = q.getResultList();
		em.close();
		return result;
	
	}
	public List<Komentar9> getKomentare(int idfil){
		EntityManager em = JPAUtils.getEntityManager();
		TypedQuery<Komentar9> q = em.createQuery("SELECT k FROM Komentar9 k where k.film9.idfil like :idfil",Komentar9.class);
		q.setParameter("idfil", idfil);
		List<Komentar9>result = q.getResultList();
		em.close();
		return result;
	
	}
	public Komentar9 saveKomentar(Film9 film,Korisnik9 korisnik, String tekst,Date date) {
		try {
			EntityManager em = JPAUtils.getEntityManager();
			em.getTransaction().begin();
			Komentar9 kom = new Komentar9();
			kom.setTekst(tekst);
			kom.setDatum(date);
			kom.setFilm9(film);
			kom.setKorisnik9(korisnik);
			em.persist(kom);
			em.getTransaction().commit();
			em.close();
			return kom;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	public List<String> getUserNames(){
		EntityManager em = JPAUtils.getEntityManager();
		TypedQuery<String> query = (TypedQuery<String>) em.createQuery("select k.usernamekor from Korisnik9 k");
		List<String> rez = query.getResultList();
		em.close();
		return rez;
		
	}
	
}
