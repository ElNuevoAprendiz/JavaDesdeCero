import javax.naming.ldap.PagedResultsControl;

public class App {
    public static void main(String[] args) throws Exception {
        
        Persona persona1 = new Persona("Pedro", "Pascal", 48, "Churrero", 20, true);
        Persona persona2 = new Persona("Carlos", "Pascal", 23, "Panchero");
        Persona2 persona3 = new Persona2("Mimi", "Pons", 97);


        System.out.println(persona1.darNombreCompleto() + " tiene "+ persona1.edad + " años" + " y esta recibido de " + persona1.carrera.nombre);
        System.out.println(persona2.darNombreCompleto() + " tiene "+ persona2.edad + " años" + " y esta recibido de " + persona2.carrera.nombre);
        System.out.println(persona3.darNombreCompleto() + " tiene "+ persona2.edad + " años");
       
        
        
    }
}
