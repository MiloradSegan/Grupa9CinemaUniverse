package managers;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import model.Karta9;
import model.Korisnik9;
import model.Repertoar9;


public class radnikManager {

	public Korisnik9 saveRadnika(String ime, String prezime, String user, String pass, String email) {
		try {
			EntityManager em = JPAUtils.getEntityManager();
			em.getTransaction().begin();
			Korisnik9 k = new Korisnik9();
			k.setImekor(ime);
			k.setPrezimekor(prezime);
			k.setUsernamekor(user);
			k.setPasswordkor(pass);
			k.setEmailkor(email);
			k.setZaposleni(true);
			em.persist(k);
			em.getTransaction().commit();
			em.close();
			return k;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	public double getSum(Date datumOd, Date datumDo){
			EntityManager em = JPAUtils.getEntityManager();
			TypedQuery<Double> q = (TypedQuery<Double>) em.createQuery("select SUM (k.suma) from Karta9 k where k.datumprodaje between :datumOd and :datumDo");
			q.setParameter("datumOd", datumOd);
			q.setParameter("datumDo",datumDo);
			Double r = q.getSingleResult();
			

		return r;
	}
	public Karta9 prodajKartu(Repertoar9 rep, Korisnik9 kor, Date datum, float cena, int brK) {
		try {
			EntityManager em = JPAUtils.getEntityManager();
			em.getTransaction().begin();
			Karta9 k = new Karta9();
			k.setRepertoar9(rep);
			k.setKorisnik9(kor);
			k.setDatumprodaje(datum);
			k.setCenakarte(cena);
			k.setBrojkarata(brK);
			k.setSuma(k.getCenakarte()*k.getBrojkarata());
			em.persist(k);
			em.getTransaction().commit();
			em.close();
			return k;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	/*public Zaposleni9  logInZap(String usernamezap,String passwordzap){
		EntityManager em = JPAUtils.getEntityManager();
		TypedQuery<Zaposleni9>query = em.createQuery("select z from Zaposleni9 k where z.usernamezap like :usernamezap and k.passwordzap like :passwordzap", Zaposleni9.class);
		query.setParameter("usernamezap", usernamezap);
		query.setParameter("passwordzap", passwordzap);
		Zaposleni9 result = query.getSingleResult();
		em.close();
		return result;
	}*/
	public List<String> getUserNamesZap(){
		EntityManager em = JPAUtils.getEntityManager();
		TypedQuery<String> query = (TypedQuery<String>) em.createQuery("select k.usernamekor from Korisnik9 k");
		List<String> rez = query.getResultList();
		em.close();
		return rez;
		
	}
}
