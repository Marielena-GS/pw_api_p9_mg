package uce.edu.api.web.interfaces;

import jakarta.annotation.security.RolesAllowed;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.Response;
import uce.edu.api.web.application.VehiculoService;

@Path("/vehiculos")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class VehiculoResource {

    @Inject
    VehiculoService vehiculoService;

    @POST
    @RolesAllowed("admin")
    public Response crear(Vehiculo vehiculo){
        Vehiculo guardar = vehiculoService.guardar(vehiculo);
        return Response.status(Response.Status.CREATED).entity(guardar).build();
    }

    @GET
    @RolesAllowed("admin")
    public List<Vehiculo> listar(){
        return vehiculoService.listar();
    }
}
