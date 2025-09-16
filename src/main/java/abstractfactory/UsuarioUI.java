package main.java.abstractfactory;


import lombok.AllArgsConstructor;

@AllArgsConstructor
public class UsuarioUI implements InterfazUI{
    @Override
    public void loguearse() {
        System.out.println("Se ha creado un usuario.");
    }
}
