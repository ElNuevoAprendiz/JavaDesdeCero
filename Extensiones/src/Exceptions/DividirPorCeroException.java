package Exceptions;

public class DividirPorCeroException extend Exception{
    @Override

    public String getMessage(){
        return "No se puede dividir por cero"
    }
}
