/*
 * PRZYKŁAD — Rectangle
 * TEMAT 05: String, klasy, obiekty i metody
 *
 * CEL / OPIS:
 * Klasa Rectangle ilustruje kolejny praktyczny wariant pojęć opisanych w tym bloku.
 * Przyjrzyjmy się instrukcjom i powiązaniu wartości z wynikiem.
 *
 * JAK PRACOWAĆ:
 * - To klasa pomocnicza/model: może nie mieć własnej metody main.
 * - Przyjrzyj się polom, konstruktorom i metodom oraz użyj jej z innej klasy.
 *
 * PYTANIA KONTROLNE:
 * 1. Które dane należą do konkretnego obiektu?
 * 2. Czy metoda zmienia stan obiektu, czy zwraca wynik?
 * 3. Gdzie i dlaczego tworzymy instancję?
 *
 * ŹRÓDŁO: materiał do tematu 05, Przykład 7. Rectangle.
 */

package block5;

public class Rectangle {
    private double width;
    private double height;

    public Rectangle() {
        this(1.0, 1.0);
    }

    public Rectangle(double side) {
        this(side, side);
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double area() {
        return width * height;
    }
}
