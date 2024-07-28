public class App {
    public static void main(String[] args) throws Exception {
        
        Persona persona1 = new Persona();
        persona1.nombre = "Raul";
        persona1.apellido = "Alvarez";
        persona1.edad = 57;

        Persona persona2 = new Persona();
        persona2.apellido = "Perez";
        persona2.nombre = "Mariana";
        persona2.edad = 24;

        Carrera carrera1 = new Carrera();
        carrera1.nombre = "Licenciatura";
        carrera1.duracion = 4;
        carrera1.estaEnCursos = false;

        Carrera carrera2 = new Carrera();
        carrera2.nombre = "Ingenieria";
        carrera2.duracion = 5;
        carrera2.estaEnCursos = true;

        persona1.carrera = carrera1;
        persona2.carrera = carrera2;



        System.out.println(persona1.darNombreCompleto() + " tiene "+ persona1.edad + " años" + " y esta recibido de " + persona1.carrera.nombre);
        System.out.println(persona2.darNombreCompleto() + " tiene "+ persona2.edad + " años" + " y esta cursando " + persona2.carrera.nombre);
        // System.out.println(persona1.enviarSaludo("Tito"));
        
    }
}
