package managers;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import cinemaJPA.Film9;
import cinemaJPA.Komentar9;
import cinemaJPA.Korisnik9;
import cinemaJPA.Repertoar9;

public class repertoarManager {
	
	public Repertoar9 saveRepertoar(int idfil, String dan, String sala, int mesta, int cena,String tip) {
		try {
			EntityManager em = JPAUtils.getEntityManager();
			
			TypedQuery<Film9> q1 = em.createQuery("SELECT f FROM Film9 f WHERE f.idfil = :idfil", Film9.class);
			q1.setParameter("idfil", idfil);
			Film9 f = q1.getSingleResult();
			
			
			em.getTransaction().begin();			
			Repertoar9 r = new Repertoar9();
			
			
			r.setFilm9(f);			
			r.setDan(dan);
			r.setSala(sala);
			r.setMesta(mesta);
			r.setCena(cena);
			r.setTipprojekcije(tip);
			
			em.persist(r);
			em.getTransaction().commit();
			em.close();
			return r;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		repertoarManager rma = new repertoarManager();
		try{
			repertoarManager rm = new repertoarManager();
		
			//System.out.println("1");
			Repertoar9 r = rm.saveRepertoar(1,"ponedeljak","mala",20,200,"projekcija");
			
		}catch(Exception e){
			e.printStackTrace();
		}

	}

}
