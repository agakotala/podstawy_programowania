/*
 * PRZYKŁAD — Example02InsertionSort
 * TEMAT 09: Algorytmy, minimum i sortowanie
 *
 * CEL / OPIS:
 * Wstawiamy kolejne elementy w odpowiednie miejsce już posortowanego fragmentu.
 *
 * RZECZYWISTY WYNIK (dla danych w kodzie):
 *   [1, 2, 3, 5, 7, 9]
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
 * ŹRÓDŁO: materiał do tematu 09, Przykład 2. Example02InsertionSort.
 */

package block9;

import java.util.Arrays;

public class Example02InsertionSort {
    public static void main(String[] args) {
        int[] a = {7, 3, 5, 2, 9, 1};

        for (int i = 1; i < a.length; i++) {
            int key = a[i];
            int j = i - 1;

            while (j >= 0 && a[j] > key) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = key;
        }

        System.out.println(Arrays.toString(a));
    }
}
