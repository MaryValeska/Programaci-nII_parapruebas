    /*Un main que demuestre, usando los valores booleanos devueltos y los mensajes impresos, 
    que el objeto nunca queda con un promedio fuera de rango, 
    ni al construirse ni al modificarse. */
    
public static void main(String[] args) {
        System.out.println("--- Prueba 1: Estudiante Válido ---");
        Estudiante e1 = new Estudiante("Lucas", 8.5);
        System.out.println("Nombre: " + e1.getNombre() + " | Promedio: " + e1.getPromedio() + " | ¿Aprobó?: " + e1.aprobo());

        System.out.println("\n--- Prueba 2: Promedio inválido en construcción ---");
        // Debería avisar y poner 0.0
        Estudiante e2 = new Estudiante("María", 14.0); 
        System.out.println("Nombre: " + e2.getNombre() + " | Promedio asignado: " + e2.getPromedio());

        System.out.println("\n--- Prueba 3: Constructor de Conveniencia ---");
        // Solo nombre, promedio arranca en 0.0
        Estudiante e3 = new Estudiante("Pedro"); 
        System.out.println("Nombre: " + e3.getNombre() + " | Promedio por defecto: " + e3.getPromedio());

        System.out.println("\n--- Prueba 4: Modificación con setPromedio (true/false) ---");
        boolean exito1 = e1.setPromedio(9.5);
        System.out.println("¿Se cambió a 9.5?: " + exito1 + " | Nuevo promedio: " + e1.getPromedio());
        boolean exito2 = e1.setPromedio(-3.0); 
        // Debería dar false y conservar 9.5
        System.out.println("¿Se cambió a -3.0?: " + exito2 + " | Promedio conservado: " + e1.getPromedio());
    }
