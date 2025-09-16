package main.java.factory;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor

@Data
public class LibroDigital extends Libro {


    public LibroDigital(String nombre, String autor, String formato) {
        super(nombre, autor, formato);
    }

    public void mostrarInfoDisp (){

        System.out.println("Libro Digital Adquirir Clave de Acceso a PDF ");
        super.mostrarInfo();
    }


}
