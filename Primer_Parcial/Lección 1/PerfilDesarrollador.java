public class PerfilDesarrollador {
    public static void main(String[] args){
        if(args.length >= 2){
            String nombre = args[0];
            String lenguaje = args [1];
            System.out.println("Desarrollador: " + nombre);
            System.out.println("Lenguaje: " + lenguaje);
        } else {
            System.out.println("Error: ingrese su nombre y el lenguaje de desarrollador que utiliza.");
        }
    }
}