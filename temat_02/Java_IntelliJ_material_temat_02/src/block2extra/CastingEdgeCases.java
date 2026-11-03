/*
 * PRZYKŁAD — CastingEdgeCases
 * TEMAT 02: Literały, typy danych i konwersje
 *
 * CEL / OPIS:
 * Badamy wartości graniczne i przypadki, w których niewłaściwa konwersja prowadzi do
 * nieoczekiwanego wyniku.
 *
 * RZECZYWISTY WYNIK (dla danych w kodzie):
 *   123
 *   -126
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
 * ŹRÓDŁO: materiał do tematu 02, Przykład 6. CastingEdgeCases.
 */

package block2extra;

public class CastingEdgeCases {
    public static void main(String[] args) {
        double x = 123.99;
        int truncated = (int) x;
        int large = 130;
        byte wrapped = (byte) large;
        System.out.println(truncated);
        System.out.println(wrapped);
    }
}
