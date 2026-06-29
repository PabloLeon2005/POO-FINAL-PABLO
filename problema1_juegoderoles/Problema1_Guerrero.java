package problema1_juegoderoles;

// LSP (Liskov Substitution Principle): Un Guerrero puede usarse en cualquier lugar donde se espere un Personaje genérico.
public class Problema1_Guerrero extends Problema1_Personaje {
    public Problema1_Guerrero(String nombre) {
        super(nombre, 150);
    }

    @Override
    public void atacar() {
        System.out.println(nombre + " ataca cuerpo a cuerpo con furia.");
    }
}