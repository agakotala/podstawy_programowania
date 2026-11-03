/*
 * PRZYKŁAD — Example06FileRead
 * TEMAT 07: Math, Scanner, Random i pliki tekstowe
 *
 * CEL / OPIS:
 * Odczytujemy plik utworzony w przykładzie 5. Najpierw uruchom Example05FileWrite, aby
 * powstał plik data/output.txt.
 *
 * WYNIK PO URUCHOMIENIU Example05FileWrite:
 *   Liczba wierszy: 3 | > Java | > Pliki | > Tekst. Jeśli plik nie istnieje, wystąpi IOException.
 *
 * JAK PRACOWAĆ:
 * - Najpierw uruchom Example05FileWrite, aby utworzyć data/output.txt.
 * - W IntelliJ katalog roboczy powinien wskazywać folder tego projektu.
 *
 * PYTANIA KONTROLNE:
 * 1. Jakie dane trafiają na wejście lub do pliku?
 * 2. Czy wynik jest zawsze taki sam?
 * 3. Jak zareagować na błędne dane albo brak pliku?
 *
 * ŹRÓDŁO: materiał do tematu 07, Przykład 6. Example06FileRead.
 */

package block7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Example06FileRead {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("data", "output.txt");
        List<String> lines = Files.readAllLines(path);

        System.out.println("Liczba wierszy: " + lines.size());
        for (int i = 0; i < lines.size(); i++) {
            System.out.println("> " + lines.get(i));
        }
    }
}
