package main.java;

import main.java.abstractfactory.*;
import main.java.builder.Usuario;
import main.java.factory.Libro;
import main.java.factory.LibroDigital;
import main.java.factory.LibroFisico;
import main.java.factory.LogisticaLibro;
import main.java.prototype.Prestamo;
import main.java.singleton.Database;

public class Main {

    public static void main(String[] args) {

        //Probamos Patron Singleton
        Database db1 = Database.getInstance();
        Database db2 = Database.getInstance();
        Database db3 = Database.getInstance();

        System.out.println("\n Se realiza prueba de unica instancia.");
        System.out.println("¿Estamos en la intancia de Base de Datos correcta?");
        System.out.println(db1 == db2);

        System.out.println("\n ¿Estamos en la intancia de Base de Datos correcta?");
        System.out.println(db2 == db3);

        //Probamos creacion de libros
        Libro librodigital1 = LogisticaLibro.crearLibro("digital" , "El señor de los anillos","Charles Peterson");
        Libro librodigital2 = LogisticaLibro.crearLibro("digital" , "Harry Potter y el caliz de fuego","Steven Hings");

        Libro librofisico1 = LogisticaLibro.crearLibro("fisico" , "Los dias del Venado.","Hanna Sipson");
        Libro librofisico2 = LogisticaLibro.crearLibro("fisico","Los juegos del hambre: En llamas.", "Steve Jobs");

        // Guardamos los libros en la DB
        db1.agregarLibro(librodigital1);
        db1.agregarLibro(librodigital2);
        db1.agregarLibro(librofisico1);
        db1.agregarLibro(librofisico2);


        //Patron Abstract
        AbstractFactory adminFactory = new AdminFactory();
        InterfazUI adminUI = adminFactory.crearInterfaz();
        MetodoEnvio adminEnvio = adminFactory.crearMetodoEnvio();

        System.out.println("\nInterfaz:");
        adminUI.loguearse();
        System.out.println("\nMétodo de envío:");
        adminEnvio.tipoEnvio();

        AbstractFactory usuarioFactory = new UsuarioFactory();
        InterfazUI usuarioUI = usuarioFactory.crearInterfaz();
        MetodoEnvio usuarioEnvio = usuarioFactory.crearMetodoEnvio();;

        System.out.println("\nInterfaz:");
        usuarioUI.loguearse();
        System.out.println("\nMétodo de envío: ");
        usuarioEnvio.tipoEnvio();


        //Creacion de Usuarios
        Usuario usuario1 = Usuario.builder()
                .nombre("Pedro Perez")
                .fechaNacimiento("02/04/2003")
                .direccion("Calle Falsa 123")
                .email("pedroperez@hotmail.com")
                .telefono(261)
                .build();
        System.out.println("\nSe ha logueado el usuario: "+usuario1.getNombre()+ ", email: "+usuario1.getEmail());

        Usuario usuario2 = Usuario.builder()
                .nombre("Marta Gomez")
                .fechaNacimiento("23/05/97")
                .direccion("Calle Buena Nueva 990")
                .email("martagomez@hotmail.com")
                .telefono(261)
                .build();
        System.out.println("\nSe ha logueado el usuario: "+usuario2.getNombre()+ ", email: "+usuario2.getEmail());

        //Prestamo prototipo y clonable
        Prestamo prestamo = new Prestamo(librodigital1, usuario1, "01/01/2000", "01/02/2000");
        prestamo.mostrar();

        // extencion de prestamo
        Prestamo renovacionprestamo = (Prestamo) prestamo.clone();
        renovacionprestamo.setFechaFin("01/03/2000");

        // misma fecha y distint usuario
        Prestamo prestamo2 = (Prestamo) prestamo.clone();
        prestamo2.setUsuario(usuario2);
        prestamo2.mostrar();

    }
}