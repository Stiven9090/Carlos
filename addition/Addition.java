/* Suma de dos numeros: solicita dos numeros al usuario e imprime la suma*/

import java.util.Scanner;;
public class Addition {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int num1,num2,result;
        System.out.println("Ingresa dos numeros: ");
        num1 =input.nextInt();
        num2 =input.nextInt();
        result= num1 + num2;

    System.out.println("Result of addition is: " + result);
    input.close();
    

    }

 }