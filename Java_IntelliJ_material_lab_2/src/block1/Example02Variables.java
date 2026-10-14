package block1;

/*
 * PRZYKŁAD 1 — PIERWSZA ZMIENNA
 *
 * CEL:
 * - zrozumieć, czym jest zmienna,
 * - zobaczyć deklarację i inicjalizację,
 * - odczytać wartość zmiennej.
 *
 * Zmienna to nazwane miejsce, w którym program przechowuje wartość określonego typu.
 * Można myśleć o niej jak o podpisanym pudełku:
 *
 *     age -> 20
 *
 * Instrukcja:
 *     int age = 20;
 * oznacza:
 * - int  -> typ,
 * - age  -> nazwa,
 * - 20   -> wartość początkowa.
 *
 * System.out.println(age) odczytuje wartość zmiennej, a nie napis "age".
 *
 * OCZEKIWANY WYNIK:
 * 20
 *
 * PYTANIA KONTROLNE:
 * 1. Jak nazywa się zmienna?
 * 2. Jakiego jest typu?
 * 3. Jaką wartość przechowuje?
 */
public class Example02Variables {
    public static void main(String[] args) {
        int age = 20;
        System.out.println(age);
    }
}
