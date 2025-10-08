package Punto1;

public class CommunityManager implements Observer {
    private String nombre;
    public CommunityManager(String nombre) {
        this.nombre = nombre;
    }
    @Override
    public void actualizar(String mensaje) {
        System.out.println(nombre + " (CommunityManager) recibió la actualización: " + mensaje);
    }
}
