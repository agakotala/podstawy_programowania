package block2extra;

/*
 * PRZYKŁAD — PRZEPEŁNIENIE PRZY MNOŻENIU
 * CEL: sprawdź, że long po lewej stronie nie zmienia obliczenia int * int.
 *
 * OCZEKIWANY WYNIK:
 * Obliczenie int: 1410065408
 * Obliczenie long: 10000000000
 *
 * PYTANIE: dlaczego dopisanie L do jednego operandu zmienia wynik?
 */
public class IntegerOverflow {
    public static void main(String[] args) {
        long wrong = 100_000 * 100_000;
        long correct = 100_000L * 100_000;

        System.out.println("Obliczenie int: " + wrong);
        System.out.println("Obliczenie long: " + correct);
    }
}
