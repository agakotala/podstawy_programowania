package block2;

/*
 * PRZYKŁAD 9 — SKRÓCONE OPERATORY PRZYPISANIA
 *
 * points = points + 50; można w tym przypadku zapisać points += 50;
 * Analogicznie: -=, *=, /=.
 *
 * KROK PO KROKU:
 * 100 -> 150 -> 130 -> 260
 *
 * OCZEKIWANY WYNIK:
 * 100
 * 150
 * 130
 * 260
 */
public class Example10Assignment {
    public static void main(String[] args) {
        int points = 100;
        System.out.println(points);
        points += 50;
        System.out.println(points);
        points -= 20;
        System.out.println(points);
        points *= 2;
        System.out.println(points);
    }
}
