
package com.xdev.jcon_19_i18n.i18nUtils;

import java.util.Locale;
import java.util.MissingResourceException;

import com.rapidclipse.framework.server.resources.StringResourceProvider;
import com.xdev.jcon_19_i18n.microstream.MicroStream;
import com.xdev.jcon_19_i18n.model.I18NResource;


public class MicroStreamResourceProvider implements StringResourceProvider
{

	@Override
	public String lookupResourceString(final String key, final Locale locale, final Object requestor)
		throws MissingResourceException, NullPointerException
	{
		final I18NResource i18nResource =
			MicroStream.root().getResources().stream().filter(r -> r.getKey().equals(key)).findFirst().get();

		return i18nResource.getLocalizedValue();
	}
	
}
