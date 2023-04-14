package Domain;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Macowins {
  private List<Venta> ventas = new ArrayList<Venta>();

  public Macowins() {
  }

  public void ventaConEfectivo(Item item)
  {
    this.venta(new Venta(item));
  }

  public void ventaConTarjeta(Item item, int cantidadCuotas)
  {
    this.venta(new VentaConTarjeta(item, cantidadCuotas));
  }

  private void venta(Venta venta){
    ventas.add(venta);
  }

  public double gananciaDeUnaFecha(String fecha)
  {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    LocalDate fechaDeBusqueda = LocalDate.parse(fecha, formatter);

    return ventas.stream()
        .filter(venta-> venta.fechaDeventa().equals(fechaDeBusqueda))
        .mapToDouble(venta->venta.precioDeVenta())
        .sum();
  }

}
