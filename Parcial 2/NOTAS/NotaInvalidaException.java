public class NotaInvalidaException extends RuntimeException {
    private final Integer notaRechazada;

    public NotaInvalidaException(int notaRechazada) {
        super("Nota inválida (" + notaRechazada + "): debe estar entre 1 y 10.");
        this.notaRechazada = notaRechazada;
    }

    public NotaInvalidaException(String mensaje, Throwable causa) {
        super(mensaje, causa);
        this.notaRechazada = null;
    }

    public Integer getNotaRechazada() {
        return notaRechazada;
    }
}