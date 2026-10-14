package block2;

/*
 * ZADANIE 6 — PRZEWIDŹ WYNIK
 *
 * CEL:
 * - przećwiczyć operator %,
 * - rozróżnić dzielenie int / int od dzielenia double / double,
 * - nauczyć się przewidywać wynik przed uruchomieniem programu.
 *
 * INSTRUKCJA:
 * 1. Najpierw NIE uruchamiaj programu.
 * 2. Zapisz przewidywany wynik każdej instrukcji println.
 * 3. Dopiero potem uruchom program w IntelliJ IDEA.
 * 4. Porównaj wynik z własnymi odpowiedziami i wyjaśnij różnice.
 *
 * Zwróć szczególną uwagę na:
 * - operator %,
 * - dzielenie całkowitoliczbowe,
 * - dzielenie zmiennoprzecinkowe.
 */
public class PredictResult {
    public static void main(String[] args) {
        System.out.println(20 % 3);
        System.out.println(20 % 5);
        System.out.println(13 % 2);
        System.out.println(12 / 5);
        System.out.println(12.0 / 5.0);
    }
}
