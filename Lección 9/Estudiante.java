public class Estudiante {
    private final String nombre;
    private double promedio;

    /* 3. Un constructor de conveniencia que reciba solo el nombre y arranque con promedio 0.0, 
    sin duplicar la validación. */

    public Estudiante(String nombre) {
    this(nombre, 0.0);
    }

    /* 2. Un constructor canónico que reciba nombre y promedio: 
    si el nombre es nulo o está en blanco, usa "Sin nombre" por defecto e informa por consola; 
    el promedio se valida delegando en el setter y, si es inválido, 
    usa 0.0 por defecto e informa por consola.*/ 

    public Estudiante(String nombre, double promedio) {
        if (nombre == null || nombre.trim().isEmpty()) {
            System.out.println("Nombre no válido, se usó Sin nombre por defecto.");
            this.nombre = "Sin nombre";
        } else {
            this.nombre = nombre;
        }
        if (!setPromedio(promedio)) {
            System.out.println("Promedio no válido. Se usó el valor 0.0 por defecto.");
            this.promedio = 0.0;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public double getPromedio() {
        return promedio;
    }

    /* 4. Un setter setPromedio que aplique la misma regla de rango que el constructor y devuelva boolean: 
    true si acepta el nuevo valor, false si lo rechaza (y en ese caso conserva el promedio anterior). */

    public boolean setPromedio(double promedio) {
        if(promedio >= 0 && promedio <= 10) {
            this.promedio = promedio;
            return true;
        }
        return false;
        }
    
    // 5. Un método aprobo() que devuelva true si el promedio es mayor o igual a 6.0.
    public boolean aprobo(){
        if(promedio >= 6){
            return true;
        } else {
            return false;
        }
    }

}
