/* Calculo de la hipotenusa: Solicita los catetos de un triángulo rectángulo y calcula la hipotenusa usando el teorema de Pitágoras */

import java.util.Scanner;;
public class Hipotenusa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double cat1,cat2,addition,hipotenusa;
        System.out.println("Ingresa el cateto 1 y 2: ");
        cat1 =input.nextDouble();
        cat2 =input.nextDouble();
        
        cat1 = cat1 * cat1;
        cat2 = cat2 * cat2;
        addition = cat1 + cat2;
        hipotenusa =Math.sqrt(addition);

        System.out.println("Teorema de pitagoras: ");
        System.out.println("H = " + cat1 + " + " + cat2);
        System.out.println("H = " + addition );
        System.out.println("H = v/" +addition);
        System.out.println("La hipotenusa H =" + hipotenusa);
    input.close();
}
}