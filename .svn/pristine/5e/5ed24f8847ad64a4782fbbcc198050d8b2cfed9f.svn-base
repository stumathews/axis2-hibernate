package org.BOL;
import org.BOLO.Employee;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.HibernateException; 
import org.hibernate.Session; 
import org.hibernate.Transaction;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class JavaDiagnostics
{
		private static SessionFactory factory;		

    public JavaDiagnostics(){}
		public String[] getClassPaths()
		{
			ClassLoader cl = ClassLoader.getSystemClassLoader();
 
      URL[] urls = ((URLClassLoader)cl).getURLs();
			List<String> url_list = new ArrayList<String>();

			for( URL url : urls )
		  {
				url_list.add( url.getFile() );
			}	
			String[] stringArray = new String[ url_list.size()];
			return url_list.toArray(stringArray);
		}

		public void createEmployee(String name)
		{
				factory = new Configuration().configure().buildSessionFactory();

				Session session = factory.openSession();
				Transaction tx = null;
				Integer employeeID = null;
				try{
         tx = session.beginTransaction();
					Employee employee = new Employee(name, name, 1000); 
					employeeID = (Integer) session.save(employee); 
					tx.commit();
      }catch (HibernateException e) {
         if (tx!=null) tx.rollback();
				 e.printStackTrace(); 
      }finally {
         session.close(); 
      }
		}
}
