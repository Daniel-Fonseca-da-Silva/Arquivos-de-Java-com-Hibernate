package com.abctreinamentos;
// Generated Sep 3, 2019 2:02:28 AM by Hibernate Tools 5.2.11.Final

import java.io.File;
import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Example;

/**
 * Home object for domain model class Cliente.
 * @see com.abctreinamentos.Cliente
 * @author Hibernate Tools
 */
public class ClienteDAO {

	private static final Log log = LogFactory.getLog(ClienteDAO.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		SessionFactory sessionfactory = new Configuration().
				configure(new File("src/META-INF/hibernate.cfg.xml"))
				.buildSessionFactory();
		return sessionFactory;
	}

	public void persist(Cliente transientInstance) 
	{
		log.debug("persisting Cliente instance");
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
	
	public void delete(Cliente persistentInstance) 
	{
		log.debug("deleting Cliente instance");
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
	
	public void merge(Cliente detachedInstance) 
	{
		log.debug("merging Cliente instance");
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
	
	public List<Cliente> findAll() 
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
	
	public Cliente find(int cpf) 
	{
		log.debug("getting Cliente instance");
		try 
		{
			Session session = sessionFactory.getCurrentSession();
			session.beginTransaction();
			Cliente cliente = (Cliente) sessionFactory.getCurrentSession().get("com.abctreinamentos.Cliente", cpf);
			if (cliente == null) {
				log.debug("get successful, no instance found");
			} else {
				log.debug("get successful, instance found");
			}
			return cliente;
		} 
		catch (RuntimeException re) 
		{
			log.error("merge failed", re);
			throw re;
		}
	}
	
	
}
