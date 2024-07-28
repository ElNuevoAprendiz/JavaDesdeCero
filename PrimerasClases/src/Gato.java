public class Gato extends Animal{

    public Gato(String nombre, int cantPatas, int edad){
        super(nombre, cantPatas, edad);

    }

    @Override

    public String hacerSonido(){
        return "Miau!";
    }

}
