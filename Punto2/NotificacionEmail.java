package Punto2;

public class NotificacionEmail implements Notificacion {
    @Override
    public void enviar(String mensaje) {
        System.out.println("Se envia al email correspondiente: " + mensaje);
    }
}
