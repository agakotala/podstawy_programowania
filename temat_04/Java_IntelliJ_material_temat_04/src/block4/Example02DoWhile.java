/*
 * PRZYKŁAD — Example02DoWhile
 * TEMAT 04: Pętle i rekurencja
 *
 * CEL / OPIS:
 * Sprawdzamy, dlaczego do-while wykona blok co najmniej raz.
 *
 * RZECZYWISTY WYNIK (dla danych w kodzie):
 *   Wartość: 10
 *
 * JAK PRACOWAĆ:
 * - Przeczytaj kod i przewidź jego działanie przed uruchomieniem.
 * - Następnie sprawdź wynik w IntelliJ i zmień jedną wartość wejściową.
 *
 * PYTANIA KONTROLNE:
 * 1. Ile razy wykona się pętla?
 * 2. Która instrukcja odpowiada za zakończenie?
 * 3. Co zmieni się po zmianie warunku?
 *
 * ŹRÓDŁO: materiał do tematu 04, Przykład 2. Example02DoWhile.
 */

package block4;

public class Example02DoWhile {
    public static void main(String[] args) {
        int value = 10;
        do {
            System.out.println("Wartość: " + value);
            value++;
        } while (value < 10);
    }
}
