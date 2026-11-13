public abstract class SerVivo {
    private String nombre;
    private String raza;
    private double pesoEnKg;

    public SerVivo(String nombre, String raza, double pesoEnKg) {
        this.nombre = nombre;
        this.raza = raza;
        this.pesoEnKg = pesoEnKg;
    }

    // Método abstracto: impone por obligación el mensaje "comer"
    public abstract void comer();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public double getPesoEnKg() {
        return pesoEnKg;
    }

    public void setPesoEnKg(double pesoEnKg) {
        this.pesoEnKg = pesoEnKg;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + " | Raza: " + raza + " | Peso: " + pesoEnKg + " kg";
    }
}