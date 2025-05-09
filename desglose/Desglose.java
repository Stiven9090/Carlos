/* Desglose de una cantidad de billetes: Dado un onton en dinero ej($386), muestra cuántos biletes de 100, 0, 20, 10,5 y 1 se necesitan  */

import java.util.Scanner;;
public class Desglose {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cantidad,billete100,billete50,billete20,billete10,billete5,billete1;
        System.out.println("Ingresa una cantidad");
        cantidad =input.nextInt();

        billete100 = cantidad / 100;
        cantidad %= 100;

        billete50 = cantidad / 50;
        cantidad %=50;

        billete20 = cantidad / 20;
        cantidad %=20;

        billete10 = cantidad / 10;
        cantidad %=10;

        billete5 = cantidad / 5;
        cantidad %=5;

        billete1 = cantidad;

        System.out.println("Desglose de billetes ");
        System.out.println("Billetes de 100 :" + billete100);
        System.out.println("Billetes de 50 :" + billete50);
        System.out.println("Billetes de 20 :" + billete20);
        System.out.println("Billetes de 10 :" + billete10);
        System.out.println("Billetes de 5 :" + billete5);
        System.out.println("Billetes de 1 :" + billete1);
input.close();
    
    }
    
}
