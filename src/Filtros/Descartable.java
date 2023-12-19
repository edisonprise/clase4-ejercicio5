package Filtros;
import clases.Producto;
import interfaces.Filtrable;

public class Descartable implements Filtrable{
    @Override
    public boolean cumpleFiltro(Producto producto) {
        return producto.getNombre().toUpperCase().contains("DESCARTABLE");
    }
}
