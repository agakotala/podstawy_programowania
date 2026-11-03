# Temat 10 — Pakiety, wyjątki i kolekcje


## Uruchamianie

1. Otwórz ten katalog projektu przez `File → Open` w IntelliJ IDEA.
2. Ustaw JDK 17 lub nowsze i oznacz katalog `src` jako Sources Root.
3. Otwórz wybrany plik i uruchom `main`. Niektóre klasy pomocnicze nie mają `main`.
4. Przykłady ze `Scanner` wymagają wpisania danych; przykłady z `Random` mają zmienne wyniki.
5. Komentarze z błędną składnią, jeśli występują, są celowo wyłączone z wykonywania.

## Przykłady z materiału

- `block10/Example01EnhancedFor.java`
- `block10/Example02TryCatch.java`
- `block10/Example03Finally.java`
- `block10/Example04Throw.java`
- `block10/Example05ArrayList.java`
- `block10/Example06HashSet.java`
- `block10/Example07HashMap.java`
- `block10/Example08ArrayDeque.java`
- `block10/PackageImportDemo.java`


## Zadania

- `block10/SafeDivision.java`


## Kompilacja terminalowa

```bash
mkdir -p out
find src -name "*.java" -print0 | xargs -0 javac --release 17 -encoding UTF-8 -d out
```
