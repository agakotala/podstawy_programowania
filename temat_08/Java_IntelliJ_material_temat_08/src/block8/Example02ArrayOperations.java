/*
 * PRZYKŁAD — Example02ArrayOperations
 * TEMAT 08: Tablice jedno- i dwuwymiarowe
 *
 * CEL / OPIS:
 * Przechodzimy przez elementy tablicy i wykonujemy na nich kolejne działania.
 *
 * RZECZYWISTY WYNIK (dla danych w kodzie):
 *   Suma: 23
 *   Min: 1, max: 9
 *   Oryginał: [7, 2, 9, 4, 1]
 *   Kopia posortowana: [1, 2, 4, 7, 9]
 *
 * JAK PRACOWAĆ:
 * - Przeczytaj kod i przewidź jego działanie przed uruchomieniem.
 * - Następnie sprawdź wynik w IntelliJ i zmień jedną wartość wejściową.
 *
 * PYTANIA KONTROLNE:
 * 1. Od jakiego indeksu zaczynamy?
 * 2. Jak uniknąć wyjścia poza zakres tablicy?
 * 3. Ile elementów i wierszy przetwarzamy?
 *
 * ŹRÓDŁO: materiał do tematu 08, Przykład 2. Example02ArrayOperations.
 */

package block8;

import java.util.Arrays;

public class Example02ArrayOperations {
    public static void main(String[] args) {
        int[] numbers = {7, 2, 9, 4, 1};
        int sum = 0;
        int min = numbers[0];
        int max = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            sum += number;
            if (number < min) min = number;
            if (number > max) max = number;
        }

        int[] copy = Arrays.copyOf(numbers, numbers.length);
        Arrays.sort(copy);

        System.out.println("Suma: " + sum);
        System.out.println("Min: " + min + ", max: " + max);
        System.out.println("Oryginał: " + Arrays.toString(numbers));
        System.out.println("Kopia posortowana: " + Arrays.toString(copy));
    }
}
