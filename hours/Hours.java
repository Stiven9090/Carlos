/* Cálculo del salario con horas extras: Pide las horas trabajadas y la tarifa por hora. Si las horas superan 40, las extras se pagan al 150% */

import java.util.Scanner;;
public class Hours {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double worksHours,tarifa,pago,payEX,Hours,hoursEx;
        System.out.println("Ingresa las trabajadas y la tarifa por hora");
        worksHours =input.nextInt();
        tarifa =input.nextInt();

        if ( worksHours <= 40){
            pago = worksHours * tarifa;
        }
        else{
            Hours = 40;
            hoursEx = worksHours - 40;
            pago = Hours * tarifa;
            payEX = hoursEx * tarifa * 1.5;
            pago = pago + payEX;

        }
        System.out.println("El pago total es :$" + pago);
        input.close();
    }
}
