import java.util.Scanner;

public class Celcius {
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        System.out.println("Celcius:");
        int Cel= inp.nextInt();
        double b=(9.0/5 * Cel)+32;
        System.out.println("Fahrenheit:"+b);
    }
}
