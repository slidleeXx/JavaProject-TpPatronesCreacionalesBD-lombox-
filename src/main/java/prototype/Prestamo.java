package main.java.prototype;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import main.java.builder.Usuario;
import main.java.factory.Libro;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Prestamo implements Cloneable{
    Libro libro;
    Usuario usuario;
    private String fechaInicio;
    private String fechaFin;



    public void mostrar() {
        System.out.println("\nNombre Usuario : " + usuario.getNombre());
        libro.mostrarInfo();

    }

    // Prototype
    @Override
    public Object clone() {
        try {
            Prestamo prestamoclone = (Prestamo) super.clone();
            prestamoclone.libro = (Libro) libro.clone();
            prestamoclone.usuario = (Usuario) usuario.clone();
            return prestamoclone ;

        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

}
