/*
 * PRZYKŁAD — BankAccount
 * TEMAT 05: String, klasy, obiekty i metody
 *
 * CEL / OPIS:
 * Analizujemy przykład konta, którego saldo powinno być zmieniane przez kontrolowane
 * metody.
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
 * ŹRÓDŁO: materiał do tematu 05, Przykład 6. BankAccount.
 */

package block5;

public class BankAccount {
    private final String owner;
    private double balance;

    public BankAccount(String owner) {
        this(owner, 0.0);
    }

    public BankAccount(String owner, double initialBalance) {
        this.owner = owner;
        if (initialBalance < 0) {
            throw new IllegalArgumentException("Saldo początkowe nie może być ujemne");
        }
        this.balance = initialBalance;
    }

    public String getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Wpłata musi być dodatnia");
        }
        balance += amount;
    }

    public boolean withdraw(double amount) {
        if (amount <= 0 || amount > balance) {
            return false;
        }
        balance -= amount;
        return true;
    }
}
