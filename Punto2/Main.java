package Punto2;

public class Main {
    public static void main(String[] args) {
        Usuario Leonardo = new Usuario("Leonardo Guio", new NotificacionSMS(), new NotificacionSMS(), new NotificacionSMS());

        Leonardo.notificarTransaccion("Realizaste un pago de $25.000 en tu app Nequi.");
        Leonardo.notificarSaldo("Tu saldo es inferior a $20.000 en tu app Daviplata.");
        Leonardo.notificarPromocion("Promoción: Paga y gana, por compras superiores a $100.000 puedes entrar en un sorteo por una moto RTX, para mas información entra a tu app Nequi.");

        System.out.println("\n Se cambia la preferencia del usuario Leonardo para promociones. \n");

        Leonardo.setPromociones(new NotificacionEmail());
        Leonardo.notificarPromocion("Nuevo descuento del 20% en tu app Rappi por compras por medio de la app Daviplata. No te lo pierdas.");
    }
}
