public class FiltrarArreglo {

    public static Persona[] filtrarPorEdad(Persona[] personas, int edadMinima) {
        if (personas == null || personas.length == 0) {
            throw new IllegalArgumentException("El arreglo de personas no puede estar vacío.");
        }
        if (edadMinima < 0) {
            throw new IllegalArgumentException("La edad mínima no puede ser negativa.");
        }

        int count = 0;
        for (Persona persona : personas) {
            if (persona.getEdad() >= edadMinima) {
                count++;
            }
        }

        Persona[] filtradas = new Persona[count];
        int index = 0;
        for (Persona persona : personas) {
            if (persona.getEdad() >= edadMinima) {
                filtradas[index++] = persona;
            }
        }

        return filtradas;
    }
}
