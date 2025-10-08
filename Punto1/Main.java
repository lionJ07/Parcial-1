package Punto1;

public class Main {
    public static void main(String[] args) {
        Curso cursos = new Curso();

        Observer Leo = new WebMaster("Leonardo Guio");
        Observer Alex = new Periodista("Alexander Mora");
        Observer Valentina = new CommunityManager("Valentina Castañeda");

        cursos.suscribir(Leo);
        cursos.suscribir(Alex);
        cursos.suscribir(Valentina);

        cursos.añadirCurso("Inteligencia Artificial II");
        cursos.añadirCurso("Aplicaciones de la IA en diferentes entornos");
        cursos.eliminarCurso("Inteligencia Artificial II");
    }
}

