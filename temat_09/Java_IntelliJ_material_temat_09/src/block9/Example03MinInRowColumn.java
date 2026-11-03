/*
 * PRZYKŁAD — Example03MinInRowColumn
 * TEMAT 09: Algorytmy, minimum i sortowanie
 *
 * CEL / OPIS:
 * Wyszukujemy najmniejszą wartość w wybranym wierszu lub kolumnie macierzy.
 *
 * RZECZYWISTY WYNIK (dla danych w kodzie):
 *   Min w wierszu: 1
 *   Min w kolumnie: 2
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
 * ŹRÓDŁO: materiał do tematu 09, Przykład 3. Example03MinInRowColumn.
 */

package block9;

public class Example03MinInRowColumn {
    public static void main(String[] args) {
        int[][] matrix = {
                {8, 3, 7},
                {4, 9, 1},
                {6, 2, 5}
        };

        int selectedRow = 1;
        int minRow = matrix[selectedRow][0];
        for (int col = 1; col < matrix[selectedRow].length; col++) {
            if (matrix[selectedRow][col] < minRow) minRow = matrix[selectedRow][col];
        }

        int selectedCol = 1;
        int minCol = matrix[0][selectedCol];
        for (int row = 1; row < matrix.length; row++) {
            if (matrix[row][selectedCol] < minCol) minCol = matrix[row][selectedCol];
        }

        System.out.println("Min w wierszu: " + minRow);
        System.out.println("Min w kolumnie: " + minCol);
    }
}
