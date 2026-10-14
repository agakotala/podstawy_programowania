package block2;

/*
 * UZUPEŁNIENIE — number++ A ++number
 *
 * number++: najpierw używana jest stara wartość, potem zwiększenie.
 * ++number: najpierw zwiększenie, potem użycie nowej wartości.
 *
 * Na początku kursu najlepiej używać ++ jako osobnej instrukcji.
 */
public class Example12IncrementOrder {
    public static void main(String[] args) {
        int firstNumber = 5;
        System.out.println(firstNumber++);
        System.out.println(firstNumber);

        System.out.println("---");

        int secondNumber = 5;
        System.out.println(++secondNumber);
        System.out.println(secondNumber);
    }
}
