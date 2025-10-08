package Punto1;

public interface Subject {
    void suscribir(Observer o);
    void desuscribir(Observer o);
    void notificacion(String mensaje);
}
