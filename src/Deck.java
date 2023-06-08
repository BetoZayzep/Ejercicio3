import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private static final String[] PALOS = {"tréboles", "corazones", "picas", "diamantes"};  // Los palos posibles en un mazo de cartas
    private static final String[] COLORES = {"rojo", "negro"};  // Los colores posibles de las cartas
    private static final String[] VALORES = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "A", "J", "Q", "K"};  // Los valores posibles de las cartas

    private final List<Card> cards;  // La lista de cartas en el mazo

    public Deck() {
        cards = new ArrayList<>();  // Inicializa la lista de cartas
        initializeDeck();  // Inicializa el mazo con todas las cartas
    }

    private void initializeDeck() {
        for (String palo : PALOS) {
            for (String color : COLORES) {
                for (String valor : VALORES) {
                    cards.add(new Card(palo, color, valor));  // Crea una nueva carta y la agrega al mazo
                }
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(cards);  // Mezcla las cartas en el mazo de forma aleatoria
        System.out.println("Se mezcló el Deck.");
    }

    public void drawCardFromTop() {
        if (cards.size() > 0) {
            Card card = cards.remove(0);  // Extrae la primera carta del mazo
            System.out.println(card);  // Imprime la carta extraída
            System.out.println("Quedan " + cards.size() + " cartas en el deck.");
        } else {
            System.out.println("El deck está vacío.");
        }
    }

    public void drawRandomCard() {
        if (cards.size() > 0) {
            int randomIndex = (int) (Math.random() * cards.size());  // Genera un índice aleatorio dentro del rango de cartas disponibles
            Card card = cards.remove(randomIndex);  // Extrae una carta aleatoria del mazo
            System.out.println(card);  // Imprime la carta extraída
            System.out.println("Quedan " + cards.size() + " cartas en el deck.");
        } else {
            System.out.println("El deck está vacío.");
        }
    }

    public void drawHand() {
        if (cards.size() >= 5) {
            for (int i = 0; i < 5; i++) {
                Card card = cards.remove(0);  // Extrae una carta del mazo y la agrega a la mano
                System.out.println(card);  // Imprime la carta extraída
            }
            System.out.println("Quedan " + cards.size() + " cartas en el deck.");
        } else {
            System.out.println("No hay suficientes cartas en el deck para repartir una mano.");
        }
    }
}
