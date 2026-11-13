public class SistemaNotas {
    public static void main(String[] args) {
        PlanillaDeNotas planilla = new PlanillaDeNotas(3);

        String[][] intentos = {
            {"Sofía", "9"},
            {"Martín", "11"},
            {"Lucía", "ocho"},
            {"", "7"},
            {"Tomás", "6"},
            {"Valentina", "10"},
            {"Bruno", "8"}
        };

        for (int i = 0; i < intentos.length; i++) {
            String alumno = intentos[i][0];
            String notaTexto = intentos[i][1];

            try {
                planilla.cargarDesdeTexto(alumno, notaTexto);
                System.out.println("Carga exitosa -> Alumno: " + alumno + " | Nota: " + notaTexto);

            } catch (IllegalArgumentException e) {
                System.out.println("Error de validación -> " + e.getMessage());

            } catch (NotaInvalidaException e) {
                System.out.print("Error en la nota -> " + e.getMessage());
                if (e.getCause() != null) {
                    System.out.print(" | Causa técnica: " + e.getCause());
                }
                System.out.println();

            } catch (CupoCompletoException e) {
                System.out.println("Error de capacidad -> " + e.getMessage()
                        + " (Cupo máximo: " + e.getCupoMaximo() + ")");

            } finally {
                System.out.println("Intento #" + (i + 1) + " finalizado.\n");
            }
        }

        System.out.printf("Promedio final de notas cargadas: %.2f%n", planilla.promedio());
    }
}