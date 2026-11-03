/*
 * PRZYKŁAD — Example17NumericPromotion
 * TEMAT 02: Literały, typy danych i konwersje
 *
 * CEL / OPIS:
 * Sprawdzamy, kiedy typ składników zmienia rodzaj wykonanego działania i dlaczego typ
 * wyniku po lewej stronie nie wystarcza.
 *
 * RZECZYWISTY WYNIK (dla danych w kodzie):
 *   30
 *   13.5
 *   66 -> B
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
 * ŹRÓDŁO: materiał do tematu 02, Przykład 5. Example17NumericPromotion.
 */

package block2extra;

public class Example17NumericPromotion {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 20;
        int sum = a + b; // wynik nie jest byte, tylko int

        int count = 3;
        double price = 4.5;
        double total = count * price;

        char letter = 'A';
        int nextCode = letter + 1;

        System.out.println(sum);
        System.out.println(total);
        System.out.println(nextCode + " -> " + (char) nextCode);
    }
}
