package baraja;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Mazo {
    private List<Carta> cartas;
    private static final String[] PALOS = {"Oros", "Copas", "Espadas", "Bastos"};
    private static final String[] NOMBRES = {"As", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete", "Sota", "Caballo", "Rey"};
    private static final int[] VALORES = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    public Mazo() {
        cartas = new ArrayList<>();
        for (String palo : PALOS) {
            for (int i = 0; i < NOMBRES.length; i++) {
                cartas.add(new Carta(palo, VALORES[i], NOMBRES[i]));
            }
        }
        Collections.shuffle(cartas);
    }

    public Carta repartirCarta() {
        return cartas.isEmpty() ? null : cartas.remove(0);
    }

    public List<Carta> repartirMano(int cantidad) {
        List<Carta> mano = new ArrayList<>();
        for (int i = 0; i < cantidad; i++) {
            mano.add(repartirCarta());
        }
        return mano;
    }
}
