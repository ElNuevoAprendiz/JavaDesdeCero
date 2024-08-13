import java.util.Scanner;

//Recordar se deben definir los métodos antes de utilizarlos
//Evidentemente como la clase principal es estatica los metodos deben ser estáticos.
//Supongo que pueden ser públicos en una clase que será luego importada


public class PracticaScanner {
 
    public static void main(String[] args) throws Exception {
        
        int nroAlAzar;
        
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese el limite superior");
        int limiteSuperior = teclado.nextInt();
        System.out.println("Ingrese el limite inferior");
        int limiteInferior = teclado.nextInt();

        GeneradorDeNroAlAzarEntero generador = new GeneradorDeNroAlAzarEntero(limiteInferior, limiteSuperior);

        nroAlAzar = generador.generarNro();

        //nroAlAzar = numerosAlAzar(limiteInferior,limiteSuperior);
        System.out.println(nroAlAzar);


        teclado.close();

    }
}
