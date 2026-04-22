package com.udesc.account.framework;

import com.udesc.account.common.dto.ClienteDTO;
import com.udesc.account.common.service.GetCliente;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;

@Path("/clientes")
public class ClienteResource {

    private final GetCliente getCliente;

    public ClienteResource(GetCliente getCliente) {
        this.getCliente = getCliente;
    }

    @GET
    @Path("/{id}")
    public ClienteDTO buscarPorId(@PathParam("id") Long id) {
        return getCliente.buscarPorId(id);
    }
}
