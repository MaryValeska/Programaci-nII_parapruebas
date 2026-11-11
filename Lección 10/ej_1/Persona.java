
public class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        if (nombre == null || nombre.isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío.");
        }
        if (edad < 0) {
            throw new IllegalArgumentException("La edad no puede ser negativa.");
        }
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public static void mostrarEstadisticas(Persona[] personas){
        Persona masJoven = personas[0];
        Persona masGrande = personas[0];
        double sumaEdades = 0;
        double promedioEdad = 0;

        for (Persona persona : personas) {
            int edadActual = persona.getEdad();
            if (persona.getEdad() < masJoven.getEdad()) {
                masJoven = persona;
            }
            if (persona.getEdad() > masGrande.getEdad()) {
                masGrande = persona;
            }
            sumaEdades += edadActual;
        }
        promedioEdad = sumaEdades / personas.length;

        System.out.println("Persona más joven: " + masJoven.getNombre() + " con edad: " + masJoven.getEdad());
        System.out.println("Persona más grande: " + masGrande.getNombre() + " con edad: " + masGrande.getEdad());
        System.out.println("Promedio de edades: " + promedioEdad);
    }

}

