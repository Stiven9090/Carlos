/* Intercambio de dos valores entre dos variables: Lee dos valores e intercambialos sin usar una tercera variable */

import java.util.Scanner;;
public class Intercambio {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1,num2;
        System.out.println("Ingresa el primer numero y el segundo numero: ");
        num1 =input.nextInt();
        num2 =input.nextInt();

        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        System.out.println("Valores inntercambiados");
        System.out.println("a = " + num1);
        System.out.println("b = " + num2);

        input.close();

    }
    
}
