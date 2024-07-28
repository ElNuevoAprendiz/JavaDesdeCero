public class Animal {

    // Atributos o propiedades
    String nombre;
    int cantPatas;
    int edad;
    static int contadorDeAnimales = 0;

    
    // Constructor
    public Animal(String nombre, int cantPatas, int edad) {
        this.nombre = nombre;
        this.cantPatas = cantPatas;
        this.edad = edad;
        contadorDeAnimales++;
    }


    // Métodos
    public String hacerSonido(){
        return "Grr";
    }

    public static int getCantidadDeAnimales(){
        return contadorDeAnimales;
    }
}
