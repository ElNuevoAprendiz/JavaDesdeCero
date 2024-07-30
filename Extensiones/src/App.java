public class App {
    public static void main(String[] args) throws Exception {
        // Se comienza a trabajar con las excepciones unchecked (no verificadas)

        int nuro1 =5;
        int nro2 = 0;
        int resultado;

        
 
        try {
            resultado = nuro1/nro2;
            System.out.println(resultado);
        } catch (Exception e) {// en vez de e se puede poner error o cualquier cosa
            // TODO: handle exception
            e.printStackTrace();//No da la misma info que cuando se presenta el error 

            // Aunque nos imprime la linea que sigue se ejecuta
            System.out.println(Esto va después de la excepcion);
        }
    }
}
