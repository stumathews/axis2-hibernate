package org.WSL;
import org.BSL.LoginAdmin;
import org.BOL.JavaDiagnostics;
import org.BOL.NativeApiIllustrationTest;
import org.BOLO.User;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.net.URL;
public class TestService
{
 /**
  * Returns the current date and time for testing purposes only.
  */
	public String test()
	{
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	   //get current date time with Date()
	   	   Date date = new Date();
	   String result = dateFormat.format(date);
		return result;
	}

	public String[] PrintDiagnostics()
	{
		JavaDiagnostics diag = new JavaDiagnostics();
		return diag.getClassPaths();
	}
	
	public void createEmployee(String name )
	{
		JavaDiagnostics diag = new JavaDiagnostics();
		diag.createEmployee(name);
	}

	public void testHibernateBasicUsage() throws Exception
	{
		NativeApiIllustrationTest basic = new NativeApiIllustrationTest();
		basic.setUp();
		basic.testBasicUsage();
		basic.tearDown();	
	}	
	public boolean createUser(String username, String password, String meta) throws Exception
	{
		return org.BSL.UserAdmin.createUser(username, password, meta);
	}
}
