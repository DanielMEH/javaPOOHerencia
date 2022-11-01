public class Datos {


    private String nombre;
    private String color;
    private String tamaño;
    private String velocidad;
    private Double peso;
    private int modelo;

    public void setAcuaticos(String nombre, String color, String tamaño, String velocidad, Double peso, int modelo) {
        this.nombre = nombre;
        this.color = color;
        this.tamaño = tamaño;
        this.velocidad = velocidad;
        this.peso = peso;
        this.modelo = modelo;
    }


    public void getDataAcuaticos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Color: " + color);
        System.out.println("Tamaño: " + tamaño);
        System.out.println("Velocidad: " + velocidad);
        System.out.println("Peso: " + peso);
        System.out.println("Modelo: " + modelo);
    }

    }

