import javax.naming.ldap.PagedResultsControl;

public class App {
    public static void main(String[] args) throws Exception {
        
        Persona persona1 = new Persona("Pedro", "Pascal", 48, "Churrero");


        System.out.println(persona1.darNombreCompleto() + " tiene "+ persona1.edad + " años" + " y esta recibido de " + persona1.carrera.nombre);
       
        
        
    }
}
