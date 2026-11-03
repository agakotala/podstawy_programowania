/*
 * PRZYKŁAD — Example03For
 * TEMAT 04: Pętle i rekurencja
 *
 * CEL / OPIS:
 * Prześledzimy, jak rośnie licznik i kiedy pętla for kończy działanie.
 *
 * RZECZYWISTY WYNIK (dla danych w kodzie):
 *   Iteracja 1
 *   Iteracja 2
 *   Iteracja 3
 *   Iteracja 4
 *   Iteracja 5
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
 * ŹRÓDŁO: materiał do tematu 04, Przykład 3. Example03For.
 */

package block4;

public class Example03For {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Iteracja " + i);
        }
    }
}
