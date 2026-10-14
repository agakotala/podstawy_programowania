package block1;

/*
 * PRZYKŁAD 3 — TYP int
 *
 * int służy do liczb całkowitych, np. wiek, liczba punktów, liczba sztuk.
 *
 * int height = 1.75; // błąd, bo 1.75 ma część ułamkową
 *
 * OCZEKIWANY WYNIK:
 * 21
 * 120
 * -3
 */
public class Example04Int {
    public static void main(String[] args) {
        int age = 21;
        int points = 120;
        int temperature = -3;
        System.out.println(age);
        System.out.println(points);
        System.out.println(temperature);
    }
}
