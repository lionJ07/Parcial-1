package Punto1;

import java.util.ArrayList;
import java.util.List;

public class Curso implements Subject {
    private List<Observer> observadores = new ArrayList<>();
    @Override
    public void suscribir(Observer o) {
        observadores.add(o);
    }
    @Override
    public void desuscribir(Observer o) {
        observadores.remove(o);
    }
    @Override
    public void notificacion(String mensaje) {
        for (Observer o : observadores) {
            o.actualizar(mensaje);
        }
    }
    public void añadirCurso(String curso) {
        System.out.println("Se ha creado el curso *" + curso + "* correctamente.\n");
        notificacion("El curso *" + curso + "* se encuentra disponible.\n");
    }
    public void eliminarCurso(String curso) {
        System.out.println("Se ha eliminado el curso *" + curso + "* correctamente.\n");
        notificacion("El curso *" + curso + "* ha sido eliminado del sistema.\n");
    }
}

