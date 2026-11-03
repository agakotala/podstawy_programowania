/*
 * PRZYKŁAD — Example08FibonacciIterative
 * TEMAT 04: Pętle i rekurencja
 *
 * CEL / OPIS:
 * Kolejne wyrazy ciągu otrzymujemy przez przesuwanie dwóch poprzednich wartości.
 *
 * RZECZYWISTY WYNIK (dla danych w kodzie):
 *   0 1 1 2 3 5 8 13 21 34
 *
 * JAK PRACOWAĆ:
 * - Przeczytaj kod i przewidź jego działanie przed uruchomieniem.
 * - Następnie sprawdź wynik w IntelliJ i zmień jedną wartość wejściową.
 *
 * PYTANIA KONTROLNE:
 * 1. Ile razy wykona się pętla?
 * 2. Która instrukcja odpowiada za zakończenie?
 * 3. Co zmieni się po zmianie warunku?
 *
 * ŹRÓDŁO: materiał do tematu 04, Przykład 8. Example08FibonacciIterative.
 */

package block4;

public class Example08FibonacciIterative {
    public static void main(String[] args) {
        int count = 10;
        long a = 0;
        long b = 1;

        for (int i = 0; i < count; i++) {
            System.out.print(a + (i + 1 == count ? "\n" : " "));
            long next = a + b;
            a = b;
            b = next;
        }
    }
}
