import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
         

     /*   Tipos compuestos de datos, enumeraciones | TELEFÓNICA // 18
Las enumeraciones se crean en el ámbito
de la clase, no se pueden crear dentro del
ámbito static de la función main.
En el código que se muestra a continuación
se utiliza la enumeración EstadoCivil y sus
funciones ordinal() y values(), así como la
función toString() que implícitamente es
llamada para los objetos u enumeraciones
que se utilizan en los parámetros de la
expresión de concatenación de las funciones
“print” o “println” de System.out.*/

enum EstadoCivil {
    SOLTERO, CASADO, VIUDO, SEPARADO, DIVORCIADO
    }
    
    EstadoCivil ec = CASADO;
    if (ec == EstadoCivil.SOLTERO){ /*sentencias*/}
    switch( ec ){
    case SOLTERO:
    //...
    case CASADO:
    //...
    }


Random aleatorio = new Random();
int num = aleatorio.nextInt(9)+1;
int posicion=0;

EstadoCivil[] valores_enumeracion = EstadoCivil.values();
for(EstadoCivil estado: valores_enumeracion){
posicion = estado.ordinal();
System.out.println(“La constante número “+ posicion+
“ es “+estado.toString());
}
EstadoCivil [] estados = new EstadoCivil[num];
int nestados = EstadoCivil.values().length;
for (int i=0; i<num; i++ ){
estados[i]=valores_enumeracion[aleatorio.
nextInt(nestados)];
}
posicion=0;
for(EstadoCivil estado: estados){
System.out.println(“estados[“+posicion+”]:
“+estado);
posicion++;
}
    }
}
