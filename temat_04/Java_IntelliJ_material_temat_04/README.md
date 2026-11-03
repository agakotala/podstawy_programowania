# Temat 04 — Pętle i rekurencja


## Uruchamianie

1. Otwórz ten katalog projektu przez `File → Open` w IntelliJ IDEA.
2. Ustaw JDK 17 lub nowsze i oznacz katalog `src` jako Sources Root.
3. Otwórz wybrany plik i uruchom `main`. Niektóre klasy pomocnicze nie mają `main`.
4. Przykłady ze `Scanner` wymagają wpisania danych; przykłady z `Random` mają zmienne wyniki.
5. Komentarze z błędną składnią, jeśli występują, są celowo wyłączone z wykonywania.

## Przykłady z materiału

- `block4/Example01While.java`
- `block4/Example02DoWhile.java`
- `block4/Example03For.java`
- `block4/Example04BreakContinue.java`
- `block4/Example05NestedLoops.java`
- `block4/Example06FactorialIterative.java`
- `block4/Example07FactorialRecursive.java`
- `block4/Example08FibonacciIterative.java`
- `block4/Example09FibonacciRecursive.java`


## Zadania

- `block4/CountdownLoops.java`
- `block4/FactorialTrace.java`
- `block4/FibonacciComparison.java`
- `block4/NestedLoopCount.java`
- `block4/SkipMultiplesOfThree.java`
- `block4/SumOneToHundred.java`


## Kompilacja terminalowa

```bash
mkdir -p out
find src -name "*.java" -print0 | xargs -0 javac --release 17 -encoding UTF-8 -d out
```
