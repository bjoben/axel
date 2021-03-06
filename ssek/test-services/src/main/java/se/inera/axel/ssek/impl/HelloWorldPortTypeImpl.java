/**
 * Copyright (C) 2013 Inera AB (http://www.inera.se)
 *
 * This file is part of Inera Axel (http://code.google.com/p/inera-axel).
 *
 * Inera Axel is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Inera Axel is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>
 */
package se.inera.axel.ssek.impl;

import org.ssek.schemas.helloworld._2011_11_17.HelloWorldRequest;
import org.ssek.schemas.helloworld._2011_11_17.HelloWorldResponse;
import org.ssek.schemas.helloworld._2011_11_17.wsdl.HelloWorldPortType;

import javax.jws.WebService;

@WebService(endpointInterface = "org.ssek.schemas.helloworld._2011_11_17.wsdl.HelloWorldPortType")
public class HelloWorldPortTypeImpl implements HelloWorldPortType {

	@Override
	public HelloWorldResponse helloWorld(HelloWorldRequest helloWorldRequest) {
		HelloWorldResponse response = new HelloWorldResponse();
		response.setMessage("Hello " + helloWorldRequest.getMessage());
		return response;
	}
}
