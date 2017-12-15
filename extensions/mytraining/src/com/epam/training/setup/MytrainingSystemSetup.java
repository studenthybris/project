/*
 * [y] hybris Platform
 *
 * Copyright (c) 2017 SAP SE or an SAP affiliate company.  All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with SAP.
 */
package com.epam.training.setup;

import static com.epam.training.constants.MytrainingConstants.PLATFORM_LOGO_CODE;

import de.hybris.platform.core.initialization.SystemSetup;

import java.io.InputStream;

import com.epam.training.constants.MytrainingConstants;
import com.epam.training.service.MytrainingService;


@SystemSetup(extension = MytrainingConstants.EXTENSIONNAME)
public class MytrainingSystemSetup
{
	private final MytrainingService mytrainingService;

	public MytrainingSystemSetup(final MytrainingService mytrainingService)
	{
		this.mytrainingService = mytrainingService;
	}

	@SystemSetup(process = SystemSetup.Process.INIT, type = SystemSetup.Type.ESSENTIAL)
	public void createEssentialData()
	{
		mytrainingService.createLogo(PLATFORM_LOGO_CODE);
	}

	private InputStream getImageStream()
	{
		return MytrainingSystemSetup.class.getResourceAsStream("/mytraining/sap-hybris-platform.png");
	}
}
