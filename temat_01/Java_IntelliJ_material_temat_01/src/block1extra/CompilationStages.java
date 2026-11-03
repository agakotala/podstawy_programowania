/*
 * PRZYKŁAD — CompilationStages
 * TEMAT 01: Środowisko programowania, kompilacja i uruchamianie
 *
 * CEL / OPIS:
 * Obliczamy kwadrat liczby 7 za pomocą osobnej metody. To niedługi program, który nadaje
 * się do sprawdzania, co kompilator zapisuje w bajtkodzie.
 *
 * RZECZYWISTY WYNIK (dla danych w kodzie):
 *   49
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
 * ŹRÓDŁO: materiał do tematu 01, Przykład 1. CompilationStages.
 */

package block1extra;

public class CompilationStages {
    static int square(int x) {
        return x * x;
    }

    public static void main(String[] args) {
        int result = square(7);
        System.out.println(result);
    }
}
