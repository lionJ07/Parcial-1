package Punto1;

public class WebMaster implements Observer {
    private String nombre;
    public WebMaster(String nombre) {
        this.nombre = nombre;
    }
    @Override
    public void actualizar(String mensaje) {
        System.out.println(nombre + " (Webmaster) recibió la actualización: " + mensaje);
    }
}
