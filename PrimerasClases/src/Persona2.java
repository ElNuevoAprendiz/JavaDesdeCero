public class Persona2 {
// atributos (estados y caracteristicas de un objeto)
private String nombre;
private String apellido;
private int edad;


//Constructor

public Persona2(String nombre, String apellido, int edad){
    
    this.nombre = nombre;
    this.apellido = apellido;
    this.edad = edad;
    


}

// Métodos (comportamientos de un objeto)

public String darNombreCompleto(){
        return apellido + ", " + nombre;

}
public String enviarSaludo(String saludado){
    if (edad > 40) return "Buenos días, querido " + saludado;
    return "Hola, como estas " + saludado + "?";
}
}
