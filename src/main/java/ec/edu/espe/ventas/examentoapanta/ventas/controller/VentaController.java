package ec.edu.espe.ventas.examentoapanta.ventas.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ec.edu.espe.ventas.examentoapanta.ventas.domain.Venta;
import ec.edu.espe.ventas.examentoapanta.ventas.service.VentaService;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/api/v1/ventas")
public class VentaController {

  private final VentaService ventaService;

  public VentaController(VentaService ventaService) {
      this.ventaService = ventaService;
  }

  @PostMapping
  public ResponseEntity<Void> crear(@RequestBody Venta venta) {
      log.info("Se va a crear el venta: {}", venta);
      try {
          this.ventaService.crear(venta);
          return ResponseEntity.noContent().build();
      } catch(RuntimeException rte) {
          log.error("Error al crear el venta", rte);
          return ResponseEntity.badRequest().build();
      }
  }
}
