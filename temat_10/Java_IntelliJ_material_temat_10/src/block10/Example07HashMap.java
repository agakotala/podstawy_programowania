/*
 * PRZYKŁAD — Example07HashMap
 * TEMAT 10: Pakiety, wyjątki i kolekcje
 *
 * CEL / OPIS:
 * Przechowujemy wartości pod kluczami i odczytujemy je na podstawie nazwy klucza.
 *
 * PRZYKŁADOWY WYNIK (KOLEJNOŚĆ NIEGWARANTOWANA):
 *   12 | {Jan=7, Anna=12}. W mapie HashMap kolejność par może być inna.
 *
 * JAK PRACOWAĆ:
 * - Przeczytaj kod i przewidź jego działanie przed uruchomieniem.
 * - Następnie sprawdź wynik w IntelliJ i zmień jedną wartość wejściową.
 * - Kolejność elementów w HashSet / HashMap nie jest gwarantowana.
 *
 * PYTANIA KONTROLNE:
 * 1. Kiedy wystąpi wyjątek i gdzie zostanie przechwycony?
 * 2. Jakiego typu są elementy kolekcji?
 * 3. Czy kolejność odczytu jest gwarantowana?
 *
 * ŹRÓDŁO: materiał do tematu 10, Przykład 8. Example07HashMap.
 */

package block10;

import java.util.HashMap;
import java.util.Map;

public class Example07HashMap {
    public static void main(String[] args) {
        Map<String, Integer> points = new HashMap<>();
        points.put("Anna", 10);
        points.put("Jan", 7);
        points.put("Anna", 12);

        System.out.println(points.get("Anna"));
        System.out.println(points);
    }
}
