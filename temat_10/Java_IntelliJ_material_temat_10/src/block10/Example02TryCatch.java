/*
 * PRZYKŁAD — Example02TryCatch
 * TEMAT 10: Pakiety, wyjątki i kolekcje
 *
 * CEL / OPIS:
 * Program przechwytuje wybrany wyjątek i może przejść do kolejnych instrukcji.
 *
 * RZECZYWISTY WYNIK (dla danych w kodzie):
 *   Niepoprawna liczba: abc
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
 * ŹRÓDŁO: materiał do tematu 10, Przykład 3. Example02TryCatch.
 */

package block10;

public class Example02TryCatch {
    public static void main(String[] args) {
        String text = "abc";
        try {
            int number = Integer.parseInt(text);
            System.out.println(number);
        } catch (NumberFormatException e) {
            System.out.println("Niepoprawna liczba: " + text);
        }
    }
}
