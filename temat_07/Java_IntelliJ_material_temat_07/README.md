# Temat 07 — Math, Scanner, Random i pliki tekstowe


## Uruchamianie

1. Otwórz ten katalog projektu przez `File → Open` w IntelliJ IDEA.
2. Ustaw JDK 17 lub nowsze i oznacz katalog `src` jako Sources Root.
3. Otwórz wybrany plik i uruchom `main`. Niektóre klasy pomocnicze nie mają `main`.
4. Przykłady ze `Scanner` wymagają wpisania danych; przykłady z `Random` mają zmienne wyniki.
5. Komentarze z błędną składnią, jeśli występują, są celowo wyłączone z wykonywania.

## Przykłady z materiału

- `block7/Example01Math.java`
- `block7/Example02Scanner.java`
- `block7/Example03Random.java`
- `block7/Example04StringParsing.java`
- `block7/Example05FileWrite.java`
- `block7/Example06FileRead.java`


## Zadania

- `block7/DiceSimulation.java`
- `block7/InputProfile.java`


## Praca z plikami — ważne

Uruchom `block7.Example05FileWrite`, a następnie `block7.Example06FileRead`. Katalog roboczy IntelliJ powinien wskazywać folder tego projektu.

## Kompilacja terminalowa

```bash
mkdir -p out
find src -name "*.java" -print0 | xargs -0 javac --release 17 -encoding UTF-8 -d out
```
