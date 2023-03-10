
package com.xdev.jcon_19_i18n.ui;

import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;


@Route(value = "", layout = MainContainer.class)
public class StartView extends VerticalLayout
{

	/**
	 *
	 */
	public StartView()
	{
		super();
		this.initUI();
	}

	/* WARNING: Do NOT edit!<br>The content of this method is always regenerated by the UI designer. */
	// <generated-code name="initUI">
	private void initUI()
	{
		this.lblContent = new Label();

		this.setClassName("my-startview my-view");
		this.setJustifyContentMode(FlexComponent.JustifyContentMode.CENTER);
		this.setAlignItems(FlexComponent.Alignment.CENTER);
		this.setDefaultHorizontalComponentAlignment(FlexComponent.Alignment.CENTER);
		this.lblContent.setText("I18N - Internationalization");
		this.lblContent.getStyle().set("font-size", "5em");

		this.lblContent.setSizeUndefined();
		this.add(this.lblContent);
		this.setSizeFull();
	} // </generated-code>

	// <generated-code name="variables">
	private Label lblContent;
	// </generated-code>

}
