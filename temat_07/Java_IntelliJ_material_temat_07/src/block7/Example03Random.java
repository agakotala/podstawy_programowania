/*
 * PRZYKŁAD — Example03Random
 * TEMAT 07: Math, Scanner, Random i pliki tekstowe
 *
 * CEL / OPIS:
 * Tworzymy generator pseudolosowy. Przy analizie pamiętajmy o granicy wyłącznej w
 * nextInt.
 *
 * WYNIK LOSOWY:
 *   Kostka: liczba z zakresu 1–6; Moneta: orzeł albo reszka. Nie ma jednego stałego wyniku.
 *
 * JAK PRACOWAĆ:
 * - Przeczytaj kod i przewidź jego działanie przed uruchomieniem.
 * - Następnie sprawdź wynik w IntelliJ i zmień jedną wartość wejściową.
 *
 * PYTANIA KONTROLNE:
 * 1. Jakie dane trafiają na wejście lub do pliku?
 * 2. Czy wynik jest zawsze taki sam?
 * 3. Jak zareagować na błędne dane albo brak pliku?
 *
 * ŹRÓDŁO: materiał do tematu 07, Przykład 3. Example03Random.
 */

package block7;

import java.util.Random;

public class Example03Random {
    public static void main(String[] args) {
        Random random = new Random();
        int die = random.nextInt(6) + 1;
        boolean coin = random.nextBoolean();

        System.out.println("Kostka: " + die);
        System.out.println("Moneta: " + (coin ? "orzeł" : "reszka"));
    }
}
