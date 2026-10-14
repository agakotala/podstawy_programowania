package block2;
/* ZADANIE 14 — Mystery
 * Najpierw przewidź wynik, potem uruchom. Zwróć uwagę na kolejność działań, a++ i b+=4. */
public class Mystery { public static void main(String[] args) { int a=5; int b=2; int c=a+b*3; a++; b+=4; System.out.println(a); System.out.println(b); System.out.println(c); } }
