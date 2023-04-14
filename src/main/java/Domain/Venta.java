package Domain;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Venta
{
  private LocalDate fechaDeventa;
  private List<Item> items = new ArrayList<Item>();

  public Venta(Item item) {
    items.add(item);
    fechaDeventa = LocalDate.now();
  }

  public void agregarItem(Item item) {
    items.add(item);
  }

  public double precioDeVenta()
  {
    return items.stream().mapToDouble(item->item.precioItem()).sum();
  }

  public LocalDate fechaDeventa() {
    return fechaDeventa;
  }
}
