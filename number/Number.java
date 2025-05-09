/* Numero par o impar: pide un numero entero y muestra si es par o impar*/

import java.util.Scanner;;
public class Number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        System.out.println("Ingresa el numero: ");
        num =input.nextInt();
        

        if (num % 2 == 0) {
            System.out.println("Is pair");
        }
        else{
            System.out.println("Is odd");
        }
        input.close();
    }
    
}
