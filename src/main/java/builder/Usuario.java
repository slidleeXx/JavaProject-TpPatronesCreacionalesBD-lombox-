package main.java.builder;

import lombok.*;


@RequiredArgsConstructor
@Builder
@Getter

public class Usuario implements Cloneable {
    @NonNull
    private final String nombre;

    private final String direccion;
    private final String email;
    @NonNull
    private final String fechaNacimiento;
    private final float telefono;


    // Prototype 
    @Override
    public Usuario clone (){

        try {
            return (Usuario) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }


}
