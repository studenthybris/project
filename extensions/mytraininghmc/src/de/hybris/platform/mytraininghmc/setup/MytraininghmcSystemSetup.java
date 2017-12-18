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
package de.hybris.platform.mytraininghmc.setup;

import static de.hybris.platform.mytraininghmc.constants.MytraininghmcConstants.PLATFORM_LOGO_CODE;

import de.hybris.platform.core.initialization.SystemSetup;

import java.io.InputStream;

import de.hybris.platform.mytraininghmc.constants.MytraininghmcConstants;
import de.hybris.platform.mytraininghmc.service.MytraininghmcService;


@SystemSetup(extension = MytraininghmcConstants.EXTENSIONNAME)
public class MytraininghmcSystemSetup
{
	private final MytraininghmcService mytraininghmcService;

	public MytraininghmcSystemSetup(final MytraininghmcService mytraininghmcService)
	{
		this.mytraininghmcService = mytraininghmcService;
	}

	@SystemSetup(process = SystemSetup.Process.INIT, type = SystemSetup.Type.ESSENTIAL)
	public void createEssentialData()
	{
		mytraininghmcService.createLogo(PLATFORM_LOGO_CODE);
	}

	private InputStream getImageStream()
	{
		return MytraininghmcSystemSetup.class.getResourceAsStream("/mytraininghmc/sap-hybris-platform.png");
	}
}
