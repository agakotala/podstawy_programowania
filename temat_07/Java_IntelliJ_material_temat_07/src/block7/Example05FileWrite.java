/*
 * PRZYKŁAD — Example05FileWrite
 * TEMAT 07: Math, Scanner, Random i pliki tekstowe
 *
 * CEL / OPIS:
 * Wykonujemy zapis danych do pliku. Ważne jest ustalenie ścieżki i sposobu obsługi
 * problemów z zapisem.
 *
 * WYNIK ZALEŻNY OD KATALOGU ROBOCZEGO:
 *   Program tworzy plik data/output.txt i wyświetla ścieżkę do niego; pełna ścieżka zależy od katalogu projektu.
 *
 * JAK PRACOWAĆ:
 * - Uruchom zapis, a następnie Example06FileRead.
 * - Sprawdź plik data/output.txt w katalogu projektu.
 *
 * PYTANIA KONTROLNE:
 * 1. Jakie dane trafiają na wejście lub do pliku?
 * 2. Czy wynik jest zawsze taki sam?
 * 3. Jak zareagować na błędne dane albo brak pliku?
 *
 * ŹRÓDŁO: materiał do tematu 07, Przykład 5. Example05FileWrite.
 */

package block7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Example05FileWrite {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("data", "output.txt");
        Files.createDirectories(path.getParent());
        Files.write(path, List.of("Java", "Pliki", "Tekst"));
        System.out.println("Zapisano: " + path.toAbsolutePath());
    }
}
