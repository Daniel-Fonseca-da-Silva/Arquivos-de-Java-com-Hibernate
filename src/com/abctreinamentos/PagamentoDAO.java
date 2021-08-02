package com.abctreinamentos;
// Generated Sep 3, 2019 2:02:28 AM by Hibernate Tools 5.2.11.Final

import java.io.File;
import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
/**
 * Home object for domain model class Pagamento.
 * @see com.abctreinamentos.Pagamento
 * @author Hibernate Tools
 */
public class PagamentoDAO {

	private static final Log log = LogFactory.getLog(PagamentoDAO.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		SessionFactory sessionfactory = new Configuration().
				configure(new File("src/META-INF/hibernate.cfg.xml"))
				.buildSessionFactory();
		return sessionFactory;
	}

	public void persist(Pagamento transientInstance) 
	{
		log.debug("persisting Pagamento instance");
		try 
		{
			Session session = sessionFactory.getCurrentSession();
			session.beginTransaction();
			session.persist(transientInstance);
			session.getTransaction().commit();		
			log.debug("persist successful");
		} 
		catch (RuntimeException re) 
		{
			log.error("persist failed", re);
			throw re;
		}
	}
	
	public void delete(Pagamento persistentInstance) 
	{
		log.debug("deleting Pagamento instance");
		try 
		{
			Session session = sessionFactory.getCurrentSession();
			session.beginTransaction();
			session.delete(persistentInstance);
			session.getTransaction().commit();		
			log.debug("delete successful");
		} 
		catch (RuntimeException re) 
		{
			log.error("delete failed", re);
			throw re;
		}
	}
	
	public void merge(Pagamento detachedInstance) 
	{
		log.debug("merging Pagamento instance");
		try 
		{
			Session session = sessionFactory.getCurrentSession();
			session.beginTransaction();
			session.merge(detachedInstance);
			session.getTransaction().commit();		
			log.debug("merge successful");
		} 
		catch (RuntimeException re) 
		{
			log.error("merge failed", re);
			throw re;
		}
	}
	
	public List<Pagamento> findAll() 
	{
		log.debug("getting all Clients");
		try 
		{
			Session session = sessionFactory.getCurrentSession();
			session.beginTransaction();
			//HQL
			session.getTransaction().commit();		
			log.debug("merge successful");
		} 
		catch (RuntimeException re) 
		{
			log.error("merge failed", re);
			throw re;
		}
		return null;
	}
	
	public Pagamento find(PagamentoId id) 
	{
		log.debug("getting Pagamento instance");
		try 
		{
			Session session = sessionFactory.getCurrentSession();
			session.beginTransaction();
			Pagamento Pagamento = (Pagamento) sessionFactory.getCurrentSession().get("com.abctreinamentos.Pagamento", id);
			if (Pagamento == null) {
				log.debug("get successful, no instance found");
			} else {
				log.debug("get successful, instance found");
			}
			return Pagamento;
		} 
		catch (RuntimeException re) 
		{
			log.error("merge failed", re);
			throw re;
		}
	}
}
