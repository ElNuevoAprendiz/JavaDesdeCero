public class Animal {

    // Atributos o propiedades
    String nombre;
    int cantPatas;
    int edad;
    static int contadorDeAnimales = 0; // Atributo estático

    
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

     // Método estático
    public static int getCantidadDeAnimales(){
        return contadorDeAnimales;
    }
}
