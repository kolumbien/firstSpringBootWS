package com.adri.ws.soap.config;

import javax.xml.ws.Endpoint;

import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.adri.ws.soap.HelloWs;



@Configuration
public class WebServiceConfig {
	
	/* we are asking spring to inject it in runtime*/
	@Autowired
	private Bus bus;
	
	@Bean
	public Endpoint endpoint() {
		Endpoint endpoint = new EndpointImpl(bus, new HelloWs());
		endpoint.publish("/helloendpoint");
		return endpoint;
	}
	
}
