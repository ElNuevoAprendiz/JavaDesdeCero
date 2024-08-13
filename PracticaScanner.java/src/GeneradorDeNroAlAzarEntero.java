public class GeneradorDeNroAlAzarEntero {
    //Primero definimos las porpiedades que tendrá la clase

    private int limiteSuperior, limiteInferior, nroAlAzar;

    //Luego se hace el constructor

    GeneradorDeNroAlAzarEntero(int limiteInferior, int limiteSuperior){
        this.limiteInferior = limiteInferior;
        this.limiteSuperior = limiteSuperior;
    }

    public int generarNro(){
        nroAlAzar = (int)(Math.random()*(limiteSuperior-limiteInferior)+limiteInferior+1);

        return nroAlAzar;
    }
}
