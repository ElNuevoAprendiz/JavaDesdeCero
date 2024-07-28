public abstract class CriaturasMarinas {
    String nombre;

    public CriaturasMarinas(String nombre) {
        this.nombre = nombre;
    }

    //Esto obliga a sobrescribir en las clases que hereden (se puede usar super para pasarle el atributo nombre)
    abstract void nadar();
}
