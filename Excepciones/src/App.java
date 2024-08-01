import Exceptions.CalculadoraExcepcion;


public class App {
    public static void main(String[] args) throws Exception {
        // Se comienza a trabajar con las excepciones unchecked (no verificadas)

        int nuro1 =5;
        int nro2 = 0;
        int resultado;

        Calculadora calculadora = new Calculadora();

 
        try {
            resultado = calculadora.dividir(nuro1, nro2);
            System.out.println(resultado);
        } catch (CalculadoraExcepcion e) {// Remplazamos Exception por nuestra excepción CalculadoraExcepcion, 
            //porque saber que el el tipo de excepcion que va a ocurrir, y ademas en vez de "e" se puede poner error o cualquier cosa
           
            e.printStackTrace();//No da la misma info que cuando se presenta el error 

            // Aunque nos imprime la linea que sigue se ejecuta
            System.out.println("Esto va después de la excepcion");
        }
        finally{
            System.out.println("Hemos finalizado el calculo haya sido exitoso o no");
        }
    }
}
