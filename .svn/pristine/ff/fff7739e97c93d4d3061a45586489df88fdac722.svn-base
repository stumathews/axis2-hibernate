package org.BOL;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
public class User extends org.BOL.BusinessObjectLogic
{
	
	public User()
	{
	}
	public static String doSomething(String something)
	{
		return something;
	}
	public static org.BOLO.User getUser(String username, String password)
	{
		org.BOLO.User user = new org.BOLO.User();
		user.setUsername(username);
		user.setPassword(password);
		return user;
	}
	
	public static boolean createUser( String username, String password, String meta ) throws Exception
	{
		setUp();
			Session session = sessionFactory.openSession();
			session.beginTransaction();
			org.DAL.DEL.User user = new org.DAL.DEL.User();
				user.setUsername(username);
				user.setPassword(password);
				user.setMeta(meta);
			Long id = (Long) session.save( user );
			session.getTransaction().commit();
			session.close();
		tearDown();
	
		return id != null?true:false;

	}
}
