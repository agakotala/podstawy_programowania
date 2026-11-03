/*
 * PRZYKŁAD — Example06FactorialIterative
 * TEMAT 04: Pętle i rekurencja
 *
 * CEL / OPIS:
 * Obliczamy silnię w kolejnych powtórzeniach, mnożąc akumulator przez coraz większy
 * czynnik.
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
 * ŹRÓDŁO: materiał do tematu 04, Przykład 6. Example06FactorialIterative.
 */

package block4;

public class Example06FactorialIterative {
    public static void main(String[] args) {
        int n = 5;
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        System.out.println(result);
    }
}
