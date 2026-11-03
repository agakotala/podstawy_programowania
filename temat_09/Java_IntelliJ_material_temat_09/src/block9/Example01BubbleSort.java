/*
 * PRZYKŁAD — Example01BubbleSort
 * TEMAT 09: Algorytmy, minimum i sortowanie
 *
 * CEL / OPIS:
 * Sortujemy przez wielokrotne porównywanie sąsiednich elementów i ich zamianę.
 *
 * RZECZYWISTY WYNIK (dla danych w kodzie):
 *   [1, 2, 4, 5, 8]
 *
 * JAK PRACOWAĆ:
 * - Przeczytaj kod i przewidź jego działanie przed uruchomieniem.
 * - Następnie sprawdź wynik w IntelliJ i zmień jedną wartość wejściową.
 *
 * PYTANIA KONTROLNE:
 * 1. Które elementy są porównywane?
 * 2. Ile iteracji jest potrzebnych?
 * 3. Co zmienia porządek rosnący na malejący?
 *
 * ŹRÓDŁO: materiał do tematu 09, Przykład 1. Example01BubbleSort.
 */

package block9;

import java.util.Arrays;

public class Example01BubbleSort {
    public static void main(String[] args) {
        int[] a = {5, 1, 4, 2, 8};

        for (int end = a.length - 1; end > 0; end--) {
            boolean swapped = false;
            for (int i = 0; i < end; i++) {
                if (a[i] > a[i + 1]) {
                    int temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }

        System.out.println(Arrays.toString(a));
    }
}
