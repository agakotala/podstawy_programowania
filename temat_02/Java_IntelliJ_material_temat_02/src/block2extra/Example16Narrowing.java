/*
 * PRZYKŁAD — Example16Narrowing
 * TEMAT 02: Literały, typy danych i konwersje
 *
 * CEL / OPIS:
 * Analizujemy dwie możliwe utraty informacji: usunięcie części ułamkowej oraz zmianę
 * wartości po zawężeniu do byte.
 *
 * RZECZYWISTY WYNIK (dla danych w kodzie):
 *   double -> int: 19
 *   int 130 -> byte: -126
 *
 * JAK PRACOWAĆ:
 * - Przeczytaj kod i przewidź jego działanie przed uruchomieniem.
 * - Następnie sprawdź wynik w IntelliJ i zmień jedną wartość wejściową.
 *
 * PYTANIA KONTROLNE:
 * 1. Które wartości mają typ int, long, float lub double?
 * 2. Czy konwersja może prowadzić do utraty dokładności?
 * 3. Jaki wynik zmieni się po rzutowaniu?
 *
 * ŹRÓDŁO: materiał do tematu 02, Przykład 4. Example16Narrowing.
 */

package block2extra;

public class Example16Narrowing {
    public static void main(String[] args) {
        double price = 19.99;
        int whole = (int) price;

        int value = 130;
        byte small = (byte) value;

        System.out.println("double -> int: " + whole);
        System.out.println("int 130 -> byte: " + small);
    }
}
