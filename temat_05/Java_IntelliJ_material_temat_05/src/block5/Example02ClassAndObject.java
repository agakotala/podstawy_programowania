/*
 * PRZYKŁAD — Example02ClassAndObject
 * TEMAT 05: String, klasy, obiekty i metody
 *
 * CEL / OPIS:
 * Tworzymy obiekt z klasy i odwołujemy się do jego danych oraz zachowań.
 *
 * RZECZYWISTY WYNIK (dla danych w kodzie):
 *   Mam na imię Anna i mam 21 lat.
 *   Anna ma teraz 22 lata.
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
 * ŹRÓDŁO: materiał do tematu 05, Przykład 2. Example02ClassAndObject.
 */

package block5;

public class Example02ClassAndObject {
    public static void main(String[] args) {
        Person person = new Person("Anna", 21);
        person.introduce();

        person.setAge(22);
        System.out.println(person.getName() + " ma teraz " + person.getAge() + " lata.");
    }
}
