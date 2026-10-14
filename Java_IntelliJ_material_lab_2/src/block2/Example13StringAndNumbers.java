package block2;

/*
 * UZUPEŁNIENIE — LICZBA CZY TEKST?
 *
 * 2 + 3 -> 5
 * "2" + "3" -> "23"
 * "Wynik: " + 2 + 3 -> "Wynik: 23"
 * "Wynik: " + (2 + 3) -> "Wynik: 5"
 *
 * OCZEKIWANY WYNIK:
 * 5
 * 23
 * Wynik: 23
 * Wynik: 5
 */
public class Example13StringAndNumbers {
    public static void main(String[] args) {
        System.out.println(2 + 3);
        System.out.println("2" + "3");
        System.out.println("Wynik: " + 2 + 3);
        System.out.println("Wynik: " + (2 + 3));
    }
}
