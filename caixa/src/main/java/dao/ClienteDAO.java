package dao;


import java.util.List;

import org.hibernate.Session;

import org.hibernate.Transaction;
import model.Cliente;


public class ClienteDAO {
	
	public void inserirCliente(Cliente cliente) {
		Session session = HibernateUtil
                .getSessionFactory()
                .openSession();
		
		Transaction transaction = session.beginTransaction();
		
		session.persist(cliente);

        transaction.commit();

        session.close();
	}
	
	public void deletarCliente(Cliente cliente) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		
		Transaction transaction = session.beginTransaction();
		
		session.remove(cliente);
		
		transaction.commit();
		session.close();
	}
	
	public List<Cliente> listarClientes() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		
		List<Cliente> clientes = session.createQuery("from Cliente", Cliente.class).getResultList();
		
		Transaction transaction = session.beginTransaction();
		
		transaction.commit();
		session.close();
		
		return clientes;
	}
	
	public void attCliente (Cliente cliente) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		
		Transaction transaction = session.beginTransaction();
		session.merge(cliente);
		
		transaction.commit();
		session.close();
		
	}
	
	
	
}
