
package com.xdev.jcon_19_i18n.microstream;

import java.util.ArrayList;
import java.util.List;

import com.xdev.jcon_19_i18n.model.Category;
import com.xdev.jcon_19_i18n.model.Customer;
import com.xdev.jcon_19_i18n.model.I18NResource;
import com.xdev.jcon_19_i18n.model.Product;


/**
 * MicroStream data root. Create your data model from here.
 *
 * @see <a href="https://manual.docs.microstream.one/">Reference Manual</a>
 */
public class DataRoot
{
	private List<Customer>           customers  = new ArrayList<>();
	private final List<Product>      products   = new ArrayList<>();
	private final List<Category>     categories = new ArrayList<>();
	private final List<I18NResource> resources  = new ArrayList<>();
	
	public DataRoot()
	{
		super();
	}

	public List<Customer> getCustomers()
	{
		return this.customers;
	}

	public void setCustomers(final List<Customer> customers)
	{
		this.customers = customers;
	}
	
	public List<Product> getProducts()
	{
		return this.products;
	}

	public List<Category> getCategories()
	{
		return this.categories;
	}
	
	public List<I18NResource> getResources()
	{
		return this.resources;
	}
}
