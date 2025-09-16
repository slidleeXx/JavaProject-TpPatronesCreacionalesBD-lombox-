package main.java.abstractfactory;

public class UsuarioFactory implements AbstractFactory{
    @Override
    public InterfazUI crearInterfaz() {
        return new UsuarioUI();
    }

    @Override
    public MetodoEnvio crearMetodoEnvio() {
        return new EnvioNormal();
    }

}
