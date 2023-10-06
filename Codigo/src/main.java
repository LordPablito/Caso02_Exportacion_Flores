package exportacion_flores.planta;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class main {
    public static void main(String[] args) {
        // Cargar la lista de países desde el archivo de texto
        List<String> paises = cargarPaisesDesdeArchivo("countries.txt");

        // Verificar si se cargaron países
        if (paises.isEmpty()) {
            System.out.println("No se pudieron cargar los países. Usando país por defecto.");
        }

        // Crear instancias de planta
        Planta planta1 = new Planta("Rosa", "Rosa", 2000);
        Planta planta2 = new Planta("Tulipán", "Flor", 1700);

        // Crear una instancia de orden
        Orden orden1 = new Orden(1, obtenerPaisAleatorio(paises), new Date());
        Orden orden2 = new Orden(2, obtenerPaisAleatorio(paises), new Date());

        // Agregar las plantas a las órdenes
        orden1.agregarItem(planta1);
        orden2.agregarItem(planta2);

        // Crear una instancia de inventario
        Inventario inventario = new Inventario();

        // Agregar las órdenes al inventario
        inventario.agregarOrden(orden1);
        inventario.agregarOrden(orden2);

        // Obtener la lista de plantas en el inventario
        System.out.println("Plantas en el inventario:");
        for (Planta planta : inventario.obtenerTodasLasPlantas()) {
            System.out.println(planta);
        }
    }

    // Método para cargar países desde un archivo de texto
    private static List<String> cargarPaisesDesdeArchivo(String archivo) {
        List<String> paises = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String line;
            while ((line = br.readLine()) != null) {
                paises.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return paises;
    }

    // Método para obtener un país aleatorio de la lista de países
    private static String obtenerPaisAleatorio(List<String> paises) {
        if (paises != null && !paises.isEmpty()) {
            int randomIndex = (int) (Math.random() * paises.size());
            return paises.get(randomIndex);
        } else {
            return "País por defecto";
        }
    }
}
