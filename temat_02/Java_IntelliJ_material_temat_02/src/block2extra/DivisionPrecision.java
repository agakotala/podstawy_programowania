package block2extra;

/*
 * PRZYKŁAD — DZIELENIE I RZUTOWANIE
 * CEL: sprawdź typ wyrażenia, zanim zostanie przypisane do double.
 *
 * OCZEKIWANY WYNIK:
 * Bez rzutowania: 2.0
 * Rzut przed dzieleniem: 2.5
 * Rzut po dzieleniu: 2.0
 *
 * PYTANIE: dlaczego rzutowanie gotowego wyniku nie odzyskuje ułamka?
 */
public class DivisionPrecision {
    public static void main(String[] args) {
        int apples = 5;
        int people = 2;

        double withoutCast = apples / people;
        double before = (double) apples / people;
        double after = (double) (apples / people);

        System.out.println("Bez rzutowania: " + withoutCast);
        System.out.println("Rzut przed dzieleniem: " + before);
        System.out.println("Rzut po dzieleniu: " + after);
    }
}
