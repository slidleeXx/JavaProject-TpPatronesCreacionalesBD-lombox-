package main.java.abstractfactory;

public class AdminFactory implements AbstractFactory{
    @Override
    public InterfazUI crearInterfaz() {
        return new AdminUI();
    }

    @Override
    public MetodoEnvio crearMetodoEnvio() {
        return new EnvioExpress();
    }
}
