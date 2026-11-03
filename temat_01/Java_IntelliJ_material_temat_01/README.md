# Temat 01 — Kompilacja, bajtkod, JVM i JIT


## Uruchamianie

1. Otwórz ten katalog projektu przez `File → Open` w IntelliJ IDEA.
2. Ustaw JDK 17 lub nowsze i oznacz katalog `src` jako Sources Root.
3. Otwórz wybrany plik i uruchom `main`. Niektóre klasy pomocnicze nie mają `main`.
4. Przykłady ze `Scanner` wymagają wpisania danych; przykłady z `Random` mają zmienne wyniki.
5. Komentarze z błędną składnią, jeśli występują, są celowo wyłączone z wykonywania.


1. `Demo.java` – tylko kompilacja `javac` i uruchomienie `java`, bez ponownej nauki `main`.
2. `block1extra/CompilationStages.java` – analiza bajtkodu przez `javap -c`.
3. `block1extra/ToolchainExperiment.java` – porównanie uruchamiania w IDE i terminalu.
4. `block1extra/RuntimeEnvironment.java` – kontrola środowiska JVM.
5. `Arguments.java` – argumenty startowe, a następnie dwa ćwiczenia dodatkowe oznaczone A i B.

**Ważne – pakiety IntelliJ:** `CompilationStages.java` ma `package block1extra;`, dlatego musi znajdować się w folderze `src/block1extra/`. Folder `src` oznacz jako Sources Root.

**Komendy dla tego projektu (w katalogu projektu):**

```bash
javac -encoding UTF-8 -d out src/block1extra/CompilationStages.java
java -cp out block1extra.CompilationStages
javap -classpath out -c block1extra.CompilationStages
```


## Przykłady z materiału

- `Arguments.java`
- `Demo.java`
- `block1extra/CompilationStages.java`
- `block1extra/RuntimeEnvironment.java`
- `block1extra/ToolchainExperiment.java`


**Zadania 1–5 są opisane w PDF.** Pliki `BytecodeQuestions.java` i `PlatformReport.java`
to niezależne ćwiczenia dodatkowe A i B, odpowiednio po zadaniach 1 i 2.


## Zadania

- `block1extra/BytecodeQuestions.java`
- `block1extra/PlatformReport.java`

## Kompilacja terminalowa

```bash
mkdir -p out
find src -name "*.java" -print0 | xargs -0 javac --release 17 -encoding UTF-8 -d out
```


