/*
 * PRZYKŁAD — Example09FibonacciRecursive
 * TEMAT 04: Pętle i rekurencja
 *
 * CEL / OPIS:
 * Pokazujemy, że zwięzły zapis rekurencyjny może wykonywać wiele powtórzonych obliczeń.
 *
 * RZECZYWISTY WYNIK (dla danych w kodzie):
 *   55
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
 * ŹRÓDŁO: materiał do tematu 04, Przykład 9. Example09FibonacciRecursive.
 */

package block4;

public class Example09FibonacciRecursive {
    static long fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(10));
    }
}
