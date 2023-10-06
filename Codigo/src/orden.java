import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class orden {
    private int numeroOrden;
    private List<planta> items;

    public orden(int numeroOrden, String pais, Date fecha) { // Corrección aquí
        this.numeroOrden = numeroOrden;
        items = new ArrayList<>();
    }

    public void agregarItem(planta planta) {
        items.add(planta);
    }

    public List<planta> obtenerItems() {
        return items;
    }

    // Otros métodos relacionados con las órdenes
}
