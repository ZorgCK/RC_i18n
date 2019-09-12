
package com.xdev.jcon_19_i18n;

import java.util.Locale;

import com.vaadin.flow.component.UI;
import com.vaadin.flow.server.ServiceException;
import com.vaadin.flow.server.ServiceInitEvent;
import com.vaadin.flow.server.SessionInitEvent;
import com.vaadin.flow.server.SessionInitListener;
import com.vaadin.flow.server.UIInitEvent;
import com.vaadin.flow.server.UIInitListener;
import com.vaadin.flow.server.VaadinServiceInitListener;


public class ServletInit implements VaadinServiceInitListener, UIInitListener, SessionInitListener
{
	
	@Override
	public void serviceInit(final ServiceInitEvent event)
	{
		event.getSource().addUIInitListener(this);
	}
	
	@Override
	public void uiInit(final UIInitEvent event)
	{
		if(UI.getCurrent().getSession().getAttribute(Locale.class) != null)
		{
			UI.getCurrent().setLocale(UI.getCurrent().getSession().getAttribute(Locale.class));
			Locale.setDefault(UI.getCurrent().getSession().getAttribute(Locale.class));
		}
		else
		{
			UI.getCurrent().setLocale(new Locale("en"));
			Locale.setDefault(new Locale("en"));
		}
	}
	
	@Override
	public void sessionInit(final SessionInitEvent event) throws ServiceException
	{
		
	}

}
