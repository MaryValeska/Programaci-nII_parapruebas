public class Textos {
    public static void main(String[] args){
      String  texto = "El amor y el odio son dos lados de una misma cuchilla.";
      String[] palabras = texto.split(" ");
      String palabraMasLarga = "";  

      for (String palabra : palabras){
          if (palabra.length() > palabraMasLarga.length()){
              palabraMasLarga = palabra;
          }
      }
      System.out.println("Cantidad de palabras: " + palabras.length);
      System.out.println("La palabra más larga es: " + palabraMasLarga);
    }
}
