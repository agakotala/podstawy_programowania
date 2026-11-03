/*
 * PRZYKŁAD — Example04IfElseChain
 * TEMAT 03: Porównania, warunki, if i switch
 *
 * CEL / OPIS:
 * Przypisujemy wynikowi punktowemu jedną z kategorii. O wyniku decyduje pierwszy
 * prawdziwy warunek.
 *
 * RZECZYWISTY WYNIK (dla danych w kodzie):
 *   Ocena 4
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
 * ŹRÓDŁO: materiał do tematu 03, Przykład 4. Example04IfElseChain.
 */

package block3;

public class Example04IfElseChain {
    public static void main(String[] args) {
        int score = 82;

        if (score >= 90) {
            System.out.println("Ocena 5");
        } else if (score >= 75) {
            System.out.println("Ocena 4");
        } else if (score >= 60) {
            System.out.println("Ocena 3");
        } else {
            System.out.println("Brak zaliczenia");
        }
    }
}
