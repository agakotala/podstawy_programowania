package block2;

/*
 * PRZYKŁAD 8 — POLE I OBWÓD PROSTOKĄTA
 *
 * Pole = width * height
 * Obwód = 2 * width + 2 * height
 *
 * Jeśli zmienimy width lub height, program obliczy wynik ponownie.
 *
 * OCZEKIWANY WYNIK:
 * Pole: 50.0
 * Obwód: 30.0
 */
public class Example09Rectangle {
    public static void main(String[] args) {
        double width = 10.0;
        double height = 5.0;
        double area = width * height;
        double perimeter = 2 * width + 2 * height;
        System.out.println("Pole: " + area);
        System.out.println("Obwód: " + perimeter);
    }
}
