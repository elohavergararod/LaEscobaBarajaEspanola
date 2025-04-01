package juego;

import baraja.Carta;
import input.Input;
import jugador.Jugador;
import reglas.ReglasEscoba;

import java.util.ArrayList;
import java.util.List;

public class Juego {
    private Jugador jugador1;
    private Jugador jugador2;
    private List<Carta> mesa;
    private DistribucionCartas distribucion;

    public Juego(String nombre1, String nombre2) {
        jugador1 = new Jugador(nombre1);
        jugador2 = new Jugador(nombre2);
        mesa = new ArrayList<>();
        distribucion = new DistribucionCartas();
        iniciarJuego();
    }

    private void iniciarJuego() {
        distribucion.repartirCartas(jugador1, jugador2, mesa);
        System.out.println("Cartas en la mesa: " + mesa);
        jugarTurno(jugador1);
        jugarTurno(jugador2);
    }

    private void jugarTurno(Jugador jugador) {
        System.out.println("\n🔹 Turno de " + jugador.getNombre());
        System.out.println("🃏 Cartas en la mano: " + jugador.getMano().getCartas());
        System.out.println("🃏 Cartas en la mesa: " + mesa);

        if (jugador.getMano().getCartas().isEmpty()) {
            System.out.println("🚫 " + jugador.getNombre() + " no tiene cartas en la mano.");
            return;
        }

        int eleccion = Input.leerEntero("👉 Elige una carta para jugar (0-" + (jugador.getMano().getCartas().size() - 1) + "):", 0, jugador.getMano().getCartas().size() - 1);
        Carta cartaJugada = jugador.jugarCarta(eleccion);

        System.out.println("🃏 " + jugador.getNombre() + " ha jugado: " + cartaJugada);


        boolean captura = ReglasEscoba.verificarCaptura(jugador, cartaJugada, mesa);

        if (!captura) {
            mesa.add(cartaJugada);
            System.out.println("🔹 La carta " + cartaJugada + " se quedó en la mesa.");
        }
    }

}
