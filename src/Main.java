//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Libro libro1 = new Libro();
        libro1.titulo = "Huasipungo";
        libro1.autor = "Jorge Icaza";
        libro1.paginaCount = 182;

        Libro libro2 = new Libro();
        libro2.titulo = "Cumandá";
        libro2.autor = "Juan León Mera";
        libro2.paginaCount = 244;

        System.out.println(libro1.infoLibro());
        System.out.println(libro2.infoLibro());
    }
}

class Libro {
    String titulo;
    String autor;
    int paginaCount;

    String infoLibro() {
        return "Título: " + titulo + ", Autor: " + autor + ", Páginas: " + paginaCount;
    }
}
