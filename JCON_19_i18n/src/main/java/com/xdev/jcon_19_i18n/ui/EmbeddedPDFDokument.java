
package com.xdev.jcon_19_i18n.ui;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.HasSize;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.server.StreamResource;


@Tag("object")
public class EmbeddedPDFDokument extends Component implements HasSize
{
	public EmbeddedPDFDokument(final StreamResource resource)
	{
		this();
		this.getElement().setAttribute("data", resource);
	}

	public EmbeddedPDFDokument(final String url)
	{
		this();
		this.getElement().setAttribute("data", url);
	}

	protected EmbeddedPDFDokument()
	{
		this.getElement().setAttribute("type", "application/pdf");
		this.setSizeFull();
	}
}
