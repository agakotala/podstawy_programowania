/*
 * PRZYKŁAD — Example06HashSet
 * TEMAT 10: Pakiety, wyjątki i kolekcje
 *
 * CEL / OPIS:
 * Dodajemy elementy do zbioru, w którym nie powstają duplikaty.
 *
 * PRZYKŁADOWY WYNIK (KOLEJNOŚĆ NIEGWARANTOWANA):
 *   [algorytmy, java] — zbiór HashSet nie gwarantuje kolejności iteracji; może zostać wypisane [java, algorytmy].
 *
 * JAK PRACOWAĆ:
 * - Przeczytaj kod i przewidź jego działanie przed uruchomieniem.
 * - Następnie sprawdź wynik w IntelliJ i zmień jedną wartość wejściową.
 * - Kolejność elementów w HashSet / HashMap nie jest gwarantowana.
 *
 * PYTANIA KONTROLNE:
 * 1. Kiedy wystąpi wyjątek i gdzie zostanie przechwycony?
 * 2. Jakiego typu są elementy kolekcji?
 * 3. Czy kolejność odczytu jest gwarantowana?
 *
 * ŹRÓDŁO: materiał do tematu 10, Przykład 7. Example06HashSet.
 */

package block10;

import java.util.HashSet;
import java.util.Set;

public class Example06HashSet {
    public static void main(String[] args) {
        Set<String> tags = new HashSet<>();
        tags.add("java");
        tags.add("algorytmy");
        tags.add("java");
        System.out.println(tags);
    }
}
