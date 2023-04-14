package Domain;

import static java.lang.System.*;

public class Main {
  public static void main(String[] args) {

    Prenda bermuda = new Prenda(1500,TipoPrenda.PANTALON,new Nuevo());
    Prenda camisa = new Prenda(4000, TipoPrenda.CAMISA, new Liquidacion());
    Prenda saquito = new Prenda(3000, TipoPrenda.SACO, new Promocion(1000));

    out.println("Bermuda "+bermuda.precioDePrenda());
    out.println("Camisa "+camisa.precioDePrenda());
    out.println("Saquito "+saquito.precioDePrenda());

    Item itemBermuda = new Item(bermuda, 2);
    Item itemCamisa = new Item(camisa, 3);
    Item itemSaquito = new Item(saquito, 2);


    Macowins macowins = new Macowins();

    macowins.ventaConEfectivo(itemBermuda);
    macowins.ventaConTarjeta(itemCamisa,5);
    macowins.ventaConEfectivo(itemSaquito);

   out.println("Ganancia de la fecha 2023-04-14 : " + macowins.gananciaDeUnaFecha("2023-04-14"));


  }
}