public class Main {
    public static void main(String[] args) {
        Deck deck = new Deck();  // Crea un nuevo mazo de cartas

        deck.shuffle();  // Mezcla el mazo de cartas
        System.out.println();

        deck.drawCardFromTop();  // Extrae la primera carta del mazo y la muestra
        System.out.println();

        deck.drawRandomCard();  // Extrae una carta aleatoria del mazo y la muestra
        System.out.println();

        deck.drawHand();  // Extrae una mano de 5 cartas del mazo y las muestra
    }
}
