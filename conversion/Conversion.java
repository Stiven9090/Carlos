/* Conversión de grados celsius a fahrenhet: pide una temperatua en grados celsius y muestra su equivalente en fahrenheit usando la formula F = C * 9/5 + 32 */
import java.util.Scanner;;
public class Conversion {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        float celsius,f;
        System.out.println("Ingresa una temperatura en grados celsius: ");
        celsius =input.nextInt();
        f= (celsius * 9 / 5) + 32;

    System.out.println("Result is: " + f);
    input.close();
    }
}