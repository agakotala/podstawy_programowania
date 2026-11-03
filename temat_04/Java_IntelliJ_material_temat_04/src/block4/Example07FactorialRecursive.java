/*
 * PRZYKŁAD — Example07FactorialRecursive
 * TEMAT 04: Pętle i rekurencja
 *
 * CEL / OPIS:
 * Porównujemy obliczenie silni przez samowywołującą się metodę i przypadek bazowy.
 *
 * RZECZYWISTY WYNIK (dla danych w kodzie):
 *   120
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
 * ŹRÓDŁO: materiał do tematu 04, Przykład 7. Example07FactorialRecursive.
 */

package block4;

public class Example07FactorialRecursive {
    static long factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}
