/*
 * PRZYKŁAD — Example15Widening
 * TEMAT 02: Literały, typy danych i konwersje
 *
 * CEL / OPIS:
 * Obserwujemy automatyczne przejście między dozwolonymi typami liczbowymi, bez jawnego
 * rzutowania.
 *
 * RZECZYWISTY WYNIK (dla danych w kodzie):
 *   150
 *   150.0
 *   65
 *
 * JAK PRACOWAĆ:
 * - Przeczytaj kod i przewidź jego działanie przed uruchomieniem.
 * - Następnie sprawdź wynik w IntelliJ i zmień jedną wartość wejściową.
 *
 * PYTANIA KONTROLNE:
 * 1. Które wartości mają typ int, long, float lub double?
 * 2. Czy konwersja może prowadzić do utraty dokładności?
 * 3. Jaki wynik zmieni się po rzutowaniu?
 *
 * ŹRÓDŁO: materiał do tematu 02, Przykład 3. Example15Widening.
 */

package block2extra;

public class Example15Widening {
    public static void main(String[] args) {
        int points = 150;
        long pointsLong = points;
        double pointsDouble = pointsLong;

        char grade = 'A';
        int unicode = grade;

        System.out.println(pointsLong);
        System.out.println(pointsDouble);
        System.out.println(unicode);
    }
}
