/*
 * PRZYKŁAD — Animal
 * TEMAT 06: Static, final, dziedziczenie i zasięg
 *
 * CEL / OPIS:
 * Przyglądamy się klasie bazowej, z której inne typy mogą dziedziczyć wspólne cechy i
 * zachowania.
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
 * ŹRÓDŁO: materiał do tematu 06, Przykład 6. Animal.
 */

package block6;

public class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public void makeSound() {
        System.out.println("Nieznany dźwięk");
    }
}
