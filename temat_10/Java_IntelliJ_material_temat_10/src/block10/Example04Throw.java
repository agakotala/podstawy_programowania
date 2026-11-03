/*
 * PRZYKŁAD — Example04Throw
 * TEMAT 10: Pakiety, wyjątki i kolekcje
 *
 * CEL / OPIS:
 * Badamy, kiedy własny kod świadomie zgłasza wyjątek za pomocą throw.
 *
 * RZECZYWISTY WYNIK (dla danych w kodzie):
 *   Wiek poza zakresem: 150
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
 * ŹRÓDŁO: materiał do tematu 10, Przykład 5. Example04Throw.
 */

package block10;

public class Example04Throw {
    static void validateAge(int age) {
        if (age < 0 || age > 130) {
            throw new IllegalArgumentException("Wiek poza zakresem: " + age);
        }
    }

    public static void main(String[] args) {
        try {
            validateAge(150);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
