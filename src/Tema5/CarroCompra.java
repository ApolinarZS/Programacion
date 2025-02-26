package Tema5;

import java.util.HashSet;
import java.util.Set;

class CarroCompra {
    private Set<String> productosDisponibles;
    private Set<String> carro;

    public CarroCompra(Set<String> productosDisponibles) {
        this.productosDisponibles = productosDisponibles;
        this.carro = new HashSet<>();
    }

    public void agregarProductoAlCarro(String producto) {
        if (productosDisponibles.contains(producto)) {
            if (carro.add(producto)) {
                System.out.println("Producto '" + producto + "' añadido al carro.");
            } else {
                System.out.println("El producto '" + producto + "' ya está en el carro.");
            }
        } else {
            System.out.println("El producto '" + producto + "' no está disponible en la lista de compra.");
        }
    }

    public void mostrarProductosEnCarro() {
        if (carro.isEmpty()) {
            System.out.println("El carro está vacío.");
        } else {
            System.out.println("Productos en el carro:");
            carro.forEach(p -> System.out.println("- " + p));
        }
    }

    public void mostrarProductosFaltantes() {
        Set<String> faltantes = new HashSet<>(productosDisponibles);
        faltantes.removeAll(carro);
        if (faltantes.isEmpty()) {
            System.out.println("No faltan productos por añadir al carro.");
        } else {
            System.out.println("Productos faltantes en el carro:");
            faltantes.forEach(p -> System.out.println("- " + p));
        }
    }
}
