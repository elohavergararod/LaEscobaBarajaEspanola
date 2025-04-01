package jugador;

import baraja.Carta;
import juego.Mano;

import java.util.List;

public class Jugador {
    private String nombre;
    private Mano mano;
    private int puntos;
    private int escobas;

    public Jugador(String nombre) {
        this.nombre = nombre;
        this.mano = new Mano();
        this.puntos = 0;
        this.escobas = 0;
    }

    public void recibirCartas(List<Carta> cartas) {
        for (Carta carta : cartas) {
            mano.agregarCarta(carta);
        }
    }

    public Carta jugarCarta(int indice) {
        return mano.jugarCarta(indice);
    }

    public String getNombre() {
        return nombre;
    }

    public int getPuntos() {
        return puntos;
    }

    public void sumarPuntos(int puntos) {
        this.puntos += puntos;
    }

    public void sumarEscoba() {
        this.escobas++;
    }

    public Mano getMano() {
        return mano;
    }
}
