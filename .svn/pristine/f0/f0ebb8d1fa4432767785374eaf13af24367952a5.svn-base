package org.BOL;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class BusinessObjectLogic
{
	
	protected static SessionFactory sessionFactory;

	protected static  void setUp() throws Exception 
	{
		// A SessionFactory is set up once for an application
        sessionFactory = new Configuration()
                .configure() // configures settings from hibernate.cfg.xml
                .buildSessionFactory();
	}

	protected static void tearDown() throws Exception 
	{
		if ( sessionFactory != null ) {
			sessionFactory.close();
		}
	}

}
