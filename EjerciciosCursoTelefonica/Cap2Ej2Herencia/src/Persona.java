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
         
         @Override
         public String toString(){

            
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
