public class Animal {

    String nombre;
    int cantPatas;
    int edad;

    
    
    public Animal(String nombre, int cantPatas, int edad) {
        this.nombre = nombre;
        this.cantPatas = cantPatas;
        this.edad = edad;
    }



    public String hacerSonido(){
        return "Hacer sonido genérico";
    }
}
