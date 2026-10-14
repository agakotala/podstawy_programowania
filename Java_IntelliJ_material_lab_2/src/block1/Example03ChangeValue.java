package block1;

/*
 * PRZYKŁAD 2 — ZMIANA WARTOŚCI ZMIENNEJ
 *
 * int points = 10;  -> deklaracja z wartością początkową
 * points = 20;      -> przypisanie nowej wartości
 *
 * Nie piszemy ponownie int, ponieważ zmienna points już istnieje.
 * Znak = oznacza przypisanie.
 *
 * OCZEKIWANY WYNIK:
 * 10
 * 20
 */
public class Example03ChangeValue {
    public static void main(String[] args) {
        int points = 10;
        System.out.println(points);
        points = 20;
        System.out.println(points);
    }
}
