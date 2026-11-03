/*
 * PRZYKŁAD — Example05ArrayList
 * TEMAT 10: Pakiety, wyjątki i kolekcje
 *
 * CEL / OPIS:
 * Tworzymy listę, dodajemy imiona, usuwamy jedno i wyświetlamy pozostałe.
 *
 * RZECZYWISTY WYNIK (dla danych w kodzie):
 *   Ala
 *   Jan
 *
 * JAK PRACOWAĆ:
 * - Przeczytaj kod i przewidź jego działanie przed uruchomieniem.
 * - Następnie sprawdź wynik w IntelliJ i zmień jedną wartość wejściową.
 *
 * PYTANIA KONTROLNE:
 * 1. Kiedy wystąpi wyjątek i gdzie zostanie przechwycony?
 * 2. Jakiego typu są elementy kolekcji?
 * 3. Czy kolejność odczytu jest gwarantowana?
 *
 * ŹRÓDŁO: materiał do tematu 10, Przykład 6. Example05ArrayList.
 */

package block10;

import java.util.ArrayList;
import java.util.List;

public class Example05ArrayList {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Ala");
        names.add("Ola");
        names.add("Jan");
        names.remove("Ola");

        for (String name : names) {
            System.out.println(name);
        }
    }
}
