package org.WSL;

public class AdminService
{
    public String login( org.BOLO.User theUser )
    {
		   return org.BSL.LoginAdmin.login(theUser); 	   
    }
	 
		public org.BOLO.User getUser(String username, String password)
		{
			return org.BSL.UserAdmin.getUser( username, password );
		}	
	
}
