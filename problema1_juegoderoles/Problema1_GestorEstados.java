package problema1_juegoderoles;

import java.util.ArrayList;
import java.util.List;

// SRP: Responsabilidad única de almacenar y aplicar estados alterados a un personaje.
public class Problema1_GestorEstados {
    private List<Problema1_IEstadoAlterado> estados = new ArrayList<>();

    public void agregarEstado(Problema1_IEstadoAlterado estado) {
        estados.add(estado);
    }

    public void aplicarEstados(Problema1_Personaje personaje) {
        for (Problema1_IEstadoAlterado estado : estados) {
            estado.aplicarEfecto(personaje);
        }
    }
}