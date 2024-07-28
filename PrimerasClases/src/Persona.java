public class Persona {

    // atributos (estados y caracteristicas de un objeto)
    String nombre;
    String apellido;
    int edad;
    
    // Métodos (comportamientos de un objeto)

    public String darNombreCompleto(){
            return apellido + ", " + nombre;

    }
    public String enviarSaludo(String saludado){
        return "hola, como estas " + saludo + "?";
    } 
}
