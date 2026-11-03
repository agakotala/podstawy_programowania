/*
 * PRZYKŁAD — Example01While
 * TEMAT 04: Pętle i rekurencja
 *
 * CEL / OPIS:
 * Oglądamy pętlę, w której warunek jest sprawdzany przed każdą iteracją.
 *
 * RZECZYWISTY WYNIK (dla danych w kodzie):
 *   1
 *   2
 *   3
 *   4
 *   5
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
 * ŹRÓDŁO: materiał do tematu 04, Przykład 1. Example01While.
 */

package block4;

public class Example01While {
    public static void main(String[] args) {
        int number = 1;
        while (number <= 5) {
            System.out.println(number);
            number++;
        }
    }
}
