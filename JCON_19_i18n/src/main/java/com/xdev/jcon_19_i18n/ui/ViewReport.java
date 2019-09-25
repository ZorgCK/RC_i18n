
package com.xdev.jcon_19_i18n.ui;

import java.util.List;

import com.rapidclipse.framework.server.reports.Format;
import com.rapidclipse.framework.server.reports.Report;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.StreamResource;
import com.xdev.jcon_19_i18n.microstream.MicroStream;
import com.xdev.jcon_19_i18n.model.Customer;

import net.sf.jasperreports.engine.JRParameter;


@Route(value = "report", layout = MainContainer.class)
public class ViewReport extends VerticalLayout
{
	
	/**
	 *
	 */
	public ViewReport()
	{
		super();
		this.initUI();
		
		final List<Customer> customers        = MicroStream.root().getCustomers();
		final StreamResource exportToResource = Report.New().jrxml("/reports/Dummy.jrxml").dataSource(customers)
			.parameter(JRParameter.REPORT_LOCALE, UI.getCurrent().getLocale()).exportToResource(new Format.Pdf());
		
		this.add(new EmbeddedPDFDokument(exportToResource));
		this.setHeight("100%");
	}
	
	/* WARNING: Do NOT edit!<br>The content of this method is always regenerated by the UI designer. */
	// <generated-code name="initUI">
	private void initUI()
	{
		this.setSizeFull();
	} // </generated-code>

}
