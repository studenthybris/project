/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Dec 15, 2017 6:31:36 PM                     ---
 * ----------------------------------------------------------------
 */
package com.epam.training.jalo;

import com.epam.training.constants.MytrainingConstants;
import com.epam.training.jalo.Organization;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.user.Customer;
import de.hybris.platform.util.Utilities;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Generated class for type {@link de.hybris.platform.jalo.user.Customer MyCustomer}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedMyCustomer extends Customer
{
	/** Qualifier of the <code>MyCustomer.status</code> attribute **/
	public static final String STATUS = "status";
	/** Qualifier of the <code>MyCustomer.attemptCount</code> attribute **/
	public static final String ATTEMPTCOUNT = "attemptCount";
	/** Qualifier of the <code>MyCustomer.Organization</code> attribute **/
	public static final String ORGANIZATION = "Organization";
	/** Relation ordering override parameter constants for MyCustomerOrganization from ((mytraining))*/
	protected static String MYCUSTOMERORGANIZATION_SRC_ORDERED = "relation.MyCustomerOrganization.source.ordered";
	protected static String MYCUSTOMERORGANIZATION_TGT_ORDERED = "relation.MyCustomerOrganization.target.ordered";
	/** Relation disable markmodifed parameter constants for MyCustomerOrganization from ((mytraining))*/
	protected static String MYCUSTOMERORGANIZATION_MARKMODIFIED = "relation.MyCustomerOrganization.markmodified";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(Customer.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(STATUS, AttributeMode.INITIAL);
		tmp.put(ATTEMPTCOUNT, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MyCustomer.attemptCount</code> attribute.
	 * @return the attemptCount
	 */
	public Integer getAttemptCount(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, ATTEMPTCOUNT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MyCustomer.attemptCount</code> attribute.
	 * @return the attemptCount
	 */
	public Integer getAttemptCount()
	{
		return getAttemptCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MyCustomer.attemptCount</code> attribute. 
	 * @return the attemptCount
	 */
	public int getAttemptCountAsPrimitive(final SessionContext ctx)
	{
		Integer value = getAttemptCount( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MyCustomer.attemptCount</code> attribute. 
	 * @return the attemptCount
	 */
	public int getAttemptCountAsPrimitive()
	{
		return getAttemptCountAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MyCustomer.attemptCount</code> attribute. 
	 * @param value the attemptCount
	 */
	public void setAttemptCount(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, ATTEMPTCOUNT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MyCustomer.attemptCount</code> attribute. 
	 * @param value the attemptCount
	 */
	public void setAttemptCount(final Integer value)
	{
		setAttemptCount( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MyCustomer.attemptCount</code> attribute. 
	 * @param value the attemptCount
	 */
	public void setAttemptCount(final SessionContext ctx, final int value)
	{
		setAttemptCount( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MyCustomer.attemptCount</code> attribute. 
	 * @param value the attemptCount
	 */
	public void setAttemptCount(final int value)
	{
		setAttemptCount( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MyCustomer.Organization</code> attribute.
	 * @return the Organization
	 */
	public Set<Organization> getOrganization(final SessionContext ctx)
	{
		final List<Organization> items = getLinkedItems( 
			ctx,
			true,
			MytrainingConstants.Relations.MYCUSTOMERORGANIZATION,
			"Organization",
			null,
			false,
			false
		);
		return new LinkedHashSet<Organization>(items);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MyCustomer.Organization</code> attribute.
	 * @return the Organization
	 */
	public Set<Organization> getOrganization()
	{
		return getOrganization( getSession().getSessionContext() );
	}
	
	public long getOrganizationCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			true,
			MytrainingConstants.Relations.MYCUSTOMERORGANIZATION,
			"Organization",
			null
		);
	}
	
	public long getOrganizationCount()
	{
		return getOrganizationCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MyCustomer.Organization</code> attribute. 
	 * @param value the Organization
	 */
	public void setOrganization(final SessionContext ctx, final Set<Organization> value)
	{
		setLinkedItems( 
			ctx,
			true,
			MytrainingConstants.Relations.MYCUSTOMERORGANIZATION,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(MYCUSTOMERORGANIZATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MyCustomer.Organization</code> attribute. 
	 * @param value the Organization
	 */
	public void setOrganization(final Set<Organization> value)
	{
		setOrganization( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to Organization. 
	 * @param value the item to add to Organization
	 */
	public void addToOrganization(final SessionContext ctx, final Organization value)
	{
		addLinkedItems( 
			ctx,
			true,
			MytrainingConstants.Relations.MYCUSTOMERORGANIZATION,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(MYCUSTOMERORGANIZATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to Organization. 
	 * @param value the item to add to Organization
	 */
	public void addToOrganization(final Organization value)
	{
		addToOrganization( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from Organization. 
	 * @param value the item to remove from Organization
	 */
	public void removeFromOrganization(final SessionContext ctx, final Organization value)
	{
		removeLinkedItems( 
			ctx,
			true,
			MytrainingConstants.Relations.MYCUSTOMERORGANIZATION,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(MYCUSTOMERORGANIZATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from Organization. 
	 * @param value the item to remove from Organization
	 */
	public void removeFromOrganization(final Organization value)
	{
		removeFromOrganization( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MyCustomer.status</code> attribute.
	 * @return the status
	 */
	public Boolean isStatus(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, STATUS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MyCustomer.status</code> attribute.
	 * @return the status
	 */
	public Boolean isStatus()
	{
		return isStatus( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MyCustomer.status</code> attribute. 
	 * @return the status
	 */
	public boolean isStatusAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isStatus( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MyCustomer.status</code> attribute. 
	 * @return the status
	 */
	public boolean isStatusAsPrimitive()
	{
		return isStatusAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MyCustomer.status</code> attribute. 
	 * @param value the status
	 */
	public void setStatus(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, STATUS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MyCustomer.status</code> attribute. 
	 * @param value the status
	 */
	public void setStatus(final Boolean value)
	{
		setStatus( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MyCustomer.status</code> attribute. 
	 * @param value the status
	 */
	public void setStatus(final SessionContext ctx, final boolean value)
	{
		setStatus( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MyCustomer.status</code> attribute. 
	 * @param value the status
	 */
	public void setStatus(final boolean value)
	{
		setStatus( getSession().getSessionContext(), value );
	}
	
}
