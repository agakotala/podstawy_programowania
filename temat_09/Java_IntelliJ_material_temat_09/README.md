# Temat 09 — Algorytmy, minimum i sortowanie


## Uruchamianie

1. Otwórz ten katalog projektu przez `File → Open` w IntelliJ IDEA.
2. Ustaw JDK 17 lub nowsze i oznacz katalog `src` jako Sources Root.
3. Otwórz wybrany plik i uruchom `main`. Niektóre klasy pomocnicze nie mają `main`.
4. Przykłady ze `Scanner` wymagają wpisania danych; przykłady z `Random` mają zmienne wyniki.
5. Komentarze z błędną składnią, jeśli występują, są celowo wyłączone z wykonywania.

## Przykłady z materiału

- `block9/Example01BubbleSort.java`
- `block9/Example02InsertionSort.java`
- `block9/Example03MinInRowColumn.java`
- `block9/Example04Complexity.java`


## Zadania

- `block9/CompareSorts.java`
- `block9/FindMinColumn.java`
- `block9/SortDescending.java`

## Kompilacja terminalowa

```bash
mkdir -p out
find src -name "*.java" -print0 | xargs -0 javac --release 17 -encoding UTF-8 -d out
```
