/*
 * PRZYKŁAD — Example01StaticInstance
 * TEMAT 06: Static, final, dziedziczenie i zasięg
 *
 * CEL / OPIS:
 * Porównujemy pole powiązane z klasą z polem powiązanym z konkretnym obiektem.
 *
 * RZECZYWISTY WYNIK (dla danych w kodzie):
 *   A
 *   B
 *   2
 *
 * JAK PRACOWAĆ:
 * - Przeczytaj kod i przewidź jego działanie przed uruchomieniem.
 * - Następnie sprawdź wynik w IntelliJ i zmień jedną wartość wejściową.
 *
 * PYTANIA KONTROLNE:
 * 1. Co należy do klasy, a co do instancji?
 * 2. Które elementy można nadpisać lub zmienić?
 * 3. Jak działa odwołanie do klasy bazowej?
 *
 * ŹRÓDŁO: materiał do tematu 06, Przykład 1. Example01StaticInstance.
 */

package block6;

public class Example01StaticInstance {
    public static void main(String[] args) {
        Counter first = new Counter("A");
        Counter second = new Counter("B");

        System.out.println(first.getName());
        System.out.println(second.getName());
        System.out.println(Counter.getCreatedCount());
    }
}
