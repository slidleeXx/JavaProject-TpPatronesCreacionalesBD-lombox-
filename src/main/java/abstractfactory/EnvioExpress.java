package main.java.abstractfactory;
import lombok.NoArgsConstructor;

public class EnvioExpress implements MetodoEnvio{
    @Override
    public void tipoEnvio() {
            System.out.println("Se realiza envio express");
    }
}
