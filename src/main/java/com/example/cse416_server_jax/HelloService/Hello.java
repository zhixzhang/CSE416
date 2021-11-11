package com.example.cse416_server_jax.HelloService;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/plan")
public class Hello {
    @GET
    @Path("/Hello/{statename}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response Hello(@PathParam("statename") String statename){
        return Response.ok(statename).header("Access-Control-Allow-Origin", "*").build();
    }
}
