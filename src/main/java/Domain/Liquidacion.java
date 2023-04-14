package Domain;

public class Liquidacion implements IEstado
{
  private float porcentajeDescuento = 50.0f;

  @Override
  public float precioDePrenda(float precioBase) {
    return precioBase * porcentajeDescuento / 100;
  }

}
