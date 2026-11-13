public class Persona extends SerVivo {
    public Persona(String nombre, String raza, double pesoEnKg) {
        super(nombre, raza, pesoEnKg);
    }

    @Override
    public void comer() {
        System.out.println(getNombre() + " come ensalada usando cubiertos.");
    }
}