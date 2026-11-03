/*
 * PRZYKŁAD — ToolchainExperiment
 * TEMAT 01: Środowisko programowania, kompilacja i uruchamianie
 *
 * CEL / OPIS:
 * Dodajemy dwie liczby i wyświetlamy wynik. Ten sam plik można skompilować w IntelliJ
 * lub przez javac, a następnie uruchomić przez JVM.
 *
 * RZECZYWISTY WYNIK (dla danych w kodzie):
 *   Wynik: 12
 *
 * JAK PRACOWAĆ:
 * - Przeczytaj kod i przewidź jego działanie przed uruchomieniem.
 * - Następnie sprawdź wynik w IntelliJ i zmień jedną wartość wejściową.
 *
 * PYTANIA KONTROLNE:
 * 1. Jaką rolę pełnią javac, JVM i pliki .class?
 * 2. Jak odróżnisz błąd kompilacji od błędu podczas działania?
 * 3. Który wynik zależy od konfiguracji komputera?
 *
 * ŹRÓDŁO: materiał do tematu 01, Przykład 2. ToolchainExperiment.
 */

package block1extra;

public class ToolchainExperiment {
    public static void main(String[] args) {
        int a = 7;
        int b = 5;
        int result = a + b;
        System.out.println("Wynik: " + result);
    }
}
