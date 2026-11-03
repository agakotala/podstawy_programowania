/*
 * PRZYKŁAD — PackageImportDemo
 * TEMAT 10: Pakiety, wyjątki i kolekcje
 *
 * CEL / OPIS:
 * Łączymy pojęcie pakietu i importu z rzeczywistą deklaracją klasy.
 *
 * WYNIK ZALEŻNY OD DATY:
 *   Najpierw dzisiejsza data według komputera w formacie RRRR-MM-DD, następnie: [Ada].
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
 * ŹRÓDŁO: materiał do tematu 10, Przykład 1. PackageImportDemo.
 */

package block10;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PackageImportDemo {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Ada");
        System.out.println(LocalDate.now());
        System.out.println(names);
    }
}
