/*
 * PRZYKŁAD — Example03If
 * TEMAT 03: Porównania, warunki, if i switch
 *
 * CEL / OPIS:
 * Wykonujemy blok instrukcji tylko wtedy, gdy podany warunek jest prawdziwy.
 *
 * RZECZYWISTY WYNIK (dla danych w kodzie):
 *   Uwaga: mróz
 *   Koniec programu
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
 * ŹRÓDŁO: materiał do tematu 03, Przykład 3. Example03If.
 */

package block3;

public class Example03If {
    public static void main(String[] args) {
        int temperature = -2;

        if (temperature < 0) {
            System.out.println("Uwaga: mróz");
        }

        System.out.println("Koniec programu");
    }
}
