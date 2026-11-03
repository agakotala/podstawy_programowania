package block1extra;

/*
 * ĆWICZENIE DODATKOWE B — informacje o środowisku
 * Rozwinięcie Zadania 2 z PDF; nie jest to „Zadanie 3” z instrukcji.
 *
 * 1. Uruchom program i odczytaj nazwę systemu operacyjnego.
 * 2. W miejscach TODO wyświetl dodatkowo os.version, java.version i user.dir.
 * 3. Porównaj wyniki z przykładem RuntimeEnvironment i objaśnij,
 *    które właściwości mogą różnić się między komputerami.
 * Wartości zależą od systemu i środowiska uruchomieniowego.
 */
public class PlatformReport {
    public static void main(String[] args) {
        System.out.println("System: " + System.getProperty("os.name"));
        // TODO 1: wypisz właściwość os.version.
        // TODO 2: wypisz właściwość java.version.
        // TODO 3: wypisz katalog roboczy user.dir.
    }
}
