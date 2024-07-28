import java.beans.MethodDescriptor;

public class Persona2 {

***************************************************************************************************
Orden en que deberían aparecer las secciones de una clase

1)Atrivutos
2)Constructor (y sobrecarga)
3)Métodos 
4)Getters y setters 

******************************************************************************************************



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


// Definision de getters y setters 
// *** Para hacerlos en forma automatica en VS botón derecho -> source action -> generate getters and setters
public String getApellido() {
    return apellido;
}

public int getEdad(){
    return edad;
}

public String getNombre(){
    return nombre;
}

public void setApellido(String apellido){
    this.apellido = apellido;
}

public void setNombre(String nombre) {
    this.nombre = nombre;
}

public void setEdad(int edad){
    this.edad = edad;
}
}
