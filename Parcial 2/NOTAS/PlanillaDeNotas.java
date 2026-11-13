public class PlanillaDeNotas {
    private final String[] alumnos;
    private final int[] notas;
    private int cantidad;

    public PlanillaDeNotas(int cupo) {
        if (cupo <= 0) {
            throw new IllegalArgumentException("El cupo debe ser mayor a cero.");
        }
        this.alumnos = new String[cupo];
        this.notas = new int[cupo];
        this.cantidad = 0;
    }

    public void cargar(String alumno, int nota) throws CupoCompletoException {
        if (alumno == null || alumno.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre del alumno es obligatorio.");
        }
        if (nota < 1 || nota > 10) {
            throw new NotaInvalidaException(nota);
        }
        if (cantidad >= alumnos.length) {
            throw new CupoCompletoException(alumnos.length);
        }

        alumnos[cantidad] = alumno.trim();
        notas[cantidad] = nota;
        cantidad++;
    }

    public void cargarDesdeTexto(String alumno, String notaTexto) throws CupoCompletoException {
        int nota;
        try {
            nota = Integer.parseInt(notaTexto);
        } catch (NumberFormatException e) {
            throw new NotaInvalidaException(
                "No es un número válido: '" + notaTexto + "'", e
            );
        }
        // La validación de rango vive exclusivamente en cargar()
        cargar(alumno, nota);
    }

    public double promedio() {
        if (cantidad == 0) {
            return 0.0;
        }
        int suma = 0;
        for (int i = 0; i < cantidad; i++) {
            suma += notas[i];
        }
        return (double) suma / cantidad;
    }
}