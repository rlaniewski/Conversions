package com.conversions.resources;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/conversions")
/**
 * A REST web service that provides endpoints for celsius/kelvin and kilometer/mile conversions.
 */
public class ConversionsResource {

    @GET
    @Path("/ktoc/{value}")
    @Consumes({ MediaType.APPLICATION_JSON })
    @Produces({ MediaType.APPLICATION_JSON })
    public Float ktoc(@PathParam("value") float kelvin) {
        return kelvin - 273.15f;
    }

}
