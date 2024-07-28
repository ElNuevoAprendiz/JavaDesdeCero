public class App {
    public static void main(String[] args) throws Exception {
       Delfin delfin = new Delfin("Toto");
       Pulpo pulpo = new Pulpo("Mul", 8);

       delfin.nadar();
       delfin.comunicarse();
       delfin.alimentar();

       pulpo.nadar();
       pulpo.comunicarse();
       pulpo.alimentar();
    }
}
