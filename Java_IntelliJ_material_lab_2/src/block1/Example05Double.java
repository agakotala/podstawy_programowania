package block1;

/*
 * PRZYKŁAD 4 — TYP double
 *
 * double służy do liczb, które mogą mieć część ułamkową.
 * W Javie używamy kropki: 12.50, a nie 12,50.
 *
 * double value = 10;   // poprawnie
 * int value2 = 10.5;   // błąd
 *
 * UWAGA:
 * Do prostych ćwiczeń z cenami używamy double. W realnych systemach finansowych
 * często stosuje się BigDecimal, gdy wymagana jest dokładność dziesiętna.
 *
 * OCZEKIWANY WYNIK:
 * 129.99
 * 1.78
 */
public class Example05Double {
    public static void main(String[] args) {
        double price = 129.99;
        double height = 1.78;
        System.out.println(price);
        System.out.println(height);
    }
}
