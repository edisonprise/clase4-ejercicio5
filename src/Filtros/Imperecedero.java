package Filtros;
import clases.Producto;
import interfaces.Filtrable;

public class Imperecedero implements Filtrable{
    public boolean cumpleFiltro(Producto producto){
        //Aqui podriamos definir criterios propios para determinar si un producto es imperecedero
        // por ejemplo, si su precio es mayor que 100
        return producto.getPrecio()> 100;
    }
}
