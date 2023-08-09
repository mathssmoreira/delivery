package com.delivery;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import services.DeliveryService;

@Path("/delivery")
public class DeliveryResource {

    @Inject
    DeliveryService service;
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return service.getName(); }
}
