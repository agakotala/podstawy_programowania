package block1extra;

/*
 * ĆWICZENIE DODATKOWE A — analiza bajtkodu
 * Rozwinięcie Zadania 1 z PDF; nie jest to osobne „Zadanie 5” z instrukcji.
 *
 * 1. Przewidź wynik calculate(3, 4).
 * 2. Skompiluj klasę poleceniem (z katalogu projektu):
 *    javac --release 17 -encoding UTF-8 -d out src/block1extra/BytecodeQuestions.java
 * 3. Zobacz bajtkod:
 *    javap -classpath out -c block1extra.BytecodeQuestions
 * 4. Zmień działanie metody calculate (np. kolejność działań),
 *    skompiluj ponownie i porównaj instrukcje bajtkodu.
 * 5. Zapisz obserwacje. Nie modyfikuj ręcznie pliku .class.
 *
 * UWAGA: kod początkowy jest gotowy do uruchomienia; zadanie polega
 * na eksperymentach i opisaniu wyniku, nie na uzupełnianiu TODO.
 */
public class BytecodeQuestions {
    static int calculate(int a, int b) {
        return a + b * 2;
    }

    public static void main(String[] args) {
        System.out.println(calculate(3, 4));
    }
}
