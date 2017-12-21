/*
 * [y] hybris Platform
 *
 * Copyright (c) 2000-2017 SAP SE
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP
 * Hybris ("Confidential Information"). You shall not disclose such
 * Confidential Information and shall use it only in accordance with the
 * terms of the license agreement you entered into with SAP Hybris.
 */
package com.epam.training;

import de.hybris.platform.servicelayer.model.attribute.DynamicAttributeHandler;

import org.springframework.stereotype.Component;

import com.epam.training.model.OrganizationModel;


/**
 *
 */
@Component
public class CustomerNumberHandler implements DynamicAttributeHandler<Integer, OrganizationModel>
{

	@Override
	public Integer get(final OrganizationModel arg0)
	{
		if (arg0.getCustomersNumber() != null)
		{
			return arg0.getCustomersNumber();
		}
		return new Integer(0);
	}

	@Override
	public void set(final OrganizationModel arg0, final Integer arg1)
	{
		throw new UnsupportedOperationException();
	}

}
