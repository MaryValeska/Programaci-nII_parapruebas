public class Promedio {
    public static void main(String[] args) {
        double nota1 = 7.6;
        double nota2 = 4.9;
        double nota3 = 9.7;
        double prom = (nota1 + nota2 + nota3) / 3;
        double resultado = 0;
        if (prom >= 6.0){
            System.out.println("Aprobado.");
            resultado = prom;
        } else if (prom < 6.0){
            System.out.println("Reprobado.");
            resultado = prom;
        }
        System.out.println("Nota final: " + resultado);
    }
}
