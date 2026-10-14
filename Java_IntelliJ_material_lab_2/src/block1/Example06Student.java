package block1;

/*
 * PRZYKŁAD 5 — KILKA TYPÓW DANYCH
 *
 * String name = "Anna";   -> tekst, typ referencyjny
 * int age = 20;           -> liczba całkowita
 * double average = 4.25;  -> liczba z częścią ułamkową
 * char group = 'A';       -> na tym etapie: pojedynczy znak
 * boolean student = true; -> wartość logiczna true/false
 *
 * int, double, char i boolean są typami prostymi (primitive types).
 * String jest klasą, a typ String jest typem referencyjnym.
 *
 * "Imię: " + name wykonuje konkatenację tekstu.
 *
 * OCZEKIWANY WYNIK:
 * Imię: Anna
 * Wiek: 20
 * Średnia: 4.25
 * Grupa: A
 * Student: true
 *
 * PYTANIA KONTROLNE:
 * 1. Dlaczego age jest int?
 * 2. Dlaczego average jest double?
 * 3. Czym różnią się 'A' i "A"?
 * 4. Dlaczego true nie zapisujemy w cudzysłowach?
 */
public class Example06Student {
    public static void main(String[] args) {
        String name = "Anna";
        int age = 20;
        double average = 4.25;
        char group = 'A';
        boolean student = true;

        System.out.println("Imię: " + name);
        System.out.println("Wiek: " + age);
        System.out.println("Średnia: " + average);
        System.out.println("Grupa: " + group);
        System.out.println("Student: " + student);
    }
}
