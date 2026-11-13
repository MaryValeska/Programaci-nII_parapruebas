public class CupoCompletoException extends Exception {
    private final int cupoMaximo;

    public CupoCompletoException(int cupoMaximo) {
        super("Cupo completo: la planilla ya alcanzó su máximo de " + cupoMaximo + " alumnos.");
        this.cupoMaximo = cupoMaximo;
    }

    public int getCupoMaximo() {
        return cupoMaximo;
    }
}