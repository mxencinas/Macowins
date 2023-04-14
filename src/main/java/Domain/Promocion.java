package Domain;

public class Promocion implements IEstado{
  private float valorDeDescuento;
  @Override
  public float precioDePrenda(float precioBase) {
    if (valorDeDescuento > precioBase)
    {
      return precioBase;
    }
    return precioBase-valorDeDescuento;
  }

  public Promocion(float valorDescuento) {
    valorDeDescuento = valorDescuento;
  }
}
