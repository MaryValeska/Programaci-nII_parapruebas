public class Vaca extends SerVivo {
    public Vaca(String nombre, String raza, double pesoEnKg) {
        super(nombre, raza, pesoEnKg);
    }

    @Override
    public void comer() {
        System.out.println(getNombre() + " pasta hierba directamente en el campo.");
    }
}