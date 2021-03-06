package managers;

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import model.Film9;
import model.Komentar9;
import model.Korisnik9;
import model.Ocena9;
import model.Repertoar9;
import managers.filmManager;

public class repertoarManager {
	
	public Repertoar9 saveRepertoar(int cena, String dan, int mesta, String sala,String tip,Film9 film,Time vreme,Date datumpro) {
		try {
			EntityManager em = JPAUtils.getEntityManager();
			em.getTransaction().begin();
			Repertoar9 r = new Repertoar9();
			r.setCena(cena);
			r.setDan(dan);
			r.setMesta(mesta);
			r.setSala(sala);
			r.setTipprojekcije(tip);
			r.setFilm9(film);
			r.setVreme(vreme);
			r.setDatumpro(datumpro);
			
			em.persist(r);
			em.getTransaction().commit();
			em.close();
			return r;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	public List<Repertoar9> pretragaDatuma(Date datumOd, Date datumDo){
		EntityManager em = JPAUtils.getEntityManager();
		TypedQuery<Repertoar9>q = em.createQuery("select r from Repertoar9 r where r.datumpro between :datumOd and :datumDo", Repertoar9.class);
		q.setParameter("datumOd", datumOd);
		q.setParameter("datumDo",datumDo);
		List<Repertoar9>result = q.getResultList();
		em.close();
		return result;
	}
   
	public List<Repertoar9> pretragaCurrentDate(Date datum){
		EntityManager em = JPAUtils.getEntityManager();
		TypedQuery<Repertoar9>q = em.createQuery("select r from Repertoar9 r where r.datumpro like :datum", Repertoar9.class);
		q.setParameter("datum", datum);
		List<Repertoar9>result = q.getResultList();
		em.close();
		return result;
	}

	public static List<Repertoar9> pretragaTip(String tipprojekcije){
		EntityManager em = JPAUtils.getEntityManager();
		TypedQuery<Repertoar9>query = em.createQuery("select f from Repertoar9 f where f.tipprojekcije like :tipprojekcije", Repertoar9.class);
		query.setParameter("tipprojekcije", "%"+tipprojekcije+"%");
		List<Repertoar9>result = query.getResultList();
		em.close();
		return result;
	}
	public List<Repertoar9> pretragaZanraFilma(String zanr){
		EntityManager em = JPAUtils.getEntityManager();
		TypedQuery<Repertoar9>query = em.createQuery("SELECT r FROM Repertoar9 r join r.film9 f WHERE f.zanr like :zanr", Repertoar9.class);
		query.setParameter("zanr", zanr);
		List<Repertoar9>result = query.getResultList();
		em.close();
		return result;
	}
	
	
	public List<Repertoar9> getRepertoare(){
    	EntityManager em = JPAUtils.getEntityManager();
    	TypedQuery<Repertoar9> q = em.createQuery("select r FROM Repertoar9 r",Repertoar9.class);
    	List<Repertoar9> rez = q.getResultList();
    	em.close();
    	return rez;
    	
    }
	
	public void update1(int idrep, int brmesta){
		EntityManager em = JPAUtils.getEntityManager();
	     Repertoar9 r = em.find(Repertoar9.class, idrep);
	 
	    em.getTransaction().begin();
	    r.setMesta(brmesta);
	    em.getTransaction().commit();
	}
	
	public Double br(int idfil){
		EntityManager em = JPAUtils.getEntityManager();
		TypedQuery<Double> q= (TypedQuery<Double>) em.createQuery("select (SUM(o.ocena)/count(o.ocena)) from Ocena9 o where o.film9.idfil like :idfil");
		q.setParameter("idfil", idfil);
		Double rez =q.getSingleResult();
		em.close();
		return rez;
	}
	
	public Ocena9 saveOcena(float ocena, Film9 film) {
		try {
			EntityManager em = JPAUtils.getEntityManager();
			em.getTransaction().begin();
			Ocena9 o = new Ocena9();
			o.setOcena(ocena);
			o.setFilm9(film);
			o.setDate(new Date());
			em.persist(o);
			em.getTransaction().commit();
			em.close();
			return o;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	
	public Repertoar9 getRepForId(int idrep){
		EntityManager em = JPAUtils.getEntityManager();
		TypedQuery<Repertoar9> query =  em.createQuery("select r from Repertoar9 r where r.idrep like :idrep",Repertoar9.class);
		query.setParameter("idrep", idrep);
		Repertoar9 rez = query.getSingleResult();
		em.close();
		return rez;
		
	}
	/*public Repertoar9 saveRepertoar(int idfil, String dan, String sala, int mesta, int cena,String tip) {
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
	}*/
	public List<Repertoar9> salaPrikazivanja(String sala){
		EntityManager em = JPAUtils.getEntityManager();
    	TypedQuery<Repertoar9> q = em.createQuery("select r from Repertoar9 r where sala like :sala",Repertoar9.class);
    	q.setParameter("sala",sala);
    	List<Repertoar9> rez =q.getResultList();
    	em.close();
    	return rez;
	}
    public List<Repertoar9> poVremenu(Time vreme){
    	EntityManager em = JPAUtils.getEntityManager();
    	TypedQuery<Repertoar9> q = em.createQuery("select r from Repertoar9 r where vreme =:vreme",Repertoar9.class);
    	q.setParameter("vreme",vreme);

    	List<Repertoar9> rez =q.getResultList();
    	em.close();
    	return rez;
    }
    public List<Repertoar9> brojSlobodnihMesta(int mesto){
		EntityManager em = JPAUtils.getEntityManager();
    	TypedQuery<Repertoar9> q = em.createQuery("select r from Repertoar9 r where mesta > :mesto",Repertoar9.class);
    	q.setParameter("mesto",mesto);
    	List<Repertoar9> rez =q.getResultList();
    	em.close();
    	return rez;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	repertoarManager rma = new repertoarManager();
		filmManager fm=new filmManager();
		try{
			repertoarManager rm = new repertoarManager();
			int id = 1;
			Film9 f = fm.getFilmForId(id);
			
			String datum ="1992-10-10";
			
			String vreme ="12:00:00";
			SimpleDateFormat format = new SimpleDateFormat("HH:mm");
			Date d1 =(Date)format.parse(vreme);
			Time time = new Time(d1.getTime());
			
			//System.out.println("1");
			Repertoar9 r = rm.saveRepertoar(11,"uto",20,"mala","projekcija",f,time,new Date());
			
		}catch(Exception e){
			e.printStackTrace();
		}
*/
			
	}

}
