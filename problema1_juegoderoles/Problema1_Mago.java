package problema1_juegoderoles;

// LSP: Expande la clase base con comportamiento propio sin alterar el sistema.
public class Problema1_Mago extends Problema1_Personaje {
    public Problema1_Mago(String nombre) {
        super(nombre, 80);
    }

    @Override
    public void atacar() {
        System.out.println(nombre + " lanza un hechizo de fuego.");
    }
}