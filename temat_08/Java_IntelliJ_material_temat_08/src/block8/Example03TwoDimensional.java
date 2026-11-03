/*
 * PRZYKŁAD — Example03TwoDimensional
 * TEMAT 08: Tablice jedno- i dwuwymiarowe
 *
 * CEL / OPIS:
 * Odczytujemy elementy tablicy dwuwymiarowej za pomocą indeksów wiersza i kolumny.
 *
 * RZECZYWISTY WYNIK (dla danych w kodzie):
 *   6
 *   100
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
 * ŹRÓDŁO: materiał do tematu 08, Przykład 3. Example03TwoDimensional.
 */

package block8;

public class Example03TwoDimensional {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println(matrix[1][2]); // 6
        matrix[0][0] = 100;
        System.out.println(matrix[0][0]);
    }
}
