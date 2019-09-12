
package com.xdev.jcon_19_i18n.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.rapidclipse.framework.server.resources.Caption;


public class Product
{
	private String        productID;
	private String        productName;
	private String        manufacturer;
	private BigDecimal    amount;
	private LocalDateTime lastAccess;
	private Category      category;
	
	public Product()
	{
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Product(
		final String productID,
		final String productName,
		final String manufacturer,
		final BigDecimal amount,
		final LocalDateTime lastAccess,
		final Category category)
	{
		super();
		this.productID    = productID;
		this.productName  = productName;
		this.manufacturer = manufacturer;
		this.amount       = amount;
		this.lastAccess   = lastAccess;
		this.category     = category;
	}
	
	@Caption("{$attribute.productID}")
	public String getProductID()
	{
		return this.productID;
	}
	
	public void setProductID(final String productID)
	{
		this.productID = productID;
	}
	
	@Caption("{$attribute.productname}")
	public String getProductName()
	{
		return this.productName;
	}
	
	public void setProductName(final String productName)
	{
		this.productName = productName;
	}
	
	@Caption("{$attribute.manufacturer}")
	public String getManufacturer()
	{
		return this.manufacturer;
	}
	
	public void setManufacturer(final String manufacturer)
	{
		this.manufacturer = manufacturer;
	}
	
	@Caption("{$attribute.amount}")
	public BigDecimal getAmount()
	{
		return this.amount;
	}
	
	public void setAmount(final BigDecimal amount)
	{
		this.amount = amount;
	}
	
	@Caption("{$attribute.lastAccess}")
	public LocalDateTime getLastAccess()
	{
		return this.lastAccess;
	}
	
	public void setLastAccess(final LocalDateTime lastAccess)
	{
		this.lastAccess = lastAccess;
	}
	
	@Caption("{$attribute.category}")
	public Category getCategory()
	{
		return this.category;
	}
	
	public void setCategory(final Category category)
	{
		this.category = category;
	}
	
}
