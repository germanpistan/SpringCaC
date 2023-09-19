package animales;

public class Gato extends Animal implements Comunicable{
    static {
        System.out.println("Se cargo la clase gato");
    }
    //esto es un bloque estatico, para inicializar las variables estaticas previos a la clase

    private Boolean tieneGarras;
    public static int cantGatos;

    public Gato(String nombre, String color, double peso, double tamano, Boolean tieneGarras){
        super(nombre,color, peso, tamano);
        this.tieneGarras = tieneGarras;
        cantGatos++;
    }

    public Gato(){
        cantGatos++;
    }

    public int getCantGatos() {
        return cantGatos;
    }



    // Sobreescribimos el método moverse

    public String moverse(){
        return "El gato corre";
    }

    @Override
    public void comer() {

    }

    @Override
    public void enviarMensaje(String mensaje, Comunicable receptor) {

    }

    @Override
    public void recibirMensaje(String mensaje, Comunicable emisor) {

    }
}
