# Temat 02 — Konwersje typów, promocja i przepełnienie

## Uruchamianie

1. Otwórz ten katalog projektu przez `File → Open` w IntelliJ IDEA.
2. Ustaw JDK 17 lub nowsze i oznacz katalog `src` jako Sources Root.
3. Otwórz wybrany plik i uruchom `main`. Niektóre klasy pomocnicze nie mają `main`.
4. Przykłady ze `Scanner` wymagają wpisania danych; przykłady z `Random` mają zmienne wyniki.
5. Komentarze z błędną składnią, jeśli występują, są celowo wyłączone z wykonywania.


1. `LiteralBases.java` – tylko nowe postaci zapisu liczby.
2. `Example15Widening.java` – konwersja rozszerzająca i dokładność.
3. `Example16Narrowing.java` oraz `CastingEdgeCases.java` – rzutowania i zakresy.
4. `DivisionPrecision.java` – typ wyrażenia i dzielenie.
5. `Example17NumericPromotion.java` – promocja typów.
6. `IntegerOverflow.java` – przepełnienie `int` przed przypisaniem do `long`.
7. `Example14Literals.java` – **opcjonalne przypomnienie** znanych typów z Lab 2.
8. `LiteralPractice.java`, `CastingPractice.java` – ćwiczenia dodatkowe A i B.


## Przykłady z materiału

- `block2extra/CastingEdgeCases.java`
- `block2extra/DivisionPrecision.java`
- `block2extra/IntegerOverflow.java`
- `block2extra/Example14Literals.java`
- `block2extra/Example15Widening.java`
- `block2extra/Example16Narrowing.java`
- `block2extra/Example17NumericPromotion.java`
- `block2extra/LiteralBases.java`


**Zadania 1–5 są opisane w PDF.** Pliki `LiteralPractice.java` i `CastingPractice.java`
to ćwiczenia dodatkowe A i B, wykonywane po zadaniach z PDF.


## Zadania

- `block2extra/CastingPractice.java`
- `block2extra/LiteralPractice.java`


## Kompilacja terminalowa

```bash
mkdir -p out
find src -name "*.java" -print0 | xargs -0 javac --release 17 -encoding UTF-8 -d out
```


