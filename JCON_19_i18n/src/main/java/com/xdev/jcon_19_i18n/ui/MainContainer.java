
package com.xdev.jcon_19_i18n.ui;

import java.util.Locale;
import java.util.TimeZone;

import com.flowingcode.vaadin.addons.ironicons.EditorIcons;
import com.flowingcode.vaadin.addons.ironicons.FileIcons;
import com.flowingcode.vaadin.addons.ironicons.IronIcons;
import com.flowingcode.vaadin.addons.ironicons.MapsIcons;
import com.rapidclipse.framework.server.navigation.Navigation;
import com.rapidclipse.framework.server.resources.CaptionUtils;
import com.rapidclipse.framework.server.resources.StringResourceUtils;
import com.rapidclipse.framework.server.ui.ItemLabelGeneratorFactory;
import com.vaadin.flow.component.AbstractField.ComponentValueChangeEvent;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.HasElement;
import com.vaadin.flow.component.HasValue;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.radiobutton.RadioButtonGroup;
import com.vaadin.flow.data.provider.DataProvider;
import com.vaadin.flow.data.renderer.TextRenderer;
import com.vaadin.flow.router.RouterLayout;
import com.vaadin.flow.server.InitialPageSettings;
import com.vaadin.flow.server.PageConfigurator;
import com.xdev.jcon_19_i18n.i18nUtils.MicroStreamResourceProvider;
import com.xdev.jcon_19_i18n.microstream.MicroStream;
import com.xdev.jcon_19_i18n.model.Customer;


/**
 *
 */
// @StyleSheet("frontend://styles/shared-styles.css")
@HtmlImport("frontend://styles/shared-styles.html")
public class MainContainer extends VerticalLayout implements PageConfigurator, RouterLayout
{
	/**
	 *
	 */
	public MainContainer()
	{
		super();
		
		this.initUI();
		
		this.radioButtonGroup.setItems("Datenbank", "File");
		
		if(UI.getCurrent().getSession().getAttribute("ResourceProvider") != null)
		{
			this.radioButtonGroup.setValue(UI.getCurrent().getSession().getAttribute("ResourceProvider").toString());
		}
		else
		{
			this.radioButtonGroup.setValue("File");
		}
		
		this.cboCustomerChooser.setDataProvider(DataProvider.ofCollection(MicroStream.root().getCustomers()));
		
		if(UI.getCurrent().getSession().getAttribute(Customer.class) != null)
		{
			this.cboCustomerChooser.setValue(UI.getCurrent().getSession().getAttribute(Customer.class));
		}
	}

	@Override
	public void configurePage(final InitialPageSettings settings)
	{
		settings.addLink("shortcut icon", "frontend/images/favicon.ico");
		settings.addFavIcon("icon", "frontend/images/favicon256.png", "256x256");
	}

	@Override
	public void showRouterLayoutContent(final HasElement content)
	{
		this.contentContainer.removeAll();
		this.contentContainer.getElement().appendChild(content.getElement());
	}

	/**
	 * Event handler delegate method for the {@link Button} {@link #btnView1}.
	 *
	 * @see ComponentEventListener#onComponentEvent(ComponentEvent)
	 * @eventHandlerDelegate Do NOT delete, used by UI designer!
	 */
	private void btnView1_onClick(final ClickEvent<Button> event)
	{
		UI.getCurrent().navigate(ViewRegister.class);
	}

	/**
	 * Event handler delegate method for the {@link Button} {@link #btnView2}.
	 *
	 * @see ComponentEventListener#onComponentEvent(ComponentEvent)
	 * @eventHandlerDelegate Do NOT delete, used by UI designer!
	 */
	private void btnView2_onClick(final ClickEvent<Button> event)
	{
		UI.getCurrent().navigate(ViewProducts.class);
	}

	/**
	 * Event handler delegate method for the {@link Button} {@link #btnView3}.
	 *
	 * @see ComponentEventListener#onComponentEvent(ComponentEvent)
	 * @eventHandlerDelegate Do NOT delete, used by UI designer!
	 */
	private void btnView3_onClick(final ClickEvent<Button> event)
	{
		Navigation.To(ViewManuallyI18N.class).navigate();
	}

	/**
	 * Event handler delegate method for the {@link RadioButtonGroup} {@link #radioButtonGroup}.
	 *
	 * @see HasValue.ValueChangeListener#valueChanged(HasValue.ValueChangeEvent)
	 * @eventHandlerDelegate Do NOT delete, used by UI designer!
	 */
	private void radioButtonGroup_valueChanged(final ComponentValueChangeEvent<RadioButtonGroup<String>, String> event)
	{
		if(event.getValue().equals("Datenbank"))
		{
			UI.getCurrent().getSession().setAttribute("ResourceProvider", "Datenbank");
			StringResourceUtils.setStringResourceProvider(new MicroStreamResourceProvider());
		}
		else
		{
			UI.getCurrent().getSession().setAttribute("ResourceProvider", "File");
			StringResourceUtils.setStringResourceProvider(null);
		}
	}

	/**
	 * Event handler delegate method for the {@link Button} {@link #btnView}.
	 *
	 * @see ComponentEventListener#onComponentEvent(ComponentEvent)
	 * @eventHandlerDelegate Do NOT delete, used by UI designer!
	 */
	private void btnView_onClick(final ClickEvent<Button> event)
	{
		Navigation.To(ViewTimezones.class).navigate();
	}
	
	/**
	 * Event handler delegate method for the {@link Button} {@link #btnView4}.
	 *
	 * @see ComponentEventListener#onComponentEvent(ComponentEvent)
	 * @eventHandlerDelegate Do NOT delete, used by UI designer!
	 */
	private void btnView4_onClick(final ClickEvent<Button> event)
	{ // UI.getCurrent().navigate("view3");
	}
	
	/**
	 * Event handler delegate method for the {@link Button} {@link #btnView5}.
	 *
	 * @see ComponentEventListener#onComponentEvent(ComponentEvent)
	 * @eventHandlerDelegate Do NOT delete, used by UI designer!
	 */
	private void btnView5_onClick(final ClickEvent<Button> event)
	{ // UI.getCurrent().navigate("view3");
	}
	
	/**
	 * Event handler delegate method for the {@link Button} {@link #btnView6}.
	 *
	 * @see ComponentEventListener#onComponentEvent(ComponentEvent)
	 * @eventHandlerDelegate Do NOT delete, used by UI designer!
	 */
	private void btnView6_onClick(final ClickEvent<Button> event)
	{ // UI.getCurrent().navigate("view3");
	}
	
	/**
	 * Event handler delegate method for the {@link Button} {@link #btnView8}.
	 *
	 * @see ComponentEventListener#onComponentEvent(ComponentEvent)
	 * @eventHandlerDelegate Do NOT delete, used by UI designer!
	 */
	private void btnView8_onClick(final ClickEvent<Button> event)
	{
		UI.getCurrent().navigate(ViewProperties.class);
	}
	
	/**
	 * Event handler delegate method for the {@link ComboBox} {@link #cboCustomerChooser}.
	 *
	 * @see HasValue.ValueChangeListener#valueChanged(HasValue.ValueChangeEvent)
	 * @eventHandlerDelegate Do NOT delete, used by UI designer!
	 */
	private void cboCustomerChooser_valueChanged(final ComponentValueChangeEvent<ComboBox<Customer>, Customer> event)
	{
		if(UI.getCurrent().getSession().getAttribute(Locale.class) == null || !event.getValue().getLocale()
			.equals(UI.getCurrent().getSession().getAttribute(Locale.class).getLanguage()))
		{
			final Customer value = event.getValue();
			UI.getCurrent().getSession().setAttribute(Customer.class, value);
			UI.getCurrent().getSession().setAttribute(Locale.class, new Locale(value.getLocale()));
			UI.getCurrent().getSession().setAttribute(TimeZone.class, TimeZone.getTimeZone(value.getTimeZone()));
			
			UI.getCurrent().setLocale(UI.getCurrent().getSession().getAttribute(Locale.class));
			Locale.setDefault(UI.getCurrent().getSession().getAttribute(Locale.class));

			UI.getCurrent().getPage().reload();
		}
	}

	/* WARNING: Do NOT edit!<br>The content of this method is always regenerated by the UI designer. */
	// <generated-code name="initUI">
	private void initUI()
	{
		this.headerContainer        = new HorizontalLayout();
		this.lblHead                = new Label();
		this.radioButtonGroup       = new RadioButtonGroup<>();
		this.horizontalLayout       = new HorizontalLayout();
		this.label2                 = new Label();
		this.cboCustomerChooser     = new ComboBox<>();
		this.contentParentContainer = new HorizontalLayout();
		this.navContainer           = new VerticalLayout();
		this.btnView1               = new Button();
		this.btnView2               = new Button();
		this.btnView3               = new Button();
		this.btnView                = new Button();
		this.btnView4               = new Button();
		this.btnView5               = new Button();
		this.btnView6               = new Button();
		this.btnView8               = new Button();
		this.contentContainer       = new VerticalLayout();

		this.setSpacing(false);
		this.setPadding(false);
		this.setDefaultHorizontalComponentAlignment(FlexComponent.Alignment.STRETCH);
		this.headerContainer.setClassName("my-header");
		this.lblHead.setText("Sidebar navigation");
		this.radioButtonGroup
			.setRenderer(new TextRenderer<>(ItemLabelGeneratorFactory.NonNull(CaptionUtils::resolveCaption)));
		this.horizontalLayout.setJustifyContentMode(FlexComponent.JustifyContentMode.END);
		this.label2.setText("Angemeldeter Customer");
		this.cboCustomerChooser.setItemLabelGenerator(
			ItemLabelGeneratorFactory.NonNull(v -> CaptionUtils.resolveCaption(v, "{%firstname} {%lastname}")));
		this.contentParentContainer.setClassName("my-category");
		this.contentParentContainer.setMinHeight("0");
		this.contentParentContainer.setSpacing(false);
		this.navContainer.setClassName("my-menu");
		this.navContainer.setMinHeight("0");
		this.navContainer.setSpacing(false);
		this.navContainer.setPadding(false);
		this.navContainer.setMinWidth("250px");
		this.navContainer.setDefaultHorizontalComponentAlignment(FlexComponent.Alignment.STRETCH);
		this.navContainer.getStyle().set("overflow-x", "hidden");
		this.navContainer.getStyle().set("overflow-y", "auto");
		this.btnView1.setClassName("my-navbutton");
		this.btnView1.setText("Registrierung");
		this.btnView1.setIcon(IronIcons.SETTINGS.create());
		this.btnView2.setClassName("my-navbutton");
		this.btnView2.setText("Captions / Datumswerte");
		this.btnView2.setIcon(EditorIcons.TITLE.create());
		this.btnView3.setClassName("my-navbutton");
		this.btnView3.setText("Texte Manuell");
		this.btnView3.setIcon(VaadinIcon.TEXT_LABEL.create());
		this.btnView.setClassName("my-navbutton");
		this.btnView.setText("Zeitzonen");
		this.btnView.setIcon(VaadinIcon.CLOCK.create());
		this.btnView4.setClassName("my-navbutton");
		this.btnView4.setText("Schreibrichtung");
		this.btnView4.setIcon(MapsIcons.DIRECTIONS.create());
		this.btnView5.setClassName("my-navbutton");
		this.btnView5.setText("Dynamische Werte");
		this.btnView5.setIcon(FileIcons.GENERIC.create());
		this.btnView6.setClassName("my-navbutton");
		this.btnView6.setText("I18n Reports");
		this.btnView6.setIcon(VaadinIcon.PRINT.create());
		this.btnView8.setClassName("my-navbutton");
		this.btnView8.setText("Einstellungen");
		this.btnView8.setIcon(VaadinIcon.COG_O.create());
		this.contentContainer.setClassName("my-view");
		this.contentContainer.setMinHeight("0");
		this.contentContainer.setSpacing(false);
		this.contentContainer.setPadding(false);
		this.contentContainer.getStyle().set("overflow-x", "hidden");
		this.contentContainer.getStyle().set("overflow-y", "auto");

		this.label2.setSizeUndefined();
		this.cboCustomerChooser.setWidth("300px");
		this.cboCustomerChooser.setHeightFull();
		this.horizontalLayout.add(this.label2, this.cboCustomerChooser);
		this.horizontalLayout.setVerticalComponentAlignment(FlexComponent.Alignment.CENTER, this.cboCustomerChooser);
		this.lblHead.setSizeUndefined();
		this.horizontalLayout.setWidth("100px");
		this.horizontalLayout.setHeight(null);
		this.headerContainer.add(this.lblHead, this.radioButtonGroup, this.horizontalLayout);
		this.headerContainer.setVerticalComponentAlignment(FlexComponent.Alignment.CENTER, this.lblHead);
		this.headerContainer.setVerticalComponentAlignment(FlexComponent.Alignment.CENTER, this.radioButtonGroup);
		this.headerContainer.setVerticalComponentAlignment(FlexComponent.Alignment.CENTER, this.horizontalLayout);
		this.headerContainer.setFlexGrow(1.0, this.horizontalLayout);
		this.btnView1.setSizeUndefined();
		this.btnView2.setSizeUndefined();
		this.btnView3.setSizeUndefined();
		this.btnView.setSizeUndefined();
		this.btnView4.setSizeUndefined();
		this.btnView5.setSizeUndefined();
		this.btnView6.setSizeUndefined();
		this.btnView8.setSizeUndefined();
		this.navContainer.add(this.btnView1, this.btnView2, this.btnView3, this.btnView, this.btnView4, this.btnView5,
			this.btnView6, this.btnView8);
		this.navContainer.setWidth(null);
		this.navContainer.setHeightFull();
		this.contentContainer.setSizeUndefined();
		this.contentParentContainer.add(this.navContainer, this.contentContainer);
		this.contentParentContainer.setVerticalComponentAlignment(FlexComponent.Alignment.STRETCH,
			this.contentContainer);
		this.headerContainer.setWidthFull();
		this.headerContainer.setHeight(null);
		this.contentParentContainer.setSizeUndefined();
		this.add(this.headerContainer, this.contentParentContainer);
		this.setFlexGrow(1.0, this.contentParentContainer);
		this.setSizeFull();

		this.radioButtonGroup.addValueChangeListener(this::radioButtonGroup_valueChanged);
		this.cboCustomerChooser.addValueChangeListener(this::cboCustomerChooser_valueChanged);
		this.btnView1.addClickListener(this::btnView1_onClick);
		this.btnView2.addClickListener(this::btnView2_onClick);
		this.btnView3.addClickListener(this::btnView3_onClick);
		this.btnView.addClickListener(this::btnView_onClick);
		this.btnView4.addClickListener(this::btnView4_onClick);
		this.btnView5.addClickListener(this::btnView5_onClick);
		this.btnView6.addClickListener(this::btnView6_onClick);
		this.btnView8.addClickListener(this::btnView8_onClick);
	} // </generated-code>
	
	// <generated-code name="variables">
	private Button                   btnView1, btnView2, btnView3, btnView, btnView4, btnView5, btnView6, btnView8;
	private ComboBox<Customer>       cboCustomerChooser;
	private HorizontalLayout         headerContainer, horizontalLayout, contentParentContainer;
	private VerticalLayout           navContainer, contentContainer;
	private Label                    lblHead, label2;
	private RadioButtonGroup<String> radioButtonGroup;
	// </generated-code>

}
