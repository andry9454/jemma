/**
 * This file is part of JEMMA - http://jemma.energy-home.org
 * (C) Copyright 2013 Telecom Italia (http://www.telecomitalia.it)
 *
 * JEMMA is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License (LGPL) version 3
 * or later as published by the Free Software Foundation, which accompanies
 * this distribution and is available at http://www.gnu.org/licenses/lgpl.html
 *
 * JEMMA is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License (LGPL) for more details.
 *
 */
package org.energy_home.jemma.ah.cluster.zigbee.hvac;

import org.energy_home.jemma.ah.hac.ApplianceException;
import org.energy_home.jemma.ah.hac.IEndPointRequestContext;
import org.energy_home.jemma.ah.hac.ServiceClusterException;

public interface ThermostatUserInterfaceConfigurationServer {

	final static String ATTR_TemperatureDisplayMode_NAME = "TemperatureDisplayMode";
	final static String ATTR_KeypadLockout_NAME = "KeypadLockout";
	final static String ATTR_ScheduleProgrammingVisibility_NAME = "ScheduleProgrammingVisibility";

	public short getTemperatureDisplayMode(IEndPointRequestContext context) throws ApplianceException, ServiceClusterException;

	public short getKeypadLockout(IEndPointRequestContext context) throws ApplianceException, ServiceClusterException;

	public short getScheduleProgrammingVisibility(IEndPointRequestContext context) throws ApplianceException,
			ServiceClusterException;

}
