package Exceptions;
public class CalculadoraExcepcion extends Exception {

    String descripcion;

    public CalculadoraExcepcion(String descripcion) {
        setDescripcion(descripcion);
    }

    @Override
    public String getMessage(){
        return getDescripcion();
    }



    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    

}
