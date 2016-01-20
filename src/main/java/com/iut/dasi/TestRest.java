package com.iut.dasi;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.springframework.stereotype.Component;

@Component

@Path("/helloworld")
public class TestRest {
	
	@GET
	 @Path("/toto")
	 
	 public String simplejson() {
		 return "Yes ca marche !!";
	 }

}
