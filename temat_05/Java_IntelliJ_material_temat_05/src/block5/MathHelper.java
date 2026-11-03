/*
 * PRZYKŁAD — MathHelper
 * TEMAT 05: String, klasy, obiekty i metody
 *
 * CEL / OPIS:
 * Klasa MathHelper ilustruje kolejny praktyczny wariant pojęć opisanych w tym bloku.
 * Przyjrzyjmy się instrukcjom i powiązaniu wartości z wynikiem.
 *
 * JAK PRACOWAĆ:
 * - To klasa pomocnicza/model: może nie mieć własnej metody main.
 * - Przyjrzyj się polom, konstruktorom i metodom oraz użyj jej z innej klasy.
 *
 * PYTANIA KONTROLNE:
 * 1. Które dane należą do konkretnego obiektu?
 * 2. Czy metoda zmienia stan obiektu, czy zwraca wynik?
 * 3. Gdzie i dlaczego tworzymy instancję?
 *
 * ŹRÓDŁO: materiał do tematu 05, Przykład 8. MathHelper.
 */

package block5;

public class MathHelper {
    public int max(int a, int b) {
        return a > b ? a : b;
    }

    public double max(double a, double b) {
        return a > b ? a : b;
    }

    public int max(int a, int b, int c) {
        return max(max(a, b), c);
    }
}
