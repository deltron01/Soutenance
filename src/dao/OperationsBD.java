package dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import hbutil.HibernateUtil;

public class OperationsBD implements Operations {

	public void init(){
		System.out.println(" initiate SOUTENANCEs Maatalla $");
	/*	ajouterSoutenance(new Soutenance("Informatique","MAATALLA Ali","MAATALLA Ali bis","Réalisation d'une application java EE", 
		"M. Elhouma", "M. Elhouma","ENIM", "Parrain1","Parrain2",new Date(20150612),"Grande Salle Info","le Président","M. Elhouma","M. Jury2","M. Jury3"));
		ajouterSoutenance(new Soutenance("Informatique","Bill GATES","Larry ELLISON","Developpement d'un nouveau SGBD", 
				"MAATALLA Ali", "Encadrant 2","Microsoft", "Parrain3","Parrain4",new Date(20150626),"Amphi 2B","Barack OBAMA","MAATALLA Ali","M. Jury5","M. Jury6"));
		ajouterSoutenance(new Soutenance("Electromécanique","James MAXWELL","Gustav KIRCHHOF","Electromagnetic Laws", 
				"MAATALLA Ali", "Michael FARADAY","Oxford", "Parrain5","Parrain6",new Date(20150611),"Amphi 2A","le Président","M. Jury 8","MAATALLA Ali","M. Jury6"));
		ajouterSoutenance(new Soutenance("Génie des Procédés Industriels","Ludwig Prandtl","Henri Becquerel","Expériences thermiques", 
				"Isaac NEWTON", "MAATALLA","ENIM", "Parrain9","Parrain10",new Date(20150713),"Amphi 2A","Antoine LAVOISIER","M. Jury 8","M. Jury 11","MAATALLA Ali"));
				*/
	}
	@Override
	public Soutenance getSoutenanceById(Long id) {
		Session session;		
		try {         
			   session = HibernateUtil.getSessionFactory().getCurrentSession();  
		} catch (org.hibernate.HibernateException exp) {  
			   session = HibernateUtil.getSessionFactory().openSession();     
		} 		
		session.beginTransaction();
		Soutenance S = (Soutenance) session.load(Soutenance.class, id);
		return S;
	}

	@Override
	public void ajouterSoutenance(Soutenance S) {
		Session session;		
		try {         
			   session = HibernateUtil.getSessionFactory().getCurrentSession();  
		} catch (org.hibernate.HibernateException exp) {  
			   session = HibernateUtil.getSessionFactory().openSession();     
		} 		
		session.beginTransaction();
		session.save(S);
		session.getTransaction().commit();
		
	}

	@Override
	public List<Soutenance> getAllSoutenances() {
		Session session;		
		try {         
			   session = HibernateUtil.getSessionFactory().getCurrentSession();  
		} catch (org.hibernate.HibernateException exp) {  
			   session = HibernateUtil.getSessionFactory().openSession();     
		} 		
		session.beginTransaction();
		return  session.createQuery("FROM Soutenance").list();
	}

	@Override
	public void annulerSoutenance(Long id) {
		Session session;		
		try {         
			   session = HibernateUtil.getSessionFactory().getCurrentSession();  
		} catch (org.hibernate.HibernateException exp) {  
			   session = HibernateUtil.getSessionFactory().openSession();     
		} 		
		session.beginTransaction();
		Soutenance S = (Soutenance) session.load(Soutenance.class, id);
		session.delete(S);
		session.getTransaction().commit();

	}
	@Override
	public List<Soutenance> getSoutenanceByEtudiant(String v) {
		Session session;		
		try {         
			   session = HibernateUtil.getSessionFactory().getCurrentSession();  
		} catch (org.hibernate.HibernateException exp) {  
			   session = HibernateUtil.getSessionFactory().openSession();     
		}		
		Query query;
		query = session.createQuery("from Soutenance where etudiant1 like :searchkey or etudiant2 like :searchkey");
		query.setParameter("searchkey", "%" + v + "%");
		session.beginTransaction();		 
		return  query.list();		 
			
	}
	@Override
	public List<Soutenance> getSoutenanceByEncadrant(String v) {
		Session session;		
		try {         
			   session = HibernateUtil.getSessionFactory().getCurrentSession();  
		} catch (org.hibernate.HibernateException exp) {  
			   session = HibernateUtil.getSessionFactory().openSession();     
		}		
		Query query;
		query = session.createQuery("from Soutenance where encadrant1 like :searchkey or encadrant2 like :searchkey");
		query.setParameter("searchkey", "%" + v + "%");
		session.beginTransaction();		 
		return  query.list();
	}
	@Override
	public List<Soutenance> getSoutenanceByJury(String v) {
		Session session;		
		try {         
			   session = HibernateUtil.getSessionFactory().getCurrentSession();  
		} catch (org.hibernate.HibernateException exp) {  
			   session = HibernateUtil.getSessionFactory().openSession();     
		}		
		Query query;
		query = session.createQuery("from Soutenance where jury1 like :searchkey or jury2 like :searchkey or jury3 like :searchkey");
		query.setParameter("searchkey", "%" + v + "%");
		session.beginTransaction();		 
		return  query.list();
	}
	@Override
	public List<Soutenance> getSoutenanceByOrganisme(String v) {
		Session session;		
		try {         
			   session = HibernateUtil.getSessionFactory().getCurrentSession();  
		} catch (org.hibernate.HibernateException exp) {  
			   session = HibernateUtil.getSessionFactory().openSession();     
		}		
		Query query;
		query = session.createQuery("from Soutenance where organisme like :searchkey");
		query.setParameter("searchkey", "%" + v + "%");
		session.beginTransaction();		 
		return  query.list();
	}
	public List<Soutenance> getSoutenanceByDate(String v, String w) {
		Session session;		
		try {         
			   session = HibernateUtil.getSessionFactory().getCurrentSession();  
		} catch (org.hibernate.HibernateException exp) {  
			   session = HibernateUtil.getSessionFactory().openSession();     
		}	
		String ch = "from Soutenance where datesoutenance between '"+v+"' and "+"'"+w+"'";
		Query query;
		query = session.createQuery(ch);
		session.beginTransaction();		 
		return  query.list();		 
			
	}
	/*@Override
	public List<Soutenance> getSoutenanceByField(String f, String v) {
		Session session;		
		try {         
			   session = HibernateUtil.getSessionFactory().getCurrentSession();  
		} catch (org.hibernate.HibernateException exp) {  
			   session = HibernateUtil.getSessionFactory().openSession();     
		}		
		Query query;
		if ( f.equals("etudiant")){
			System.out.println("  -- c'est bien un étudiant --");
		 query = session.createQuery("from Soutenance where etudiant1 like :searchkey or etudiant2 like :searchkey");
		 query.setParameter("searchkey", "%" + v + "%");
		 session.beginTransaction();		 
		 return  query.list();		 
		}
		System.out.println("  -- ce N'est PAS un étudiant --");
		return null;
	}*/

}
