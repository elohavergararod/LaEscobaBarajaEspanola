package baraja;

public class Carta {
    private String palo;
    private int valor;
    private String nombre;

    public Carta(String palo, int valor, String nombre) {
        this.palo = palo;
        this.valor = valor;
        this.nombre = nombre;
    }

    public String getPalo() {
        return palo;
    }

    public int getValor() {
        return valor;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return nombre + " de " + palo + " (" + valor + ")";
    }
}
