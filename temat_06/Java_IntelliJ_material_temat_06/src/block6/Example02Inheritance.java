/*
 * PRZYKŁAD — Example02Inheritance
 * TEMAT 06: Static, final, dziedziczenie i zasięg
 *
 * CEL / OPIS:
 * Tworzymy obiekt klasy potomnej i wywołujemy na nim metodę nadpisaną po klasie bazowej.
 *
 * RZECZYWISTY WYNIK (dla danych w kodzie):
 *   Reks: hau!
 *   Reks aportuje.
 *   Reks: hau!
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
 * ŹRÓDŁO: materiał do tematu 06, Przykład 5. Example02Inheritance.
 */

package block6;

public class Example02Inheritance {
    public static void main(String[] args) {
        Dog dog = new Dog("Reks");
        dog.makeSound();
        dog.fetch();

        Animal animalReference = dog;
        animalReference.makeSound(); // działa wersja nadpisana w Dog
    }
}
