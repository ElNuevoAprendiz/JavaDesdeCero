import interfaces.Comunicable;


public class Delfin extends CriaturasMarinas implements Comunicable{


   
    public Delfin(String nombre) {
        super(nombre);
        //TODO Auto-generated constructor stub
    }

    @Override

    void nadar() {
        System.out.println(nombre + "esta nadando como delfin");
    }

    @Override
    public void comunicarse() {
        System.out.println(nombre + "emite chasquidos  y sonidos para comunicarse");
    }

}
