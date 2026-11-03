/*
 * PRZYKŁAD — Example04MatrixTraversal
 * TEMAT 08: Tablice jedno- i dwuwymiarowe
 *
 * CEL / OPIS:
 * Dwie pętle odwiedzają każdy element macierzy dokładnie w kolejności wyznaczonej przez
 * liczniki.
 *
 * RZECZYWISTY WYNIK (dla danych w kodzie):
 *   2 4 6
 *   1 3 5
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
 * ŹRÓDŁO: materiał do tematu 08, Przykład 4. Example04MatrixTraversal.
 */

package block8;

public class Example04MatrixTraversal {
    public static void main(String[] args) {
        int[][] matrix = {
                {2, 4, 6},
                {1, 3, 5}
        };

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }
}
