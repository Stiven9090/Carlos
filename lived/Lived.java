/* Cálculo del numero de dias vividos: Pide la edad de una persona en años y muestra un estimado de cuántos días ha vivido (ignorando años bisiestos para simplificar*/
import java.util.Scanner;;
public class Lived {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age,daysLived;
        System.out.println("Ingresa tu edad");
        age =input.nextInt();
        daysLived = age * 365;

        System.out.println("Tus dias vividos son:" + daysLived);
    input.close();
    }
    
}
