/*
 * PRZYKŁAD — Arguments
 * TEMAT 01: Środowisko programowania, kompilacja i uruchamianie
 *
 * CEL / OPIS:
 * Program pokazuje, ile argumentów otrzymał podczas uruchamiania metodą main(String[] args). Wynik zależy od argumentów wpisanych w konfiguracji uruchomienia.
 *
 * WYNIK ZALEŻNY OD ARGUMENTÓW:
 *   Bez argumentów: Liczba argumentów: 0. Jeśli przekażesz argumenty w konfiguracji Run, wynik się zmieni.
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
 * ŹRÓDŁO: materiał do tematu 01, Program wprowadzający: Arguments.
 */

public class Arguments {
    public static void main(String[] args) {
        System.out.println("Liczba argumentów: " + args.length);
    }
}
