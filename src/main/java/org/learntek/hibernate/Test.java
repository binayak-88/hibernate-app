/**
 * 
 */
package org.learntek.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.learntek.hibernate.entity.Account;

/**
 * @author HP
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
	//	Transaction txn = session.beginTransaction();
		
		Account account =  session.get(Account.class, 10002);
		System.out.println(account.getAccountno());
		System.out.println(account.getAcchname());
		System.out.println(account.getAccbal());
		session.close();
		sessionFactory.close();
		
	//	txn.commit();
	//	txn.rollback();
		
	}
}