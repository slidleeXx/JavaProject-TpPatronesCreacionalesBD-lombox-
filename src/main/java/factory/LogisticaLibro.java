package main.java.factory;

public abstract class LogisticaLibro {


    public static Libro crearLibro(String tipo, String nombre, String autor) {

        if (tipo.equalsIgnoreCase("fisico")) {
            return new LibroFisico(nombre,autor,"FISICO");
        } else if (tipo.equalsIgnoreCase("digital")) {
            return new LibroDigital(nombre,autor,"PDF");
        } else {
            throw new IllegalArgumentException("Error tipo de libro no admitido");
        }
    }



    public void entregar(String tipo , Libro libro){
        if (tipo.equalsIgnoreCase("fisico")) {

            System.out.println("Entrega fisica libro :");
            libro.mostrarInfo();

        } else if (tipo.equalsIgnoreCase("digital")) {
            System.out.println("Cambiar llave accerso a libro Digital ");
            libro.mostrarInfo();
        } else {
            throw new IllegalArgumentException("Error tipo de libro no admitido");
        }

    }



}



