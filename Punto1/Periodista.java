package Punto1;

public class Periodista implements Observer {
    private String nombre;
    public Periodista(String nombre) {
        this.nombre = nombre;
    }
    @Override
    public void actualizar(String mensaje) {
        System.out.println(nombre + " (Periodista) recibió la actualización: " + mensaje);
    }
}
