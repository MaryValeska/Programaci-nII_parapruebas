import java.util.HashMap;
import java.util.Map;

public class Principal {
    public static void main(String[] args) {
        // b) Almacén dinámico indexado por el factor unívoco (nombre)
        Map<String, SerVivo> almacen = new HashMap<>();

        SerVivo persona = new Persona("Carlos", "Humano", 78.5);
        SerVivo perro = new Perro("Toby", "Labrador", 28.0);
        SerVivo vaca = new Vaca("Lola", "Holando-Argentino", 540.0);

        almacen.put(persona.getNombre(), persona);
        almacen.put(perro.getNombre(), perro);
        almacen.put(vaca.getNombre(), vaca);

        // c) Mostrar adecuadamente por consola nombre, raza, peso y su comportamiento polimórfico
        System.out.println("=== LISTADO COMPLETO ===");
        for (SerVivo ente : almacen.values()) {
            System.out.println(ente.toString());
            ente.comer();
            System.out.println("-------------------------------------------------");
        }

        // Ejemplo de búsqueda por clave unívoca (nombre)
        String nombreBuscado = "Toby";
        System.out.println("\n=== BÚSQUEDA POR NOMBRE: " + nombreBuscado + " ===");
        SerVivo encontrado = almacen.get(nombreBuscado);
        if (encontrado != null) {
            System.out.println("Encontrado -> " + encontrado);
            encontrado.comer();
        } else {
            System.out.println("No se encontró ningún registro con ese nombre.");
        }
    }
}