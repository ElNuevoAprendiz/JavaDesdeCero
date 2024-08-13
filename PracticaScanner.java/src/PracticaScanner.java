import java.util.Scanner;

//Recordar se deben definir los métodos antes de utilizarlos
//Evidentemente como la clase principal es estatica los metodos deben ser estáticos.
//Supongo que pueden ser públicos en una clase que será luego importada


public class PracticaScanner {

    public static int numerosAlAzar(int limiteInf, int limiteSup) {
        int numero;
        //numero = Math.random(limiteSup-limiteInf)*limiteInf+1;
        numero = (int)(Math.random()*(limiteSup-limiteInf)+limiteInf+1);

        return numero;
    } 
    public static void main(String[] args) throws Exception {
        int limiteSuperior, limiteInferior, nroAlAzar;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese el limite superior");
        limiteSuperior = teclado.nextInt();
        System.out.println("Ingrese el limite inferior");
        limiteInferior = teclado.nextInt();

        nroAlAzar = numerosAlAzar(limiteInferior,limiteSuperior);
        System.out.println(nroAlAzar);


        teclado.close();

    }
}
