package Punto2;

public class NotificacionSMS implements Notificacion {
    @Override
    public void enviar(String mensaje) {
        System.out.println("Se envia al SMS correspondiente: " + mensaje);
    }
}
