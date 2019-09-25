
package com.xdev.jcon_19_i18n.model;

import com.rapidclipse.framework.server.resources.Caption;


public class Customer
{
	private String firstname;
	private String lastname;
	private String language;
	private String country;
	private String timeZone;
	
	public Customer()
	{
		super();
	}
	
	public Customer(final String firstname, final String lastname, final String language, final String timeZone)
	{
		super();
		this.firstname = firstname;
		this.lastname  = lastname;
		this.language  = language;
		this.timeZone  = timeZone;
	}

	@Caption("{$attribute.firstname}")
	public String getFirstname()
	{
		return this.firstname;
	}

	public void setFirstname(final String firstname)
	{
		this.firstname = firstname;
	}
	
	@Caption("{$attribute.lastname}")
	public String getLastname()
	{
		return this.lastname;
	}

	public void setLastname(final String lastname)
	{
		this.lastname = lastname;
	}
	
	@Caption("{$attribute.language}")
	public String getLanguage()
	{
		return this.language;
	}

	public void setLanguage(final String language)
	{
		this.language = language;
	}
	
	@Caption("{$attribute.timezone}")
	public String getTimeZone()
	{
		return this.timeZone;
	}

	public void setTimeZone(final String timeZone)
	{
		this.timeZone = timeZone;
	}
	
	@Caption("{$attribute.country}")
	public String getCountry()
	{
		return this.country;
	}
	
	public void setCountry(final String country)
	{
		this.country = country;
	}

}
