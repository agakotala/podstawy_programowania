# Temat 08 — Tablice jedno- i dwuwymiarowe


## Uruchamianie

1. Otwórz ten katalog projektu przez `File → Open` w IntelliJ IDEA.
2. Ustaw JDK 17 lub nowsze i oznacz katalog `src` jako Sources Root.
3. Otwórz wybrany plik i uruchom `main`. Niektóre klasy pomocnicze nie mają `main`.
4. Przykłady ze `Scanner` wymagają wpisania danych; przykłady z `Random` mają zmienne wyniki.
5. Komentarze z błędną składnią, jeśli występują, są celowo wyłączone z wykonywania.

## Przykłady z materiału

- `block8/Example01ArrayCreate.java`
- `block8/Example02ArrayOperations.java`
- `block8/Example03TwoDimensional.java`
- `block8/Example04MatrixTraversal.java`


## Zadania

- `block8/ArrayStats.java`
- `block8/MatrixSum.java`
- `block8/ReverseArray.java`
- `block8/RowSums.java`

## Kompilacja terminalowa

```bash
mkdir -p out
find src -name "*.java" -print0 | xargs -0 javac --release 17 -encoding UTF-8 -d out
```
