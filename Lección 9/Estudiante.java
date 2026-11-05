public class Estudiante {
    private final String nombre;
    private double promedio;

    public Estudiante(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            System.out.println("Nombre no válido, se usó el valor por defecto.");
            this.nombre = "Sin nombre";
        } else {
            this.nombre = nombre;
        }
    }

    public void setPromedio(double promedio) {
        if (promedio >= 0 && promedio <= 10) {
            this.promedio = promedio;
        } else {
            System.out.println("Promedio no válido. Debe estar entre 0 y 10.");
        }
    }
}

    }

}
