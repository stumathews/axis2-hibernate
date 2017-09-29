package org.BSL;

public class UserAdmin
{
    public UserAdmin(){}
    public static org.BOLO.User getUser( String username,  String password )
    {
	  	// Check premissions to call this function
			
			// Do something in the User Business layer
			return 	org.BOL.User.getUser(username, password);
 		}
		public static boolean createUser( String username, String password, String meta ) throws Exception
		{	
				return org.BOL.User.createUser( username, password, meta );
		}
	
}
