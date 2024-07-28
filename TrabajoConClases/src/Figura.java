public abstract class Figura {

    // Este comportamiento será obligatorio en la clase que herede
    abstract double calcularArea();

    void imprimirInformacion(){
        System.out.println("Esta info viene desde la clase abstracta");
    }
    
}
