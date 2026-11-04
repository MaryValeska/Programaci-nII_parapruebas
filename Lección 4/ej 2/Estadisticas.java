public class Estadisticas {
    public static void main(String[] args){
        int[] numeros = {8, 2, 7, 4, 5};
        int suma = 0;
        int min = numeros[0];
        int max = numeros[0];

        for(int i = 0; i < numeros.length; i++){
            suma += numeros[i];
            if(numeros[i] < min){
                min = numeros[i];
            }
            if(numeros[i] > max){
                max = numeros[i];
            }
        }
        double promedio = (double) suma / numeros.length;
        System.out.println("La suma de los números es: " + suma);
        System.out.println("El promedio de los números es: " + promedio);
        System.out.println("El número mínimo es: " + min);
        System.out.println("El número máximo es: " + max);
    }
}