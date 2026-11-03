/*
 * PRZYKŁAD — Example01Comparisons
 * TEMAT 03: Porównania, warunki, if i switch
 *
 * CEL / OPIS:
 * Porównujemy liczby. Każdy operator tworzy wynik logiczny true albo false.
 *
 * RZECZYWISTY WYNIK (dla danych w kodzie):
 *   true
 *   true
 *   true
 *   true
 *
 * JAK PRACOWAĆ:
 * - Przeczytaj kod i przewidź jego działanie przed uruchomieniem.
 * - Następnie sprawdź wynik w IntelliJ i zmień jedną wartość wejściową.
 *
 * PYTANIA KONTROLNE:
 * 1. Który warunek jest sprawdzany jako pierwszy?
 * 2. Co się stanie dla wartości granicznej?
 * 3. Czy wszystkie gałęzie warunku mogą być wykonane?
 *
 * ŹRÓDŁO: materiał do tematu 03, Przykład 1. Example01Comparisons.
 */

package block3;

public class Example01Comparisons {
    public static void main(String[] args) {
        int age = 20;
        System.out.println(age >= 18);
        System.out.println(age == 20);
        System.out.println(age != 21);
        System.out.println(age < 30);
    }
}
