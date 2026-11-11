public static void main(String[] args) {
    System.out.println("--- Prueba Válida ---");
    Persona[] personas = new Persona[5];
    personas[0] = new Persona("Juan", 25);
    personas[1] = new Persona("María", 30);
    personas[2] = new Persona("Pedro", 20);
    personas[3] = new Persona("Ana", 35);
    personas[4] = new Persona("Luis", 28);
    Persona.mostrarEstadisticas(personas);

    System.out.println("\n--- Prueba con nombre vacío ---");
    Persona[] personasConNombreVacio = new Persona[1];
    personasConNombreVacio[0] = new Persona("", 25);
    Persona.mostrarEstadisticas(personasConNombreVacio);
    


    System.out.println("\n--- Prueba con edad negativa ---");
    Persona[] personasConEdadNegativa = new Persona[1];
    personasConEdadNegativa[0] = new Persona("Carlos", -5);
    Persona.mostrarEstadisticas(personasConEdadNegativa);

}   
