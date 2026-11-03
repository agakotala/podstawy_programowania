/*
 * PRZYKŁAD — LiteralBases
 * TEMAT 02: Literały, typy danych i konwersje
 *
 * CEL / OPIS:
 * Porównujemy różne zapisy tej samej liczby. Prefiks literału wpływa na odczyt podczas
 * kompilacji, a nie na jego wartość matematyczną.
 *
 * RZECZYWISTY WYNIK (dla danych w kodzie):
 *   42 42 42 42
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
 * ŹRÓDŁO: materiał do tematu 02, Przykład 2. LiteralBases.
 */

package block2extra;

public class LiteralBases {
    public static void main(String[] args) {
        int decimal = 42;
        int binary = 0b101010;
        int octal = 052;
        int hex = 0x2A;
        System.out.println(decimal + " " + binary + " " + octal + " " + hex);
    }
}
