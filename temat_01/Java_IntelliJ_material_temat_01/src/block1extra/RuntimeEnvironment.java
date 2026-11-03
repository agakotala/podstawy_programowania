/*
 * PRZYKŁAD — RuntimeEnvironment
 * TEMAT 01: Środowisko programowania, kompilacja i uruchamianie
 *
 * CEL / OPIS:
 * Odczytujemy informacje o środowisku wykonania. Warto odróżniać własne dane programu od
 * właściwości udostępnianych przez JVM.
 *
 * WYNIK ZALEŻNY OD KOMPUTERA:
 *   Wersja i dostawca Javy, system operacyjny i architektura zależą od środowiska.
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
 * ŹRÓDŁO: materiał do tematu 01, Przykład 4. RuntimeEnvironment.
 */

package block1extra;

public class RuntimeEnvironment {
    public static void main(String[] args) {
        System.out.println("Java version: " + System.getProperty("java.version"));
        System.out.println("Java vendor: " + System.getProperty("java.vendor"));
        System.out.println("OS: " + System.getProperty("os.name"));
        System.out.println("Architecture: " + System.getProperty("os.arch"));
    }
}
