package ejemplosClasesConstructores;

public class Auto {

    private String marca;
    private String modelo;
    private String color;


    public Auto(String marca, String modelo, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }

    public void establecerInfo() {
        System.out.println("Auto: " + marca + " " + modelo + ", Color: " + color);
    }

   
}
