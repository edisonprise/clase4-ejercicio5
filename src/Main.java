import clases.Producto;
import Filtros.Descartable;
import Filtros.Imperecedero;
import Filtros.Vendible;
import interfaces.Filtrable;

import java.util.Arrays;



public class Main {
    public static void main(String[] args) {
        // Crear array de productos
        Producto[] productos = new Producto[] {
                new Producto("Producto 1", 50.0, 1),
                new Producto("Producto 2", 25.0, 2),
                new Producto("Producto 3", 150.0, 3),
                new Producto("Descartable 1", 5.0, 4),
                new Producto("Descartable 2", 10.0, 5),
        };

        // Ordenar productos por precio
        Arrays.sort(productos);
        System.out.println("Array de productos ordenados por precio:");
        for(Producto producto: productos) {
            System.out.println(producto);
        }
        // Filtrar y mostrar productos que cumplen con los filtros
        System.out.println("\nProductos que cumplen con el filtro 'Vendible':");
        Filtrable vendibleFiltro = new Vendible();
        filtrarProductos(productos, vendibleFiltro);

        System.out.println("\nProductos que cumplen con el filtro 'Descartable':");
        Filtrable descartableFiltro = new Descartable();
        filtrarProductos(productos, descartableFiltro);

        System.out.println("\nProductos que cumplen con el filtro 'Imperecedero':");
        Filtrable imperecederoFiltro = new Imperecedero();
        filtrarProductos(productos, imperecederoFiltro);
    }

    private static void filtrarProductos(Producto[] productos, Filtrable filtro) {
        System.out.println("Productos que cumplen con el filtro: '" + filtro.getClass().getSimpleName()  + "' :");
        for(Producto producto: productos){
            if(filtro.cumpleFiltro(producto)){
                System.out.println(producto);
            }
        }
    }
}