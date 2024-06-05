import java.util.ArrayList;
import java.util.List;

public class Bibliotecario extends Persona {
    protected List<Libro> libros;

    public Bibliotecario(String nombre, String apellido) {
        super(nombre, apellido);
        this.libros = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
        System.out.println("Libro agregado: " + libro.getTitulo());
    }

    public void mostrarLibros() {
        System.out.println("Lista de libros en la biblioteca:");
        for (Libro libro : libros) {
            System.out.println(libro);
        }
    }

    public void prestarLibro(Usuario usuario, Libro libro) {
        if (libros.contains(libro) && !libro.isPrestado()) {
            usuario.prestarLibro(libro);
        } else {
            System.out.println("El libro " + libro.getTitulo() + " no está disponible para préstamo.");
        }
    }

    public void recibirDevolucion(Usuario usuario, Libro libro) {
        usuario.devolverLibro(libro);
    }
}
