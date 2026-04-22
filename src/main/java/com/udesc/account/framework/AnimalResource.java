package com.udesc.account.framework;

import com.udesc.account.common.dto.AnimalDTO;
import com.udesc.account.common.service.GetAnimal;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;

@Path("/animals")
public class AnimalResource {

    private final GetAnimal getAnimal;

    public AnimalResource(GetAnimal getAnimal) {
        this.getAnimal = getAnimal;
    }

    @GET
    @Path("/{id}")
    public AnimalDTO buscarPorId(@PathParam("id") Long id) {
        return getAnimal.buscarPorId(id);
    }
}