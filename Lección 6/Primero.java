public class Primero {
    public static int indicePrimero(int[] valores, int objetivo) {
   if (valores == null) {
        return -1; 
    }
    for (int i = 0; i < valores.length; i++){
       if(valores[i] == objetivo){
          return i;
       }
   }
    return -1;
}
    public static void main(String[] args){
        int[] numeros = {67, 82, 96, 77, 82};

        System.out.println(indicePrimero(null, 96));  // Caso null -> -1
        System.out.println(indicePrimero(new int[]{}, 67));   // Arreglo vacío -> -1
        System.out.println(indicePrimero(numeros, 67));       // Primera posición -> 0
        System.out.println(indicePrimero(numeros, 77));       // Última posición -> 3
        System.out.println(indicePrimero(numeros, 82));       // Duplicados (devuelve el primero) -> 1
        System.out.println(indicePrimero(numeros, 99));       // No encontrado -> -1
    }
}
