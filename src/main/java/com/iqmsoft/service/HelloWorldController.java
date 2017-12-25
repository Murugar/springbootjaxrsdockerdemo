package com.iqmsoft.service;

import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;


@Component
@Path("/test")
public class HelloWorldController {

    @GET
    @Path("/test1")
    public Response test() {
        return Response.status(200).entity("Hello World from JAX-R").build();
    }

}
