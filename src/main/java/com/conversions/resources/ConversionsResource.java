package com.conversions.resources;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/conversions")
/**
 * A REST web service that provides endpoints for celsius/kelvin and kilometer/mile conversions.
 */
public class ConversionsResource {

    private static final Logger LOGGER = LoggerFactory.getLogger(ConversionsResource.class);

    @GET
    @Path("/ktoc/{value}")
    @Consumes({ MediaType.APPLICATION_JSON })
    @Produces({ MediaType.APPLICATION_JSON })
    public Float ktoc(@PathParam("value") float kelvin) {
        return kelvin - 273.15f;
    }

    @GET
    @Path("/ctok/{value}")
    @Consumes({ MediaType.APPLICATION_JSON })
    @Produces({ MediaType.APPLICATION_JSON })
    public Float ctok(@PathParam("value") float celsius) {
        return celsius + 273.15f;
    }

    @GET
    @Path("/mtok/{value}")
    @Consumes({ MediaType.APPLICATION_JSON })
    @Produces({ MediaType.APPLICATION_JSON })
    public Float mtok(@PathParam("value") float miles) {
        return miles * 8f / 5;
    }

    @GET
    @Path("/ktom/{value}")
    @Consumes({ MediaType.APPLICATION_JSON })
    @Produces({ MediaType.APPLICATION_JSON })
    public Float ktom(@PathParam("value") float kilometers) {
        return kilometers * 5f / 8;
    }

}
