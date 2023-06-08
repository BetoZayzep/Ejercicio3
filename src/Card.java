public class Card {
    private final String palo;   // El palo de la carta (tréboles, corazones, picas, diamantes)
    private final String color;  // El color de la carta (rojo, negro)
    private final String valor;  // El valor de la carta (2, 3, 4, ..., 10, A, J, Q, K)

    public Card(String palo, String color, String valor) {
        this.palo = palo;
        this.color = color;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return palo + "," + color + "," + valor;  // Representación de la carta en formato "palo,color,valor"
    }
}
