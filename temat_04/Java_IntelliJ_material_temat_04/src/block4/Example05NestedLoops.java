/*
 * PRZYKŁAD — Example05NestedLoops
 * TEMAT 04: Pętle i rekurencja
 *
 * CEL / OPIS:
 * Obserwujemy, jak pętla wewnętrzna zaczyna się od nowa dla kolejnych wartości licznika
 * zewnętrznego.
 *
 * RZECZYWISTY WYNIK (dla danych w kodzie):
 *   (1,1) (1,2) (1,3) (1,4)
 *   (2,1) (2,2) (2,3) (2,4)
 *   (3,1) (3,2) (3,3) (3,4)
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
 * ŹRÓDŁO: materiał do tematu 04, Przykład 5. Example05NestedLoops.
 */

package block4;

public class Example05NestedLoops {
    public static void main(String[] args) {
        for (int row = 1; row <= 3; row++) {
            for (int col = 1; col <= 4; col++) {
                System.out.print("(" + row + "," + col + ") ");
            }
            System.out.println();
        }
    }
}
