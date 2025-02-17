import java.util.Scanner;
public class Steelgrading {
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        int hardness=inp.nextInt();
        float Carbon=inp.nextFloat();
        int tensile=inp.nextInt();
        boolean hard=false;
        boolean carb=false;
        boolean tens=false;
        if (hardness>50){
            hard=true;
        }
        if (Carbon<0.7){
            carb=true;
        }
        if (tensile>5600){
            tens=true;
        }
        if (hard && carb && tens){
            System.out.println("Grade : 10");
        } else if (hard && carb) {
            System.out.println("Grade: 9");
        } else if (carb && tens) {
            System.out.println("Grade :7");
        } else if (hard || carb || tens) {
            System.out.println("Grade:6");
        }else{
            System.out.println("Grade:5");
        }
    }
}
