package ec.edu.espe.ventas.examentoapanta.ventas.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ec.edu.espe.ventas.examentoapanta.ventas.dao.VentaRepository;
import ec.edu.espe.ventas.examentoapanta.ventas.domain.Venta;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class VentaService {

  private final VentaRepository ventaRepository;

  public VentaService(VentaRepository ventaRepository) {
    this.ventaRepository = ventaRepository;
  }

  @Transactional
  public void crear (Venta venta) {

  }


}
