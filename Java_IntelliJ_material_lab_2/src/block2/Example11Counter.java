package block2;

/*
 * PRZYKŁAD 10 — INKREMENTACJA I DEKREMENTACJA
 *
 * counter++ zwiększa wartość o 1.
 * counter-- zmniejsza wartość o 1.
 *
 * OCZEKIWANY WYNIK:
 * 0
 * 1
 * 2
 * 1
 */
public class Example11Counter {
    public static void main(String[] args) {
        int counter = 0;
        System.out.println(counter);
        counter++;
        System.out.println(counter);
        counter++;
        System.out.println(counter);
        counter--;
        System.out.println(counter);
    }
}
