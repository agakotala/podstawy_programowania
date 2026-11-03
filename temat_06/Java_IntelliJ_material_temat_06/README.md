# Temat 06 — Static, final, dziedziczenie i zasięg


## Uruchamianie

1. Otwórz ten katalog projektu przez `File → Open` w IntelliJ IDEA.
2. Ustaw JDK 17 lub nowsze i oznacz katalog `src` jako Sources Root.
3. Otwórz wybrany plik i uruchom `main`. Niektóre klasy pomocnicze nie mają `main`.
4. Przykłady ze `Scanner` wymagają wpisania danych; przykłady z `Random` mają zmienne wyniki.
5. Komentarze z błędną składnią, jeśli występują, są celowo wyłączone z wykonywania.

## Przykłady z materiału

- `block6/Animal.java`
- `block6/Counter.java`
- `block6/Dog.java`
- `block6/Example01StaticInstance.java`
- `block6/Example02Inheritance.java`
- `block6/FinalDemo.java`
- `block6/ScopeLifetime.java`


## Zadania

- `block6/Car.java`
- `block6/Vehicle.java`


## Kompilacja terminalowa

```bash
mkdir -p out
find src -name "*.java" -print0 | xargs -0 javac --release 17 -encoding UTF-8 -d out
```
