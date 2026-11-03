/*
 * PRZYKŁAD — Example04BreakContinue
 * TEMAT 04: Pętle i rekurencja
 *
 * CEL / OPIS:
 * Na konkretnych liczbach porównujemy zakończenie całej pętli z pominięciem tylko jednej
 * iteracji.
 *
 * RZECZYWISTY WYNIK (dla danych w kodzie):
 *   1
 *   2
 *   4
 *   5
 *   6
 *   7
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
 * ŹRÓDŁO: materiał do tematu 04, Przykład 4. Example04BreakContinue.
 */

package block4;

public class Example04BreakContinue {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 3) {
                continue;
            }
            if (i == 8) {
                break;
            }
            System.out.println(i);
        }
    }
}
