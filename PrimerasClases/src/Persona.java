public class Persona {

    // atributos (estados y caracteristicas de un objeto)
    String nombre;
    String apellido;
    int edad;
    Carrera carrera;
    
    // Métodos (comportamientos de un objeto)

    public String darNombreCompleto(){
            return apellido + ", " + nombre;

    }
    public String enviarSaludo(String saludado){
        if (edad > 40) return "Buenos días, querido " + saludado;
        return "Hola, como estas " + saludado + "?";
    } 
}
