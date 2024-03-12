package ec.edu.espe.ventas.examentoapanta.ventas.domain;

import java.math.BigDecimal;
import java.util.Date;

import org.springframework.data.mongodb.core.mapping.Field;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Venta {

  @Field("codigoUnicoProduto")
  private String codigoUnicoProducto;

  @Field("fechaVenta")
  private Date fechaVenta;

  @Field("nombreProducto")
  private String nombreProducto;

  @Field("precioUnitario")
  private BigDecimal precioUnitario;

  @Field("cantidad")
  private Number cantidad;

  @Field("valorTotal")
  private BigDecimal valorTotal;

  public Venta(String codigoUnicoProducto) {
    this.codigoUnicoProducto = codigoUnicoProducto;
  }

  @Override
  public String toString() {
    return "Venta [codigoUnicoProducto=" + codigoUnicoProducto + ", fechaVenta=" + fechaVenta + ", nombreProducto="
        + nombreProducto + ", precioUnitario=" + precioUnitario + ", cantidad=" + cantidad + ", valorTotal="
        + valorTotal + "]";
  }

}


