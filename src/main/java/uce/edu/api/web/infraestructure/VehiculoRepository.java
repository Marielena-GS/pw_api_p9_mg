package uce.edu.api.web.infraestructure;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class VehiculoRepository implements PanacheRepository<Vehiculo> {

}
