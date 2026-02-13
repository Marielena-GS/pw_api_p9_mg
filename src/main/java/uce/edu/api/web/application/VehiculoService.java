package uce.edu.api.web.application;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import uce.edu.api.web.infraestructure.VehiculoRepository;

@ApplicationScoped
public class VehiculoService {

    @Inject
    VehiculoRepository vehiculoRepository;

    @POST
    @Path("")
    @Consumes("application/json")   
    public Vehiculo guardar(Vehiculo vehiculo){
        vehiculoRepository.persist(vehiculo);
        return vehiculo;    
    }

    @GET
    @Path("")
    public List<Vehiculo> listar(){
        return vehiculoRepository.listAll();
    }
}
