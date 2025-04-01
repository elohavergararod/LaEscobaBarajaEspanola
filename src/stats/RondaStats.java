package stats;

import jugador.Jugador;

public class RondaStats {
    private String nombre;
    private int escobas;
    private int puntos;

    public RondaStats(Jugador jugador) {
        this.nombre = jugador.getNombre();
        this.escobas = jugador.getPuntos();
        this.puntos = jugador.getPuntos();
    }
}
