public class CuentaBancaria {
    private String titular;
    private String numeroCuenta;
    private double saldo;

    public CuentaBancaria(String titular, String numeroCuenta, double saldo) {
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
        } else {
            System.out.println("El monto a depositar debe ser positivo.");
        }
    }

    public void retirar(double monto) {
        if (monto > 0 && monto <= saldo) {
            saldo -= monto;
        } else {
            System.out.println("Monto inválido o saldo insuficiente.");
        }
    }

    public void mostrarEstado(){
        System.out.println("Titular: " + titular);
        System.out.println("Número de Cuenta: " + numeroCuenta);
        System.out.println("Saldo: $" + saldo);
    }

    public static void main(String[] args){
        CuentaBancaria cuenta = new CuentaBancaria("Juan Pérez", "123456789", 1000.0);
        cuenta.mostrarEstado();
        cuenta.depositar(500.0);
        cuenta.mostrarEstado();
        cuenta.retirar(200.0);
        cuenta.mostrarEstado();
        cuenta.retirar(2000.0); // Intento de retiro con saldo insuficiente
        cuenta.mostrarEstado();
        cuenta.depositar(-100.0);     // Intento de depósito con monto negativo
        cuenta.mostrarEstado();
    }
}
