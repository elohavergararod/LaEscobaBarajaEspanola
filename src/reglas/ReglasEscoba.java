package reglas;

import baraja.Carta;
import jugador.Jugador;

import java.util.ArrayList;
import java.util.List;

public class ReglasEscoba {

    public static boolean verificarCaptura(Jugador jugador, Carta cartaJugada, List<Carta> mesa) {
        List<Carta> cartasCapturadas = encontrarCombinacion(mesa, 15 - cartaJugada.getValor());

        if (!cartasCapturadas.isEmpty()) {
            cartasCapturadas.add(cartaJugada);
            mesa.removeAll(cartasCapturadas);
            System.out.println("✅ " + jugador.getNombre() + " capturó: " + cartasCapturadas);
            jugador.sumarPuntos(1);

            if (mesa.isEmpty()) {
                System.out.println("🎉 ¡Escoba de " + jugador.getNombre() + "! 🎉");
                jugador.sumarEscoba();
                jugador.sumarPuntos(1);
            }
            return true;
        }
        return false;
    }

    private static List<Carta> encontrarCombinacion(List<Carta> mesa, int objetivo) {
        List<Carta> resultado = new ArrayList<>();
        encontrarCombinacionRecursiva(mesa, objetivo, new ArrayList<>(), resultado);
        return resultado;
    }

    private static void encontrarCombinacionRecursiva(List<Carta> mesa, int objetivo, List<Carta> temp, List<Carta> resultado) {
        int suma = temp.stream().mapToInt(Carta::getValor).sum();
        if (suma == objetivo && resultado.isEmpty()) {
            resultado.addAll(temp);
            return;
        }
        if (suma >= objetivo) return;

        for (Carta carta : mesa) {
            if (!temp.contains(carta)) {
                List<Carta> nuevaLista = new ArrayList<>(temp);
                nuevaLista.add(carta);
                encontrarCombinacionRecursiva(mesa, objetivo, nuevaLista, resultado);
            }
        }
    }
}
