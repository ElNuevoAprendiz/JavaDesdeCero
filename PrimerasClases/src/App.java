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



        System.out.println(persona1.apellido + "," + persona1.nombre + " tiene "+ persona1.edad + " años");
        System.out.println(persona2.apellido + "," + persona2.nombre + " tiene "+ persona2.edad + " años");
    }
}
