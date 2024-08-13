import java.util.Scanner;
//import java.math.random;


public class PracticaScanner {
    public static void main(String[] args) throws Exception {
        int limiteSuperior, limiteInferior, nroAlAzar;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese el limite superior");
        limiteSuperior = teclado.nextInt();
        System.out.println("Ingrese el limite inferior");
        limiteInferior = teclado.nextInt();

        nroAlAzar = numerosAlAzar(limiteInferior,limiteSuperior);


        public int numerosAlAzar(limiteInf, limiteSup) {
            int numero;
            numero = Math.random(limiteSup-limiteInf)*limiteInf+1;

            return numero;
        } 

    }
}
