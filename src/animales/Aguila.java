package animales;

public class Aguila extends Animal{

    public String moverse(){
        return "El ave vuela";
    }

    @Override
    public void comer() {

    }

    public void volar(){}

    @Override
    public void enviarMensaje(String mensaje, Comunicable receptor) {

    }

    @Override
    public void recibirMensaje(String mensaje, Comunicable emisor) {

    }
}
