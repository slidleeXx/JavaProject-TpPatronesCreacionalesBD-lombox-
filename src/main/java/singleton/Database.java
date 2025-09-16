package main.java.singleton;
import java.util.ArrayList;
import java.util.List;
import main.java.factory.Libro;


public class Database {
    private static Database instance;
    private List<Libro> libros;

    private Database() {
        libros = new ArrayList<>();
    }

    public static synchronized Database getInstance() {
        if (instance == null) {
            instance = new Database();
        }
        return instance;
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public void mostrarLibros(){
        int i=0;
        if (!libros.isEmpty()) {
        for (Libro a: libros) {
            System.out.println("Libron n: " + i);
            a.mostrarInfo();
            i++;
        }}else {
            System.out.println("No existe libros en la Base de Datos");
        }

    }

}
