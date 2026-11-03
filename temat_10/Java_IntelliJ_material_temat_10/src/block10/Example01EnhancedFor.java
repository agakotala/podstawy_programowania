/*
 * PRZYKŁAD — Example01EnhancedFor
 * TEMAT 10: Pakiety, wyjątki i kolekcje
 *
 * CEL / OPIS:
 * Sumujemy elementy tablicy bez ręcznego wyliczania indeksów.
 *
 * RZECZYWISTY WYNIK (dla danych w kodzie):
 *   20
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
 * ŹRÓDŁO: materiał do tematu 10, Przykład 2. Example01EnhancedFor.
 */

package block10;

public class Example01EnhancedFor {
    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 8};
        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }

        System.out.println(sum);
    }
}
