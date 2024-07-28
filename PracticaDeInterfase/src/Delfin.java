import interfaces.Comunicacion;

public class Delfin extends CriaturasMarinas implements Comunicacion{

   
   
    public Delfin(String nombre) {
        super(nombre);
        //TODO Auto-generated constructor stub
    }

    @Override

    void nadar() {
        System.out.println(nombre + "esta nadando como delfin");
    }

}
