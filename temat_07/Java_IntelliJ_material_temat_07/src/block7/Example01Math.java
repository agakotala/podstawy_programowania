/*
 * PRZYKŁAD — Example01Math
 * TEMAT 07: Math, Scanner, Random i pliki tekstowe
 *
 * CEL / OPIS:
 * Korzystamy z gotowych metod biblioteki matematycznej i odróżniamy wartości o typie int
 * oraz double.
 *
 * RZECZYWISTY WYNIK (dla danych w kodzie):
 *   3.7
 *   1024.0
 *   9.0
 *   5
 *   9
 *   5
 *   3.141592653589793
 *
 * JAK PRACOWAĆ:
 * - Przeczytaj kod i przewidź jego działanie przed uruchomieniem.
 * - Następnie sprawdź wynik w IntelliJ i zmień jedną wartość wejściową.
 *
 * PYTANIA KONTROLNE:
 * 1. Jakie dane trafiają na wejście lub do pliku?
 * 2. Czy wynik jest zawsze taki sam?
 * 3. Jak zareagować na błędne dane albo brak pliku?
 *
 * ŹRÓDŁO: materiał do tematu 07, Przykład 1. Example01Math.
 */

package block7;

public class Example01Math {
    public static void main(String[] args) {
        double x = -3.7;
        System.out.println(Math.abs(x));
        System.out.println(Math.pow(2, 10));
        System.out.println(Math.sqrt(81));
        System.out.println(Math.min(5, 9));
        System.out.println(Math.max(5, 9));
        System.out.println(Math.round(4.6));
        System.out.println(Math.PI);
    }
}
