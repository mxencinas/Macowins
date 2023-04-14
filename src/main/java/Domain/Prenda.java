package Domain;

public class Prenda {
  private float precioBase;
  private TipoPrenda tipo;
  private IEstado estado;

  public Prenda(float precioBase, TipoPrenda tipo, IEstado estado) {
    this.precioBase = precioBase;
    this.tipo = tipo;
    this.estado = estado;
  }

  public float precioDePrenda() {
    return estado.precioDePrenda(precioBase);
  }
  public TipoPrenda getTipo() {
    return tipo;
  }
}
