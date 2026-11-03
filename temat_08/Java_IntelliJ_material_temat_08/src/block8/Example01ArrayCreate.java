/*
 * PRZYKŁAD — Example01ArrayCreate
 * TEMAT 08: Tablice jedno- i dwuwymiarowe
 *
 * CEL / OPIS:
 * Pokazujemy dwa sposoby przygotowania tablicy: wypełnienie wartościami i utworzenie
 * pustych miejsc.
 *
 * RZECZYWISTY WYNIK (dla danych w kodzie):
 *   10
 *   4
 *   Jan
 *
 * JAK PRACOWAĆ:
 * - Przeczytaj kod i przewidź jego działanie przed uruchomieniem.
 * - Następnie sprawdź wynik w IntelliJ i zmień jedną wartość wejściową.
 *
 * PYTANIA KONTROLNE:
 * 1. Od jakiego indeksu zaczynamy?
 * 2. Jak uniknąć wyjścia poza zakres tablicy?
 * 3. Ile elementów i wierszy przetwarzamy?
 *
 * ŹRÓDŁO: materiał do tematu 08, Przykład 1. Example01ArrayCreate.
 */

package block8;

public class Example01ArrayCreate {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40};
        String[] names = new String[3];
        names[0] = "Ala";
        names[1] = "Ola";
        names[2] = "Jan";

        System.out.println(numbers[0]);
        System.out.println(numbers.length);
        System.out.println(names[2]);
    }
}
