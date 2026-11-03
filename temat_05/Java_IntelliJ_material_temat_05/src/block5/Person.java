/*
 * PRZYKŁAD — Person
 * TEMAT 05: String, klasy, obiekty i metody
 *
 * CEL / OPIS:
 * Odczytujemy przykład klasy z polami prywatnymi, konstruktorem, metodami dostępu i
 * sprawdzaniem wieku.
 *
 * JAK PRACOWAĆ:
 * - To klasa pomocnicza/model: może nie mieć własnej metody main.
 * - Przyjrzyj się polom, konstruktorom i metodom oraz użyj jej z innej klasy.
 *
 * PYTANIA KONTROLNE:
 * 1. Które dane należą do konkretnego obiektu?
 * 2. Czy metoda zmienia stan obiektu, czy zwraca wynik?
 * 3. Gdzie i dlaczego tworzymy instancję?
 *
 * W metodzie setAge zastosowano final: konstruktor może ją wywołać,
 * ponieważ metoda nie może zostać nadpisana w klasie potomnej.
 * ŹRÓDŁO: materiał do tematu 05, Przykład 3. Person.
 */

package block5;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public final void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Wiek nie może być ujemny");
        }
        this.age = age;
    }

    public void introduce() {
        System.out.println("Mam na imię " + name + " i mam " + age + " lat.");
    }
}
