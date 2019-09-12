
package com.xdev.jcon_19_i18n.model;

import java.util.HashMap;
import java.util.Locale;

import com.vaadin.flow.component.UI;


public class I18NResource
{
	private String                        key;
	private final HashMap<String, String> localizedValue = new HashMap<>();
	
	public I18NResource()
	{
		super();
	}

	public I18NResource(final String key)
	{
		super();
		this.key = key;
	}
	
	public String getLocalizedValue()
	{
		if(UI.getCurrent().getLocale() != null)
		{
			return this.localizedValue.get(UI.getCurrent().getLocale().getLanguage());
		}
		else
		{
			return this.localizedValue.get(new Locale("en").getLanguage());
		}
	}
	
	public void setLocalizedValue(final String locale, final String value)
	{
		this.localizedValue.put(locale, value);
	}
	
	public String getKey()
	{
		return this.key;
	}
	
	public void setKey(final String key)
	{
		this.key = key;
	}
	
}
