/*
 * PRZYKŁAD — Example02Scanner
 * TEMAT 07: Math, Scanner, Random i pliki tekstowe
 *
 * CEL / OPIS:
 * Program pobiera dane z klawiatury. Wynik zależy od tego, co wpisze użytkownik.
 *
 * DANE PRZYKŁADOWE I WYNIK:
 *   Wpisz Anna, potem 21 (każdą wartość zatwierdź Enter). Wynik: Cześć Anna, masz 21 lat.
 *
 * JAK PRACOWAĆ:
 * - Przeczytaj kod i przewidź jego działanie przed uruchomieniem.
 * - Następnie sprawdź wynik w IntelliJ i zmień jedną wartość wejściową.
 *
 * PYTANIA KONTROLNE:
 * 1. Jakie dane trafiają na wejście lub do pliku?
 * 2. Czy wynik jest zawsze taki sam?
 * 3. Jak zareagować na błędne dane albo brak pliku?
 *
 * ŹRÓDŁO: materiał do tematu 07, Przykład 2. Example02Scanner.
 */

package block7;

import java.util.Scanner;

public class Example02Scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj imię: ");
        String name = scanner.nextLine();

        System.out.print("Podaj wiek: ");
        int age = Integer.parseInt(scanner.nextLine());

        System.out.println("Cześć " + name + ", masz " + age + " lat.");
    }
}
