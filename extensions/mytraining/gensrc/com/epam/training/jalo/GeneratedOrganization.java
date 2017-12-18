/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Dec 18, 2017 3:46:46 PM                     ---
 * ----------------------------------------------------------------
 */
package com.epam.training.jalo;

import com.epam.training.constants.MytrainingConstants;
import com.epam.training.jalo.MyCustomer;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.util.Utilities;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem Organization}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedOrganization extends GenericItem
{
	/** Qualifier of the <code>Organization.id</code> attribute **/
	public static final String ID = "id";
	/** Qualifier of the <code>Organization.name</code> attribute **/
	public static final String NAME = "name";
	/** Qualifier of the <code>Organization.phone</code> attribute **/
	public static final String PHONE = "phone";
	/** Qualifier of the <code>Organization.email</code> attribute **/
	public static final String EMAIL = "email";
	/** Qualifier of the <code>Organization.Customer</code> attribute **/
	public static final String CUSTOMER = "Customer";
	/** Relation ordering override parameter constants for MyCustomerOrganization from ((mytraining))*/
	protected static String MYCUSTOMERORGANIZATION_SRC_ORDERED = "relation.MyCustomerOrganization.source.ordered";
	protected static String MYCUSTOMERORGANIZATION_TGT_ORDERED = "relation.MyCustomerOrganization.target.ordered";
	/** Relation disable markmodifed parameter constants for MyCustomerOrganization from ((mytraining))*/
	protected static String MYCUSTOMERORGANIZATION_MARKMODIFIED = "relation.MyCustomerOrganization.markmodified";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(ID, AttributeMode.INITIAL);
		tmp.put(NAME, AttributeMode.INITIAL);
		tmp.put(PHONE, AttributeMode.INITIAL);
		tmp.put(EMAIL, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Organization.Customer</code> attribute.
	 * @return the Customer
	 */
	public Set<MyCustomer> getCustomer(final SessionContext ctx)
	{
		final List<MyCustomer> items = getLinkedItems( 
			ctx,
			false,
			MytrainingConstants.Relations.MYCUSTOMERORGANIZATION,
			"MyCustomer",
			null,
			false,
			false
		);
		return new LinkedHashSet<MyCustomer>(items);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Organization.Customer</code> attribute.
	 * @return the Customer
	 */
	public Set<MyCustomer> getCustomer()
	{
		return getCustomer( getSession().getSessionContext() );
	}
	
	public long getCustomerCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			false,
			MytrainingConstants.Relations.MYCUSTOMERORGANIZATION,
			"MyCustomer",
			null
		);
	}
	
	public long getCustomerCount()
	{
		return getCustomerCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Organization.Customer</code> attribute. 
	 * @param value the Customer
	 */
	public void setCustomer(final SessionContext ctx, final Set<MyCustomer> value)
	{
		setLinkedItems( 
			ctx,
			false,
			MytrainingConstants.Relations.MYCUSTOMERORGANIZATION,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(MYCUSTOMERORGANIZATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Organization.Customer</code> attribute. 
	 * @param value the Customer
	 */
	public void setCustomer(final Set<MyCustomer> value)
	{
		setCustomer( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to Customer. 
	 * @param value the item to add to Customer
	 */
	public void addToCustomer(final SessionContext ctx, final MyCustomer value)
	{
		addLinkedItems( 
			ctx,
			false,
			MytrainingConstants.Relations.MYCUSTOMERORGANIZATION,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(MYCUSTOMERORGANIZATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to Customer. 
	 * @param value the item to add to Customer
	 */
	public void addToCustomer(final MyCustomer value)
	{
		addToCustomer( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from Customer. 
	 * @param value the item to remove from Customer
	 */
	public void removeFromCustomer(final SessionContext ctx, final MyCustomer value)
	{
		removeLinkedItems( 
			ctx,
			false,
			MytrainingConstants.Relations.MYCUSTOMERORGANIZATION,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(MYCUSTOMERORGANIZATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from Customer. 
	 * @param value the item to remove from Customer
	 */
	public void removeFromCustomer(final MyCustomer value)
	{
		removeFromCustomer( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Organization.email</code> attribute.
	 * @return the email
	 */
	public String getEmail(final SessionContext ctx)
	{
		return (String)getProperty( ctx, EMAIL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Organization.email</code> attribute.
	 * @return the email
	 */
	public String getEmail()
	{
		return getEmail( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Organization.email</code> attribute. 
	 * @param value the email
	 */
	public void setEmail(final SessionContext ctx, final String value)
	{
		setProperty(ctx, EMAIL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Organization.email</code> attribute. 
	 * @param value the email
	 */
	public void setEmail(final String value)
	{
		setEmail( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Organization.id</code> attribute.
	 * @return the id
	 */
	public Integer getId(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, ID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Organization.id</code> attribute.
	 * @return the id
	 */
	public Integer getId()
	{
		return getId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Organization.id</code> attribute. 
	 * @return the id
	 */
	public int getIdAsPrimitive(final SessionContext ctx)
	{
		Integer value = getId( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Organization.id</code> attribute. 
	 * @return the id
	 */
	public int getIdAsPrimitive()
	{
		return getIdAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Organization.id</code> attribute. 
	 * @param value the id
	 */
	public void setId(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, ID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Organization.id</code> attribute. 
	 * @param value the id
	 */
	public void setId(final Integer value)
	{
		setId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Organization.id</code> attribute. 
	 * @param value the id
	 */
	public void setId(final SessionContext ctx, final int value)
	{
		setId( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Organization.id</code> attribute. 
	 * @param value the id
	 */
	public void setId(final int value)
	{
		setId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Organization.name</code> attribute.
	 * @return the name
	 */
	public String getName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Organization.name</code> attribute.
	 * @return the name
	 */
	public String getName()
	{
		return getName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Organization.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Organization.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final String value)
	{
		setName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Organization.phone</code> attribute.
	 * @return the phone
	 */
	public String getPhone(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PHONE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Organization.phone</code> attribute.
	 * @return the phone
	 */
	public String getPhone()
	{
		return getPhone( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Organization.phone</code> attribute. 
	 * @param value the phone
	 */
	public void setPhone(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PHONE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Organization.phone</code> attribute. 
	 * @param value the phone
	 */
	public void setPhone(final String value)
	{
		setPhone( getSession().getSessionContext(), value );
	}
	
}
