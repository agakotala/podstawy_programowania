/*
 * PRZYKŁAD — Example01StringOperations
 * TEMAT 05: String, klasy, obiekty i metody
 *
 * CEL / OPIS:
 * Wykorzystujemy metody String. Szczególnie ważne jest rozróżnienie metody zwracającej
 * nowy napis i zmiany wartości zmiennej.
 *
 * RZECZYWISTY WYNIK (dla danych w kodzie):
 *   16
 *   JAVA PROGRAMMING
 *   true
 *   Java
 *   Kotlin Programming
 *   true
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
 * ŹRÓDŁO: materiał do tematu 05, Przykład 1. Example01StringOperations.
 */

package block5;

public class Example01StringOperations {
    public static void main(String[] args) {
        String text = "  Java Programming  ";
        String clean = text.trim();

        System.out.println(clean.length());
        System.out.println(clean.toUpperCase());
        System.out.println(clean.contains("Program"));
        System.out.println(clean.substring(0, 4));
        System.out.println(clean.replace("Java", "Kotlin"));
        System.out.println(clean.equals("Java Programming"));
    }
}
