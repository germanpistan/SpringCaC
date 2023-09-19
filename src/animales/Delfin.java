package animales;

public class Delfin extends Animal{

    public String moverse(){
        return "El delfín nada";
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
