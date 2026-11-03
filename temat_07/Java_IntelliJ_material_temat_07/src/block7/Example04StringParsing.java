/*
 * PRZYKŁAD — Example04StringParsing
 * TEMAT 07: Math, Scanner, Random i pliki tekstowe
 *
 * CEL / OPIS:
 * Rozdzielamy jeden wiersz na pola i zamieniamy odpowiednie fragmenty tekstu na liczby.
 *
 * RZECZYWISTY WYNIK (dla danych w kodzie):
 *   Anna, wiek 21, średnia 4.75
 *
 * JAK PRACOWAĆ:
 * - Przeczytaj kod i przewidź jego działanie przed uruchomieniem.
 * - Następnie sprawdź wynik w IntelliJ i zmień jedną wartość wejściową.
 *
 * PYTANIA KONTROLNE:
 * 1. Jakie dane trafiają na wejście lub do pliku?
 * 2. Czy wynik jest zawsze taki sam?
 * 3. Jak zareagować na błędne dane albo brak pliku?
 *
 * ŹRÓDŁO: materiał do tematu 07, Przykład 4. Example04StringParsing.
 */

package block7;
import java.util.Locale;
public class Example04StringParsing {
    public static void main(String[] args) {
        String record = "Anna;21;4.75";
        String[] parts = record.split(";");
        String name = parts[0];
        int age = Integer.parseInt(parts[1]);
        double average = Double.parseDouble(parts[2]);
        System.out.printf(Locale.US, "%s, wiek %d, średnia %.2f%n",
                name, age, average);
    }
}
