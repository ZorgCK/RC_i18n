
package com.xdev.jcon_19_i18n.model;

import java.util.HashMap;
import java.util.Locale;

import com.rapidclipse.framework.server.resources.Caption;
import com.vaadin.flow.component.UI;


public class Category
{
	private Integer                       categoryID;
	private String                        defaultName;
	private final HashMap<String, String> localizedCategories = new HashMap<>();

	public Category()
	{
		super();
	}
	
	public Category(final Integer categoryID, final String defaultName)
	{
		super();
		this.categoryID  = categoryID;
		this.defaultName = defaultName;
	}
	
	@Caption("{$attribute.category}")
	public String getLocalizedValue()
	{
		if(UI.getCurrent().getLocale() != null)
		{
			return this.localizedCategories.get(UI.getCurrent().getLocale().getLanguage());
		}
		else
		{
			return this.localizedCategories.get(new Locale("en").getLanguage());
		}
	}

	public void setLocalizedValue(final String locale, final String value)
	{
		this.localizedCategories.put(locale, value);
	}
	
	public Integer getCategoryID()
	{
		return this.categoryID;
	}
	
	public void setCategoryID(final Integer categoryID)
	{
		this.categoryID = categoryID;
	}
	
	public String getDefaultName()
	{
		return this.defaultName;
	}
	
	public void setDefaultName(final String defaultName)
	{
		this.defaultName = defaultName;
	}

}
