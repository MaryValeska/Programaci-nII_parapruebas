public class CalculoPromedio {
    public static void main(String[] args) {
        double nota1 = 7.1;
        double nota2 = 5.7;
        double nota3 = 8.2;
        double promedio = (nota1 + nota2 + nota3) / 3;
        String aprobado = (promedio >= 6.0)? "Aprobado." : "Reprobado.";
        System.out.println("Nota final: " + promedio);
        System.out.println("Estado: " + aprobado);
    }
}
