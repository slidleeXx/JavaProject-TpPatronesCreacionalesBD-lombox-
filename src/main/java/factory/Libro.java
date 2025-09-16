package main.java.factory;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
public abstract class Libro implements Cloneable {
    private String nombre;
    private String autor;
    private String formato;

    public  void mostrarInfo(){
        System.out.println("Libro -> Nombre: " + nombre+ " , Autor : "+autor + ", Formato : " + formato);
    }


    // Prototype
    @Override
    public Libro clone () {
        try {
            return (Libro) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

}
