/*
 * PRZYKŁAD — Counter
 * TEMAT 06: Static, final, dziedziczenie i zasięg
 *
 * CEL / OPIS:
 * Sprawdzamy, jak obliczyć liczbę utworzonych obiektów przy użyciu współdzielonego pola.
 *
 * JAK PRACOWAĆ:
 * - To klasa pomocnicza/model: może nie mieć własnej metody main.
 * - Przyjrzyj się polom, konstruktorom i metodom oraz użyj jej z innej klasy.
 *
 * PYTANIA KONTROLNE:
 * 1. Co należy do klasy, a co do instancji?
 * 2. Które elementy można nadpisać lub zmienić?
 * 3. Jak działa odwołanie do klasy bazowej?
 *
 * ŹRÓDŁO: materiał do tematu 06, Przykład 2. Counter.
 */

package block6;

public class Counter {
    private static int createdCount = 0;
    private final String name;

    public Counter(String name) {
        this.name = name;
        createdCount++;
    }

    public String getName() {
        return name;
    }

    public static int getCreatedCount() {
        return createdCount;
    }
}
