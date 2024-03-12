package ec.edu.espe.ventas.examentoapanta.ventas.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import ec.edu.espe.ventas.examentoapanta.ventas.domain.Venta;

@Repository
public interface VentaRepository  extends MongoRepository<Venta, String>{
  
}
