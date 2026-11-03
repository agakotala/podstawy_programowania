# Temat 05 — String, klasy, obiekty i metody


## Uruchamianie

1. Otwórz ten katalog projektu przez `File → Open` w IntelliJ IDEA.
2. Ustaw JDK 17 lub nowsze i oznacz katalog `src` jako Sources Root.
3. Otwórz wybrany plik i uruchom `main`. Niektóre klasy pomocnicze nie mają `main`.
4. Przykłady ze `Scanner` wymagają wpisania danych; przykłady z `Random` mają zmienne wyniki.
5. Komentarze z błędną składnią, jeśli występują, są celowo wyłączone z wykonywania.

## Przykłady z materiału

- `block5/BankAccount.java`
- `block5/Example01StringOperations.java`
- `block5/Example02ClassAndObject.java`
- `block5/Example03Overloading.java`
- `block5/MathHelper.java`
- `block5/Person.java`
- `block5/Rectangle.java`


## Zadania

- `block5/Product.java`


## Kompilacja terminalowa

```bash
mkdir -p out
find src -name "*.java" -print0 | xargs -0 javac --release 17 -encoding UTF-8 -d out
```
