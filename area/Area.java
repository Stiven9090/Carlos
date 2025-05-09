/* Área de un triangulo: solicita la base y la altura de un triángulo y calcula su área */

import java.util.Scanner;;
public class Area {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        float base,heigth,result;
        System.out.println("Ingresa la base y la altura: ");
        base =input.nextInt();
        heigth =input.nextInt();
        result = (base * heigth)/2;
        
        System.out.println("Result of addition is: " + result);
    input.close();

    }
    
}
