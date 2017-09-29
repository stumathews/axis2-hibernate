package org.DAL.DEL;


public class User
 {
	
	private Long id;
	private String username;
	private String password;
	private String meta;

	public User() {
		// this form used by Hibernate
	}

	public User(String thatUsername, String thatPassword) {
		this.username = thatUsername;
		this.password = thatPassword; 
	}

	public Long getId() {
		return id;
	}

	private void setId(Long id) {
		this.id = id;
	}

	public String getUsername()
	{
		return this.username;
	}
	public void setUsername(String thatUsername)
	{
		this.username = thatUsername;
	}
	public String getPassword()
	{
		return this.password;
	}
	public void setPassword(String thatPassword)
	{
		this.password = thatPassword;
	}
	public String getMeta()
	{
		return this.meta;
	}
	public void setMeta(String meta)
	{
		this.meta = meta;
	}

}
