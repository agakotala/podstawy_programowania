/*
 * PRZYKŁAD — Example02Logical
 * TEMAT 03: Porównania, warunki, if i switch
 *
 * CEL / OPIS:
 * Łączymy warunki dotyczące wieku, biletu i zakazu wejścia. Oddzielnie obliczamy warunek
 * uprawniający do zniżki.
 *
 * RZECZYWISTY WYNIK (dla danych w kodzie):
 *   Wejście: true
 *   Zniżka: false
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
 * ŹRÓDŁO: materiał do tematu 03, Przykład 2. Example02Logical.
 */

package block3;

public class Example02Logical {
    public static void main(String[] args) {
        int age = 22;
        boolean hasTicket = true;
        boolean banned = false;

        boolean canEnter = age >= 18 && hasTicket && !banned;
        boolean discount = age < 18 || age >= 65;

        System.out.println("Wejście: " + canEnter);
        System.out.println("Zniżka: " + discount);
    }
}
