import java.util.Objects;

public class Persona {

    /*
         * Casos prácticos. Programación con Java Standard Edition | TELEFÓNICA // 2
            Caso práctico
            Crear una clase Persona y su subclase Empleado
            Persona identificador tipo

            Datos
            
            nombre  String
            edad    byte
            sexo    char
            dni String
            bCasado boolean

         */

         private String nombre;
         private byte edad;
         private char sexo;
         private String dni;
         private boolean bCasado;

         public Persona(){

         }

         public Persona(String nombre, byte edad, char sexo, String dni, boolean bCasado){
            this.nombre = nombre;
            this.edad = edad;
            this.sexo= sexo;
            this.dni = dni;
            this.bCasado =  bCasado; 
            
         }
         

         //La sobreescritura del método toString, puede devolver una cadena que comienza con el nombre del objeto
         //y luego entre paréntesis (como un mapa?) los atrivutos o propiedades del objeto con sus valores.
         @Override
         public String toString(){
            return "Persona{"+
                    "nombre='" + nombre + '\'' + 
                    ", edad=" + edad +
                    '}';
            
         }

         @Override
         public boolean equals(Object o){
            if(this == o) return true;
            if(o == null || getClass() != o.getClass()) return false;
            //Persona persona = (Persona) o;: Castea el objeto o a Persona para poder acceder a sus atributos.

            Persona persona = (Persona) o; //Según yo, crea un objeto persona, que los castea como persona
            // pero a la vez al hacerlo igual a o, apuntan los dos al mismo objeto o.


            //return edad == persona.edad && Objects.equals(nombre, persona.nombre);

            // edad es del objeto, como si fuera this.edad, y persona.edad es del objeto que estoy comparando
            //Compara la edad usando el operador == ya que es la forma de comparar si dos enteros son iguales
            // y compara si es igual el nombre usando Objects.equals() para manejar correctamente los casos en 
            //que nombre pueda ser nulo. (Ya que es el método que se usa para compara String)

            return edad == persona.edad && sexo == persona.sexo && bCasado == persona.bCasado &&  Objects.equals(nombre, persona.nombre) && Objects.equals(dni, persona.dni);

         }


         

        @Override
        public int hashCode() {
            
            return Objects.hash(edad, sexo, bCasado, nombre, dni);
        }

        public char getSexo() {
            return sexo;
        }

        public String getDni() {
            return dni;
        }

        public boolean isbCasado() {
            return bCasado;
        }
        public String getNombre(){
            return nombre;
        }

        public byte getEdad(){
            return edad;
        }

        public void setSexo(char sexo){
            this.sexo = sexo;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public void setEdad(byte edad) {
            this.edad = edad;
        }

        public void setDni(String dni) {
            this.dni = dni;
        }

        public void setbCasado(boolean bCasado) {
            this.bCasado = bCasado;
        }

        

    
}
