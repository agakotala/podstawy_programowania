# Temat 03 — Porównania, warunki, if i switch


## Uruchamianie

1. Otwórz ten katalog projektu przez `File → Open` w IntelliJ IDEA.
2. Ustaw JDK 17 lub nowsze i oznacz katalog `src` jako Sources Root.
3. Otwórz wybrany plik i uruchom `main`. Niektóre klasy pomocnicze nie mają `main`.
4. Przykłady ze `Scanner` wymagają wpisania danych; przykłady z `Random` mają zmienne wyniki.
5. Komentarze z błędną składnią, jeśli występują, są celowo wyłączone z wykonywania.

## Przykłady z materiału

- `block3/Example01Comparisons.java`
- `block3/Example02Logical.java`
- `block3/Example03If.java`
- `block3/Example04IfElseChain.java`
- `block3/Example05Switch.java`
- `block3/Example06Ternary.java`


## Zadania

- `block3/LeapYear.java`
- `block3/LoginCheck.java`
- `block3/TicketPrice.java`

## Kompilacja terminalowa

```bash
mkdir -p out
find src -name "*.java" -print0 | xargs -0 javac --release 17 -encoding UTF-8 -d out
```

