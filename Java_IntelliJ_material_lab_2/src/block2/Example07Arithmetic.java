package block2;

/*
 * PRZYKŁAD 6 — OPERATORY ARYTMETYCZNE
 *
 * + dodawanie, - odejmowanie, * mnożenie, / dzielenie, % reszta z dzielenia.
 *
 * Wyniki są obliczane na podstawie aktualnych wartości a i b.
 *
 * OCZEKIWANY WYNIK:
 * Suma: 24
 * Różnica: 16
 * Iloczyn: 80
 * Iloraz: 5
 */
public class Example07Arithmetic {
    public static void main(String[] args) {
        int a = 20;
        int b = 4;
        int sum = a + b;
        int difference = a - b;
        int product = a * b;
        int quotient = a / b;
        System.out.println("Suma: " + sum);
        System.out.println("Różnica: " + difference);
        System.out.println("Iloczyn: " + product);
        System.out.println("Iloraz: " + quotient);
    }
}
