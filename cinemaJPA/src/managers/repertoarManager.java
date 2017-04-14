package managers;

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import model.Film9;
import model.Komentar9;
import model.Korisnik9;
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
	
	public List<Repertoar9> pretragaTip(String tipprojekcije){
		EntityManager em = JPAUtils.getEntityManager();
		TypedQuery<Repertoar9>query = em.createQuery("select f from Repertoar9 f where f.tipprojekcije like :tipprojekcije", Repertoar9.class);
		query.setParameter("tipprojekcije", "%"+tipprojekcije+"%");
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
