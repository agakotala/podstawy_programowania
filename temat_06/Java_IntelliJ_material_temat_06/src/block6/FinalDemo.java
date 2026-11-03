/*
 * PRZYKŁAD — FinalDemo
 * TEMAT 06: Static, final, dziedziczenie i zasięg
 *
 * CEL / OPIS:
 * Przekonujemy się, że final zabrania ponownego przypisania zmiennej, ale nie musi
 * blokować zmiany zawartości obiektu.
 *
 * RZECZYWISTY WYNIK (dla danych w kodzie):
 *   3
 *   AB
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
 * ŹRÓDŁO: materiał do tematu 06, Przykład 3. FinalDemo.
 */

package block6;

public class FinalDemo {
    public static void main(String[] args) {
        final int maxAttempts = 3;
        final StringBuilder builder = new StringBuilder("A");
        builder.append("B"); // dozwolone: obiekt może się zmienić

        System.out.println(maxAttempts);
        System.out.println(builder);

        // maxAttempts = 4; // błąd
        // builder = new StringBuilder("X"); // błąd
    }
}
