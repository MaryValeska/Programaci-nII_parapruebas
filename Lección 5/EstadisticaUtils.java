/*
Escribí una clase Java llamada EstadisticaUtils.java que contenga:

Un método sobrecargado promedio(int[] numeros) y promedio(double[] numeros).
Un método obtenerMayor(int[] numeros) que retorne el valor máximo.
Un método imprimirResumen(String titulo, double resultado) que presente los valores en pantalla.
*/
public class EstadisticaUtils {
    public static double promedio(int[] numeros) {
        double suma = 0;
        for (int numero : numeros) {
            suma += numero;
        }
        return suma / numeros.length;

    }

    public static double promedio(double[] numeros) {
        double suma = 0;
        for (double numero : numeros) {
            suma += numero;
        }
        return suma / numeros.length;
    }

    public static int obtenerMayor(int[] numeros) {
        int mayor = numeros[0];
        for (int numero : numeros) {
            if (numero > mayor) {
                mayor = numero;
            }
        }
        return mayor;
    }

    public static void imprimirResumen(String titulo, double resultado) {
        System.out.println(titulo + ": " + resultado);
    }

    public static void main(String[] args){
        int[] enteros = {9, 7, 2, 4, 5};
        double[] decimales = {1.9, 2.3, 3.6, 4.1, 5.8};

        double promedioEnteros = promedio(enteros);
        double promedioDecimales = promedio(decimales);
        int mayorEnteros = obtenerMayor(enteros);

        imprimirResumen("Promedio de enteros", promedioEnteros);
        imprimirResumen("Promedio de decimales", promedioDecimales);
        imprimirResumen("Mayor de enteros", mayorEnteros);
    }
}
