public class Perro extends SerVivo {
    public Perro(String nombre, String raza, double pesoEnKg) {
        super(nombre, raza, pesoEnKg);
    }

    @Override
    public void comer() {
        System.out.println(getNombre() + " come alimento balanceado desde su plato.");
    }
}