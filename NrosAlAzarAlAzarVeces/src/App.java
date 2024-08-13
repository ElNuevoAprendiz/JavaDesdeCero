/*
 * Esta clase resuelve el ejercicio practico  1del modulo 1
 * del curso java standart de la fundaciín telefonica
 * 
 * Escribir un programa que repita un número
determinado de veces la obtención de N números
aleatorios comprendidos en un rango elegido
entre cuatro opciones
 * 
 * Consigna:Casos prácticos. Programación con Java Standard Edition | TELEFÓNICA // 2
Se trata de utilizando Random, se generen números aleatorios
tantas veces como otro número aleatorio indique. Este número
aleatorio hará de variable contadora de un bucle for.
Se aconseja limitar el número aleatorio de la variable contador a un
valor que sea mayor que cero y menor que 20 (aproximadamente).
Los números aleatorios en cada iteración deben estar
comprendidos en el rango de 18 a 65.
Poner todo el código en la función main
 */

public class App {
    public static void main(String[] args) throws Exception {
        int cantDeNrosGenerados, nroGenerado;

        cantDeNrosGenerados = (int)(Math.random()*20+1);

        for (int i = 1; i <= cantDeNrosGenerados; i++) {
            nroGenerado = (int)(Math.random()*(65-18)+18+1);
            System.out.println(nroGenerado);

        }
        
        
    }
}
