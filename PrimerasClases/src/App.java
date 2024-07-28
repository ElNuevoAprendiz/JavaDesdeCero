

public class App {
    public static void main(String[] args) throws Exception {
        
        Animal animal = new Animal("Bestia", 4, 200);
        Gato gato = new Gato("Pelusa",4, 4);
        Perro perro = new Perro("firulay", 4, 16);

        System.out.println("El animal llamado "+ animal.nombre + " hace " + animal.hacerSonido());
        System.out.println("El gato llamado "+ gato.nombre + " hace " + gato.hacerSonido());
        System.out.println("El perro llamado "+ perro.nombre + " hace " + perro.hacerSonido());
        
        System.out.println("El total de animales creados es: " + Animal.contadorDeAnimales);
        System.out.println("Yo atiendo a mis animales en " + Veterinaria.nombre);
    }
}
