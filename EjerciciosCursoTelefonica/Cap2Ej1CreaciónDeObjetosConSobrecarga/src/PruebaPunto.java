import java.util.Random;

public class PruebaPunto {
/*Consigna:

La clase Punto tendrá dos variables de tipo int que representarán
las coordenadas del punto en un sistema cartesiano.
Se crearán tres constructores:
• Sin parámetros
• Con dos enteros
• Con otro Punto que ya exista
Se añadirá una función “void pintar()”, que permita visualizar las
coordenadas del Punto.
Para probar el funcionamiento de los objetos de la clase Punto, así
creada se hará lo siguiente dentro de la función main de una clase
con nombre PruebaPunto:
• Crear un Punto de acuerdo con cada uno de los tres
constructores.
• Visualizar los tres puntos con su función pintar().
• Crear un array de Puntos con el tamaño obtenido por la
generación de un aleatorio no mayor que 20. Las coordenadas
de cada punto serán también números aleatorios comprendidos
en el rango de 0 a 100.
• Visualizar las coordenadas de todos los elementos del array de
Puntos.
 * 
 */




    public static void main(String[] args) throws Exception {
       Punto p1 = new Punto();
       Punto p2 = new Punto(6,8);
       Punto p3 = new Punto(p1);

       p1.pintar();
       p2.pintar();
       p3.pintar();

       Random azar = new Random();

       Punto[] puntos = new Punto[azar.nextInt(21)];

       System.out.println("El array tiene " + puntos.length + " elementos u objetos");
       for (int i=0; i<(puntos.length); i++) {
        puntos[i] = new Punto((azar.nextInt(100)+1), (azar.nextInt(100)+1)); // Inicializa cada elemento del array usando el constructor con dos parámetros
        
       }
       /*
        * for (int i = 0; i < puntos.length; i++) {
            puntos[i] = new Punto(); // Inicializa cada elemento del array
            coordenada = azar.nextInt(100) + 1;
            System.out.println(coordenada);
            puntos[i].coordX = coordenada;
            puntos[i].coordY = azar.nextInt(100) + 1;
            System.out.println(puntos[i].coordX + " , " + puntos[i].coordY);
}
        */
       int contador = 1;
       for (Punto punto:puntos){
            System.out.println("Coordenadas del " + contador + "º punto:(" + punto.coordX +"," + punto.coordY + ")");
            contador++;
            
       }

        


    }
}
