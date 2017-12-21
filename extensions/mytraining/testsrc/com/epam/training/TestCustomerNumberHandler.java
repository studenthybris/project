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

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.mockito.Mockito;

import com.epam.training.model.OrganizationModel;


/**
 *
 */
public class TestCustomerNumberHandler
{
	private final Integer CUSTOMERS_AMOUNT = new Integer(5);
	private final CustomerNumberHandler handler = new CustomerNumberHandler();
	private final OrganizationModel model = Mockito.mock(OrganizationModel.class);

	@Test
	public void testGet()
	{
		final Integer expected = CUSTOMERS_AMOUNT;
		Mockito.when(model.getCustomersNumber()).thenReturn(expected);
		final Integer actual = handler.get(model);
		assertEquals(expected, actual);
	}

}
