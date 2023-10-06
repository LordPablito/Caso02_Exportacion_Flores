package exportacion_flores;

import java.util.ArrayList;
import java.util.List;

public class Inventario {
    private List<Planta> plantas;
    private List<Orden> ordenes; // Cambio aquí

    public Inventario() {
        plantas = new ArrayList<>();
        ordenes = new ArrayList<>(); // Inicializa la lista de órdenes
    }

    public void agregarPlanta(Planta planta) {
        plantas.add(planta);
    }

    public void eliminarPlanta(Planta planta) {
        plantas.remove(planta);
    }

    public List<Planta> obtenerTodasLasPlantas() {
        return plantas;
    }

    // Métodos para agregar y eliminar órdenes si es necesario
    public void agregarOrden(Orden orden) {
        ordenes.add(orden);
    }

    public void eliminarOrden(Orden orden) {
        ordenes.remove(orden);
    }

    public List<Orden> obtenerTodasLasOrdenes() {
        return ordenes;
    }
}
}