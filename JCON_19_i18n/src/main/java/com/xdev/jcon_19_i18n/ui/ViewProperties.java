
package com.xdev.jcon_19_i18n.ui;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Optional;

import com.rapidclipse.framework.server.resources.CaptionUtils;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.splitlayout.SplitLayout;
import com.vaadin.flow.data.provider.DataProvider;
import com.vaadin.flow.data.selection.SelectionEvent;
import com.vaadin.flow.data.selection.SelectionListener;
import com.vaadin.flow.router.Route;
import com.xdev.jcon_19_i18n.microstream.MicroStream;
import com.xdev.jcon_19_i18n.model.Category;
import com.xdev.jcon_19_i18n.model.I18NResource;
import com.xdev.jcon_19_i18n.model.Product;


@Route(value = "properties", layout = MainContainer.class)
public class ViewProperties extends VerticalLayout
{

	/**
	 *
	 */
	public ViewProperties()
	{
		super();
		this.initUI();
		
		this.grid.setDataProvider(DataProvider.ofCollection(MicroStream.root().getCategories()));
		this.grid2.setDataProvider(DataProvider.ofCollection(MicroStream.root().getProducts()));
	}
	
	/**
	 * Event handler delegate method for the {@link Button} {@link #button}.
	 *
	 * @see ComponentEventListener#onComponentEvent(ComponentEvent)
	 * @eventHandlerDelegate Do NOT delete, used by UI designer!
	 */
	private void button_onClick(final ClickEvent<Button> event)
	{
		final Product product =
			new Product("1", "Milch", "Bauern AG", new BigDecimal(1300), LocalDateTime.now().minusDays(4),
				MicroStream.root().getCategories().get(4));
		product.setPrice("en", new BigDecimal(100));
		product.setPrice("de", new BigDecimal(120));
		
		final Product product2 =
			new Product("2", "Rindfleisch", "Bauern AG", new BigDecimal(100), LocalDateTime.now().minusDays(2),
				MicroStream.root().getCategories().get(3));
		product2.setPrice("en", new BigDecimal(500));
		product2.setPrice("de", new BigDecimal(520));
		
		final Product product3 =
			new Product("3", "Apfel", "Obst AG", new BigDecimal(400), LocalDateTime.now().minusDays(1),
				MicroStream.root().getCategories().get(1));
		product3.setPrice("en", new BigDecimal(300));
		product3.setPrice("de", new BigDecimal(320));
		
		final Product product4 =
			new Product("4", "Spargel", "Gemüse AG", new BigDecimal(500), LocalDateTime.now().minusDays(3),
				MicroStream.root().getCategories().get(0));
		product4.setPrice("en", new BigDecimal(600));
		product4.setPrice("de", new BigDecimal(620));
		
		final Product product5 =
			new Product("5", "Brötchen", "Bäcker AG", new BigDecimal(40), LocalDateTime.now().minusDays(7),
				MicroStream.root().getCategories().get(2));
		product5.setPrice("en", new BigDecimal(200));
		product5.setPrice("de", new BigDecimal(220));
		
		final Product product6 =
			new Product("6", "Banane", "Obst AG", new BigDecimal(200), LocalDateTime.now().minusDays(10),
				MicroStream.root().getCategories().get(1));
		product6.setPrice("en", new BigDecimal(100));
		product6.setPrice("de", new BigDecimal(120));
		
		MicroStream.root().getProducts().clear();
		MicroStream.root().getProducts().addAll(Arrays.asList(product, product2, product3, product4, product5));
		MicroStream.storageManager().store(MicroStream.root().getProducts());

		this.grid.getDataProvider().refreshAll();
		this.grid2.getDataProvider().refreshAll();
	}

	/**
	 * Event handler delegate method for the {@link Button} {@link #button2}.
	 *
	 * @see ComponentEventListener#onComponentEvent(ComponentEvent)
	 * @eventHandlerDelegate Do NOT delete, used by UI designer!
	 */
	private void button2_onClick(final ClickEvent<Button> event)
	{
		final Category category = new Category(1, "Vegetable");
		category.setLocalizedValue("de", "Gemüse");
		category.setLocalizedValue("en", "Vegetable");

		final Category category2 = new Category(2, "Fruits");
		category2.setLocalizedValue("de", "Früchte");
		category2.setLocalizedValue("en", "Fruits");

		final Category category3 = new Category(3, "Bakery products");
		category3.setLocalizedValue("de", "Backwaren");
		category3.setLocalizedValue("en", "Bakery products");

		final Category category4 = new Category(4, "Meat");
		category4.setLocalizedValue("de", "Fleisch");
		category4.setLocalizedValue("en", "Meat");

		final Category category5 = new Category(5, "Dairy products");
		category5.setLocalizedValue("de", "Milchprodukte");
		category5.setLocalizedValue("en", "Dairy products");

		MicroStream.root().getCategories().clear();
		MicroStream.root().getCategories().addAll(Arrays.asList(category, category2, category3, category4, category5));
		MicroStream.storageManager().store(MicroStream.root().getCategories());

		this.grid.getDataProvider().refreshAll();
		this.grid2.getDataProvider().refreshAll();
	}

	/**
	 * Event handler delegate method for the {@link Grid} {@link #grid}.
	 *
	 * @see SelectionListener#selectionChange(SelectionEvent)
	 * @eventHandlerDelegate Do NOT delete, used by UI designer!
	 */
	private void grid_selectionChange(final SelectionEvent<Grid<Category>, Category> event)
	{
		final Optional<Category> firstSelectedItem = event.getFirstSelectedItem();
		System.out.println();
	}

	/**
	 * Event handler delegate method for the {@link Button} {@link #button3}.
	 *
	 * @see ComponentEventListener#onComponentEvent(ComponentEvent)
	 * @eventHandlerDelegate Do NOT delete, used by UI designer!
	 */
	private void button3_onClick(final ClickEvent<Button> event)
	{
		final I18NResource i18 = new I18NResource("attribute.firstname");
		i18.setLocalizedValue("en", "Firstname");
		i18.setLocalizedValue("de", "Vorname");

		final I18NResource i182 = new I18NResource("attribute.lastname");
		i182.setLocalizedValue("en", "Lastname");
		i182.setLocalizedValue("de", "Nachname");

		final I18NResource i183 = new I18NResource("attribute.language");
		i183.setLocalizedValue("en", "Language");
		i183.setLocalizedValue("de", "Sprache");

		final I18NResource i184 = new I18NResource("attribute.timezone");
		i184.setLocalizedValue("en", "Timezone");
		i184.setLocalizedValue("de", "Zeitzone");

		final I18NResource i185 = new I18NResource("attribute.country");
		i185.setLocalizedValue("en", "Country");
		i185.setLocalizedValue("de", "Land");

		final I18NResource i186 = new I18NResource("attribute.manufacturer");
		i186.setLocalizedValue("en", "Manufacturer");
		i186.setLocalizedValue("de", "Hersteller");

		final I18NResource i187 = new I18NResource("attribute.productID");
		i187.setLocalizedValue("en", "ProductID");
		i187.setLocalizedValue("de", "Artikelnummer");

		final I18NResource i188 = new I18NResource("attribute.productname");
		i188.setLocalizedValue("en", "Productname");
		i188.setLocalizedValue("de", "Artikel");

		final I18NResource i189 = new I18NResource("attribute.amount");
		i189.setLocalizedValue("en", "Amount");
		i189.setLocalizedValue("de", "Menge");

		final I18NResource i1810 = new I18NResource("attribute.lastAccess");
		i1810.setLocalizedValue("en", "Last access");
		i1810.setLocalizedValue("de", "Letzte Buchung");

		final I18NResource i1811 = new I18NResource("attribute.category");
		i1811.setLocalizedValue("en", "Category");
		i1811.setLocalizedValue("de", "Kategorie");

		final I18NResource i1812 = new I18NResource("attribute.price");
		i1812.setLocalizedValue("en", "Price");
		i1812.setLocalizedValue("de", "Preis");
		
		final I18NResource i1813 = new I18NResource("lblLastname.text");
		i1813.setLocalizedValue("en", "Lastname");
		i1813.setLocalizedValue("de", "Nachname");
		
		final I18NResource i1814 = new I18NResource("lblLanguage.text");
		i1814.setLocalizedValue("en", "Language");
		i1814.setLocalizedValue("de", "Sprache");
		
		final I18NResource i1815 = new I18NResource("lblTimezone.text");
		i1815.setLocalizedValue("en", "Timezone");
		i1815.setLocalizedValue("de", "Zeitzone");
		
		final I18NResource i1816 = new I18NResource("lblFirstname.text");
		i1816.setLocalizedValue("en", "Firstname");
		i1816.setLocalizedValue("de", "Vorname");

		final I18NResource i1817 = new I18NResource("lblCountry.text");
		i1816.setLocalizedValue("en", "Country");
		i1816.setLocalizedValue("de", "Land");
		
		final I18NResource i1818 = new I18NResource("btnSave.text");
		i1816.setLocalizedValue("en", "Save");
		i1816.setLocalizedValue("de", "Speichern");
		
		final I18NResource i1819 = new I18NResource("message.warning.delete");
		i1816.setLocalizedValue("en", "Are u sure to delete this data?");
		i1816.setLocalizedValue("de", "Wollen Sie diesen Datensatz tatsächlich löschen?");

		MicroStream.root().getResources().clear();
		MicroStream.root().getResources()
			.addAll(Arrays.asList(i18, i182, i183, i184, i185, i186, i187, i188, i189, i1810, i1811, i1812, i1813,
				i1814, i1815, i1816, i1817, i1818, i1819));
		MicroStream.storageManager().store(MicroStream.root().getResources());
		
	}
	
	/* WARNING: Do NOT edit!<br>The content of this method is always regenerated by the UI designer. */
	// <generated-code name="initUI">
	private void initUI()
	{
		this.horizontalLayout = new HorizontalLayout();
		this.button2          = new Button();
		this.button           = new Button();
		this.button3          = new Button();
		this.splitLayout      = new SplitLayout();
		this.verticalLayout   = new VerticalLayout();
		this.grid             = new Grid<>(Category.class, false);
		this.verticalLayout2  = new VerticalLayout();
		this.grid2            = new Grid<>(Product.class, false);

		this.setSpacing(false);
		this.setPadding(false);
		this.horizontalLayout.setPadding(true);
		this.button2.setText("Create Categories");
		this.button.setText("Create Products");
		this.button3.setText("Create Resources");
		this.grid.addColumn(Category::getCategoryID).setKey("categoryID")
			.setHeader(CaptionUtils.resolveCaption(Category.class, "categoryID")).setSortable(true);
		this.grid.addColumn(Category::getDefaultName).setKey("defaultName")
			.setHeader(CaptionUtils.resolveCaption(Category.class, "defaultName")).setSortable(true);
		this.grid.setSelectionMode(Grid.SelectionMode.SINGLE);
		this.grid2.addColumn(Product::getProductID).setKey("productID")
			.setHeader(CaptionUtils.resolveCaption(Product.class, "productID")).setSortable(true);
		this.grid2.addColumn(Product::getProductName).setKey("productName")
			.setHeader(CaptionUtils.resolveCaption(Product.class, "productName")).setSortable(true);
		this.grid2.addColumn(Product::getAmount).setKey("amount")
			.setHeader(CaptionUtils.resolveCaption(Product.class, "amount")).setSortable(true);
		this.grid2.addColumn(Product::getManufacturer).setKey("manufacturer")
			.setHeader(CaptionUtils.resolveCaption(Product.class, "manufacturer")).setSortable(true);
		this.grid2.addColumn(Product::getLastAccess).setKey("lastAccess")
			.setHeader(CaptionUtils.resolveCaption(Product.class, "lastAccess")).setSortable(true);
		this.grid2.setSelectionMode(Grid.SelectionMode.SINGLE);

		this.button2.setSizeUndefined();
		this.button.setSizeUndefined();
		this.button3.setSizeUndefined();
		this.horizontalLayout.add(this.button2, this.button, this.button3);
		this.horizontalLayout.setVerticalComponentAlignment(FlexComponent.Alignment.START, this.button2);
		this.horizontalLayout.setVerticalComponentAlignment(FlexComponent.Alignment.START, this.button);
		this.grid.setSizeFull();
		this.verticalLayout.add(this.grid);
		this.verticalLayout.setFlexGrow(1.0, this.grid);
		this.grid2.setSizeFull();
		this.verticalLayout2.add(this.grid2);
		this.verticalLayout2.setFlexGrow(1.0, this.grid2);
		this.splitLayout.addToPrimary(this.verticalLayout);
		this.splitLayout.addToSecondary(this.verticalLayout2);
		this.splitLayout.setSplitterPosition(30.0);
		this.horizontalLayout.setWidthFull();
		this.horizontalLayout.setHeight(null);
		this.splitLayout.setSizeFull();
		this.add(this.horizontalLayout, this.splitLayout);
		this.setHorizontalComponentAlignment(FlexComponent.Alignment.STRETCH, this.horizontalLayout);
		this.setFlexGrow(1.0, this.splitLayout);
		this.setSizeFull();

		this.button2.addClickListener(this::button2_onClick);
		this.button.addClickListener(this::button_onClick);
		this.button3.addClickListener(this::button3_onClick);
		this.grid.addSelectionListener(this::grid_selectionChange);
	} // </generated-code>
	
	// <generated-code name="variables">
	private Button           button2, button, button3;
	private SplitLayout      splitLayout;
	private HorizontalLayout horizontalLayout;
	private VerticalLayout   verticalLayout, verticalLayout2;
	private Grid<Category>   grid;
	private Grid<Product>    grid2;
	// </generated-code>

}
