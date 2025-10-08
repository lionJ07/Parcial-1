package Punto2;

public class Usuario {
    private String nombre;
    private Notificacion transacciones;
    private Notificacion saldo;
    private Notificacion promociones;

    public Usuario(String nombre, Notificacion transacciones, Notificacion saldo, Notificacion promociones) {
        this.nombre = nombre;
        this.transacciones = transacciones;
        this.saldo = saldo;
        this.promociones = promociones;
    }

    public void notificarTransaccion(String mensaje) {
        System.out.print(nombre + " - Transacción: ");
        transacciones.enviar(mensaje);
    }

    public void notificarSaldo(String mensaje) {
        System.out.print(nombre + " - Saldo: ");
        saldo.enviar(mensaje);
    }

    public void notificarPromocion(String mensaje) {
        System.out.print(nombre + " - Promoción: ");
        promociones.enviar(mensaje);
    }

    public void setTransacciones(Notificacion t) {
        this.transacciones = t;
    }

    public void setSaldo(Notificacion s) {
        this.saldo = s;
    }

    public void setPromociones(Notificacion p) {
        this.promociones = p;
    }
}

