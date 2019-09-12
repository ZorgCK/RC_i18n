
package com.xdev.jcon_19_i18n;

import javax.servlet.annotation.WebServlet;

import com.rapidclipse.framework.server.RapServlet;


/**
 *
 */
@WebServlet(urlPatterns = "/*", asyncSupported = true)
public class AppServlet extends RapServlet
{
	/**
	 *
	 */
	public AppServlet()
	{
		super();
		
		// VaadinSession.getCurrent().setLocale(new Locale("de", "DE"));
	}
}
