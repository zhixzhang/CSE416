package com.example.cse416_server_jax.HTTP_RequestController;

import com.example.cse416_server_jax.Objects.*;
import com.example.cse416_server_jax.Persistence.*;
import javax.websocket.server.PathParam;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


@Path("/state")
public class StateController {
    private State selectedState;

    public State getSelectedState() {
        return selectedState;
    }

    public void setSelectedState(State selectedState) {
        this.selectedState = selectedState;
    }
    @POST
    @Path("/select")
    @Produces(MediaType.APPLICATION_JSON)
    public Response selectState(@FormParam("statename") String statename){
        //return Response.ok(statename).header("Access-Control-Allow-Origin", "*").build();
        State state=StateRepo.findStateByName(statename);
        if (state==null){
            return Response.status(Response.Status.NOT_FOUND).entity("Didn't find the state: "+statename).build();
        }
        DistrictPlan dp=state.getEnactedPlan();
        if (dp==null){
            return Response.status(Response.Status.NOT_FOUND).entity("The state didn't find the enacted plan").build();
        }
        return Response.ok(dp).header("Access-Control-Allow-Origin", "*").build();
    }


}
