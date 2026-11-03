/*
 * PRZYKŁAD — Example04Complexity
 * TEMAT 09: Algorytmy, minimum i sortowanie
 *
 * CEL / OPIS:
 * Liczymy kroki jednej pętli i dwóch pętli zagnieżdżonych. To konkretny sposób
 * zrozumienia różnicy O(n) i O(n²).
 *
 * RZECZYWISTY WYNIK (dla danych w kodzie):
 *   O(n) kroki: 100
 *   O(n^2) kroki: 10000
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
 * ŹRÓDŁO: materiał do tematu 09, Przykład 4. Example04Complexity.
 */

package block9;

public class Example04Complexity {
    public static void main(String[] args) {
        int n = 100;
        long linearSteps = 0;
        long quadraticSteps = 0;

        for (int i = 0; i < n; i++) {
            linearSteps++;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                quadraticSteps++;
            }
        }

        System.out.println("O(n) kroki: " + linearSteps);
        System.out.println("O(n^2) kroki: " + quadraticSteps);
    }
}
