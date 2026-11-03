/*
 * PRZYKŁAD — Example08ArrayDeque
 * TEMAT 10: Pakiety, wyjątki i kolekcje
 *
 * CEL / OPIS:
 * Badamy, jak kolejność dodawania i usuwania wpływa na działanie kolejki lub stosu.
 *
 * RZECZYWISTY WYNIK (dla danych w kodzie):
 *   pierwszy
 *   20
 *
 * JAK PRACOWAĆ:
 * - Przeczytaj kod i przewidź jego działanie przed uruchomieniem.
 * - Następnie sprawdź wynik w IntelliJ i zmień jedną wartość wejściową.
 *
 * PYTANIA KONTROLNE:
 * 1. Kiedy wystąpi wyjątek i gdzie zostanie przechwycony?
 * 2. Jakiego typu są elementy kolekcji?
 * 3. Czy kolejność odczytu jest gwarantowana?
 *
 * ŹRÓDŁO: materiał do tematu 10, Przykład 9. Example08ArrayDeque.
 */

package block10;

import java.util.ArrayDeque;
import java.util.Deque;

public class Example08ArrayDeque {
    public static void main(String[] args) {
        Deque<String> queue = new ArrayDeque<>();
        queue.addLast("pierwszy");
        queue.addLast("drugi");
        System.out.println(queue.removeFirst());

        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(10);
        stack.push(20);
        System.out.println(stack.pop());
    }
}
