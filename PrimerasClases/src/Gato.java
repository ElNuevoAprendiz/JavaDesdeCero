public class Gato extends Animal{

    public Gato(String nombre, int cantPatas, int edad){
        super(nombre, cantPatas, edad);

    }
    // Se redefina el metodo con el decorador @Override
    @Override

    public String hacerSonido(){
        return "Miau!";
    }

}
