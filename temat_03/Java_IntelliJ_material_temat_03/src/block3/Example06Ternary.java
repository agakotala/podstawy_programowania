/*
 * PRZYKŁAD — Example06Ternary
 * TEMAT 03: Porównania, warunki, if i switch
 *
 * CEL / OPIS:
 * Używamy operatora ?: do wyboru jednej z dwóch wartości bez rozbudowanego bloku if.
 *
 * RZECZYWISTY WYNIK (dla danych w kodzie):
 *   niepełnoletni
 *
 * JAK PRACOWAĆ:
 * - Przeczytaj kod i przewidź jego działanie przed uruchomieniem.
 * - Następnie sprawdź wynik w IntelliJ i zmień jedną wartość wejściową.
 *
 * PYTANIA KONTROLNE:
 * 1. Który warunek jest sprawdzany jako pierwszy?
 * 2. Co się stanie dla wartości granicznej?
 * 3. Czy wszystkie gałęzie warunku mogą być wykonane?
 *
 * ŹRÓDŁO: materiał do tematu 03, Przykład 6. Example06Ternary.
 */

package block3;

public class Example06Ternary {
    public static void main(String[] args) {
        int age = 17;
        String status = age >= 18 ? "pełnoletni" : "niepełnoletni";
        System.out.println(status);
    }
}
