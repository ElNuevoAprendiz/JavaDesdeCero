import Exceptions.CalculadoraExcepcion;


public class Calculadora {
    /* Ya que una clase no puede extender de varias, y puede necesitar muchas excepciones, 
    entonces, debido a esto en vez de poner que extiende de distintas clases de exceptiones
    definidad como la que se hizo llamada DividirPorCeroException.class, se usa la instrucción
    throws (que significa tirar) para utilizar las excepciones definidas o controladas que vayamos a crear
    y necesitemos usar.

    Esta instrucción se coloca luego de los parentesis que contienen los parametros del método al que va 
    a afectar esta excepción controlada.

    Por ejemplo en nuestro caso vamos a usar en el método dividir de la clase calculadora, la excepción 
    controlada que creamos y llamamos DividirPorCeroException (la cual se encuentra dentro de la clase
    que lleva el mismo nombre)

    Luego dentro del método que la va a usar hay que hacer el manejo
    */ 

    public int dividir(int dividendo, int divisor) throws CalculadoraExcepcion {
        
        if(divisor ==0) throw new CalculadoraExcepcion("No se puede dividir por cero"); // La situación que sabemos que va a generar la excepción
        // Y sino continua el flujo normal
        return dividendo / divisor;
    }
}
