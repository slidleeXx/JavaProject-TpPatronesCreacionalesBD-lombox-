package main.java.factory;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor

@Data
public class LibroFisico extends Libro {

    public LibroFisico(String nombre, String autor, String formato) {
        super(nombre, autor, formato);
    }

    public void mostrarInfoDisp (){

        System.out.println("Libro Fisico ver Disponibilidad en Biblioteca");
        super.mostrarInfo();
    }




}
