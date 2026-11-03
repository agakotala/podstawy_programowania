/*
 * PRZYKŁAD — ScopeLifetime
 * TEMAT 06: Static, final, dziedziczenie i zasięg
 *
 * CEL / OPIS:
 * Porównujemy zakres zmiennych lokalnych z dostępnością pól i obiektów.
 *
 * RZECZYWISTY WYNIK (dla danych w kodzie):
 *   100
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
 * ŹRÓDŁO: materiał do tematu 06, Przykład 4. ScopeLifetime.
 */

package block6;

public class ScopeLifetime {
    private int instanceField = 10;
    private static int classField = 20;

    void show() {
        int local = 30;
        if (local > 0) {
            int insideBlock = 40;
            System.out.println(instanceField + classField + local + insideBlock);
        }
        // insideBlock nie istnieje już w tym zakresie.
    }

    public static void main(String[] args) {
        ScopeLifetime demo = new ScopeLifetime();
        demo.show();
    }
}
