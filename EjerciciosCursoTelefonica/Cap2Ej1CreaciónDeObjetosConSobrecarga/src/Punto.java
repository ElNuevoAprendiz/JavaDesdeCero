public class Punto {
    /*
     * La clase Punto tendrá dos variables de tipo int que representarán
las coordenadas del punto en un sistema cartesiano.
Se crearán tres constructores:
• Sin parámetros
• Con dos enteros
• Con otro Punto que ya exista
Se añadirá una función “void pintar()”, que permita visualizar las
coordenadas del Punto.
     */
    public int coordX,coordY;

    public Punto(){
        coordX=10;
        coordY=20;
    }

    public Punto(int coordX, int coordy){
        this.coordX=coordX;
        this.coordY=coordy;
    }

    public Punto(Punto p){
        this.coordX=p.coordX;
        this.coordY=p.coordY;
    }

    public void pintar(){
        System.out.println(coordX + " , " + coordY);
    }

}
