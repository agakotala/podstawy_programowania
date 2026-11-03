/*
 * OPCJONALNE PRZYPOMNIENIE Z LAB 2 — Example14Literals
 * TEMAT 02: Literały, typy danych i konwersje
 *
 * CEL / OPIS:
 * Jeśli pamiętasz już podstawowe typy i literały z Lab 2, możesz pominąć ten plik.
 * Nowy element: porównaj zapisy binarny i szesnastkowy tej samej liczby.
 *
 * RZECZYWISTY WYNIK (dla danych w kodzie):
 *   42 42 42
 *   8000000000
 *   1.5 3.1415926535
 *   A / true / Java
 *   A
 *   B
 *
 * JAK PRACOWAĆ:
 * - Przeczytaj kod i przewidź jego działanie przed uruchomieniem.
 * - Następnie sprawdź wynik w IntelliJ i zmień jedną wartość wejściową.
 *
 * PYTANIA KONTROLNE:
 * 1. Które wartości mają typ int, long, float lub double?
 * 2. Czy konwersja może prowadzić do utraty dokładności?
 * 3. Jaki wynik zmieni się po rzutowaniu?
 *
 * ŹRÓDŁO: materiał do tematu 02, Przykład 1. Example14Literals.
 */

package block2extra;

public class Example14Literals {
    public static void main(String[] args) {
        int decimal = 42;
        int binary = 0b101010;
        int hex = 0x2A;
        long population = 8_000_000_000L;
        float ratio = 1.5F;
        double pi = 3.1415926535;
        char letter = 'A';
        char newline = '\n';
        boolean active = true;
        String text = "Java";

        System.out.println(decimal + " " + binary + " " + hex);
        System.out.println(population);
        System.out.println(ratio + " " + pi);
        System.out.println(letter + " / " + active + " / " + text);
        System.out.print("A" + newline + "B\n");
    }
}
