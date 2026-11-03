/*
 * PRZYKŁAD — Example03Overloading
 * TEMAT 05: String, klasy, obiekty i metody
 *
 * CEL / OPIS:
 * Wybieramy przeciążoną wersję metody na podstawie typów przekazanych argumentów.
 *
 * RZECZYWISTY WYNIK (dla danych w kodzie):
 *   1.0
 *   25.0
 *   28.0
 *   9
 *   2.5
 *   9
 *
 * JAK PRACOWAĆ:
 * - Przeczytaj kod i przewidź jego działanie przed uruchomieniem.
 * - Następnie sprawdź wynik w IntelliJ i zmień jedną wartość wejściową.
 *
 * PYTANIA KONTROLNE:
 * 1. Które dane należą do konkretnego obiektu?
 * 2. Czy metoda zmienia stan obiektu, czy zwraca wynik?
 * 3. Gdzie i dlaczego tworzymy instancję?
 *
 * ŹRÓDŁO: materiał do tematu 05, Przykład 4. Example03Overloading.
 */

package block5;

public class Example03Overloading {
    public static void main(String[] args) {
        Rectangle unit = new Rectangle();
        Rectangle square = new Rectangle(5);
        Rectangle rectangle = new Rectangle(4, 7);

        System.out.println(unit.area());
        System.out.println(square.area());
        System.out.println(rectangle.area());

        MathHelper helper = new MathHelper();
        System.out.println(helper.max(2, 9));
        System.out.println(helper.max(2.5, 1.8));
        System.out.println(helper.max(4, 9, 3));
    }
}
