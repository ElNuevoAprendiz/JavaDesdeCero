public class Carrera {

    String nombre;
    int duracion;
    boolean estaEnCursos;

    public Carrera(String nombre, int duracion, boolean enCurso){
        this.nombre = nombre;
        this.duracion = duracion;
        this.estaEnCursos = enCurso;
    }

    //Sobrecarga de constructores
    public Carrera(String nombre){
        this.nombre = nombre;
    }

}