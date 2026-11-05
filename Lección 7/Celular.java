/*
Desafío: Modelado de Dispositivos Electrónicos
Diseñá una clase Java llamada Celular.java aplicando Abstracción y Encapsulamiento:

Atributos privados: marca, modelo, porcentajeBateria (entero de 0 a 100).
Método usarApp(int minutos) que consuma 1% de batería por cada 5 minutos de uso.
Método cargarBateria(int cantidad) que aumente el porcentaje sin superar el 100%.
*/

public class Celular {
    private String marca;
    private String modelo;
    private int bateria = 100;

    public Celular(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public void usarApp(int minutos){
        int consumo = minutos / 5; // Cada 5 minutos consume 1% de batería
        bateria -= consumo;
        
        if(bateria < 0){
            bateria = 0;
        }
    }

    public void mostrarEstado(){
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Batería: " + bateria + "%");
    }

    public void cargarBateria(int cantidad){
        bateria += cantidad;
        if(bateria > 100){
            bateria = 100;
        }

    }

    public static void main(String[] args){
        Celular celular = new Celular("Apple", "iPhone 12");
        celular.mostrarEstado();
        celular.usarApp(25);
        celular.mostrarEstado();
        celular.cargarBateria(20);
        celular.mostrarEstado();
    }
}
