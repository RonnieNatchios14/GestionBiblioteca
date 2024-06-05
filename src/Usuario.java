import java.util.ArrayList;
import java.util.List;

public class Usuario extends Persona {
    private List<Libro> librosPrestados;

    public Usuario(String nombre, String apellido) {
        super(nombre, apellido);
        this.librosPrestados = new ArrayList<>();
    }

    public void prestarLibro(Libro libro) {
        librosPrestados.add(libro);
        libro.setPrestado(true);
        System.out.println(getNombreCompleto() + " ha prestado el libro: " + libro.getTitulo());
    }

    public void devolverLibro(Libro libro) {
        if (librosPrestados.remove(libro)) {
            libro.setPrestado(false);
            System.out.println(getNombreCompleto() + " ha devuelto el libro: " + libro.getTitulo());
        } else {
            System.out.println(getNombreCompleto() + " no ha prestado el libro: " + libro.getTitulo());
        }
    }

    public void mostrarLibrosPrestados() {
        System.out.println("Libros prestados por " + getNombreCompleto() + ":");
        for (Libro libro : librosPrestados) {
            System.out.println(libro);
        }
    }
}
