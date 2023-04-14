package Domain;

import java.util.List;

public class VentaConTarjeta extends Venta{
  private int cantidadDeCuotas;
  private float coeficienteFijo = 2f;
  private float porcentajeDePrenda = 1f;
  public VentaConTarjeta(Item item, int cantidadCuotas) {
    super(item);
    cantidadDeCuotas = cantidadCuotas;
  }

  @Override
  public double precioDeVenta() {
    return super.precioDeVenta() + (cantidadDeCuotas * coeficienteFijo) + porcentajeDePrenda * super.precioDeVenta() / 100;
  }
}
