package juego;

import baraja.Carta;
import java.util.ArrayList;
import java.util.List;

public class Mano {
    private List<Carta> cartas;

    public Mano() {
        this.cartas = new ArrayList<>();
    }


    public void agregarCarta(Carta carta) {
        cartas.add(carta);
    }


    public Carta jugarCarta(int indice) {
        if (indice >= 0 && indice < cartas.size()) {
            return cartas.remove(indice);
        } else {
            throw new IndexOutOfBoundsException("Índice fuera de rango. Elige una carta válida.");
        }
    }


    public List<Carta> getCartas() {
        return cartas;
    }


    @Override
    public String toString() {
        return cartas.toString();
    }
}
