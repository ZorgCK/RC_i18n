
package com.xdev.jcon_19_i18n.model;

import com.rapidclipse.framework.server.resources.Caption;


public class Customer
{
	private String firstname;
	private String lastname;
	private String locale;
	private String timeZone;
	
	public Customer()
	{
		super();
	}
	
	public Customer(final String firstname, final String lastname, final String locale, final String timeZone)
	{
		super();
		this.firstname = firstname;
		this.lastname  = lastname;
		this.locale    = locale;
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
	public String getLocale()
	{
		return this.locale;
	}

	public void setLocale(final String locale)
	{
		this.locale = locale;
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

}
