package juego;

import baraja.Carta;
import baraja.Mazo;
import jugador.Jugador;

import java.util.List;

public class DistribucionCartas {
    private Mazo mazo;

    public DistribucionCartas() {
        mazo = new Mazo();
    }

    public void repartirCartas(Jugador jugador1, Jugador jugador2, List<Carta> mesa) {
        jugador1.recibirCartas(mazo.repartirMano(3));
        jugador2.recibirCartas(mazo.repartirMano(3));
        mesa.addAll(mazo.repartirMano(4));
    }
}
