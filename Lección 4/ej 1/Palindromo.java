public class Palindromo{
    public static void main(String[] args) {
    
        String frase = "Somos o no somos";
        String minusc = frase.toLowerCase();
        String pali = minusc.replace(" ", "");

        if (pali.equals(new StringBuilder(pali).reverse().toString())){
            System.out.println("Es palindromo.");
        } else{
            System.out.println("No es palindromo.");
        }
    }
}