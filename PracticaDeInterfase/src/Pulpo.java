public class Pulpo extends CriaturasMarinas {

    int cantTentaculos;


    public Pulpo(String nombre, int cantTentaculos) {
        super(nombre);
        this.cantTentaculos =cantTentaculos;
    }

    @Override
    void nadar() {
        // TODO Auto-generated method stub
        System.out.println(nombre + "esta nadando con sus " + cantTentaculos + " tentaculos");
    }

}
