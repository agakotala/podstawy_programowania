/*
 * PRZYKŁAD — Example03Finally
 * TEMAT 10: Pakiety, wyjątki i kolekcje
 *
 * CEL / OPIS:
 * Sprawdzamy, kiedy wykonuje się blok finally.
 *
 * RZECZYWISTY WYNIK (dla danych w kodzie):
 *   5
 *   Koniec sekcji try/catch
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
 * ŹRÓDŁO: materiał do tematu 10, Przykład 4. Example03Finally.
 */

package block10;

public class Example03Finally {
    public static void main(String[] args) {
        try {
            int result = 10 / 2;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Błąd dzielenia");
        } finally {
            System.out.println("Koniec sekcji try/catch");
        }
    }
}
