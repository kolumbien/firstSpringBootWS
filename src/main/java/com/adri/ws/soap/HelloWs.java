package com.adri.ws.soap;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.apache.cxf.feature.Features;

/*
 * To make a class a Web services end point, we annotate!
 * */

@WebService
@Features(features="org.apache.cxf.feature.LoggingFeature")
public class HelloWs {
	
		@WebMethod
		public String nombreMetodo() {
			return "Hola";
		}
}
