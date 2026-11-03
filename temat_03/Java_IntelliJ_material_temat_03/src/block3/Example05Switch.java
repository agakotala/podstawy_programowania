/*
 * PRZYKŁAD — Example05Switch
 * TEMAT 03: Porównania, warunki, if i switch
 *
 * CEL / OPIS:
 * Wybieramy komunikat na podstawie jednej wartości przy użyciu instrukcji switch.
 *
 * RZECZYWISTY WYNIK (dla danych w kodzie):
 *   środa
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
 * ŹRÓDŁO: materiał do tematu 03, Przykład 5. Example05Switch.
 */

package block3;

public class Example05Switch {
    public static void main(String[] args) {
        int day = 3;

        String name = switch (day) {
            case 1 -> "poniedziałek";
            case 2 -> "wtorek";
            case 3 -> "środa";
            case 4 -> "czwartek";
            case 5 -> "piątek";
            case 6, 7 -> "weekend";
            default -> "niepoprawny numer";
        };

        System.out.println(name);
    }
}
