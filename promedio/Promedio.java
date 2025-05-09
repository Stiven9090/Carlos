/*  Calculo del promedio de tres numeros: pide tres numeros e imprime su promedio*/

import java.util.Scanner;;
public class Promedio {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float num1,num2,num3,result;

        System.out.println("Ingresa tres numeros: ");
        num1 =input.nextInt();
        num2 =input.nextInt();
        num3 =input.nextInt();
        result =(num1 + num2 + num3)/3;

        System.out.println("Result is: " + result);
    input.close();


    }
    
}
