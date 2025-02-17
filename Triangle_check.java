import java.util.Scanner;
public class Triangle_check {
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        int side1=inp.nextInt();
        int side2=inp.nextInt();
        int side3=inp.nextInt();
        if (side1+side2>=side3 && side2+side3>=side1 && side1+side3>=side2){

         if (side1 == side2 && side2 == side3){
             System.out.println("This is a Equilateral triangle");
         }else if(side1 == side2 || side2 == side3 || side1 == side3 ){
             System.out.println("this is a Isosceles triangle");
         }
         else if((side1*side1)+(side2*side2)==side3*side3 ||(side2*side2)+(side3*side3)==side1*side1 || (side1*side1)+(side3*side3)==side2*side2){
             System.out.println("This is a right angled triangle");
            }else{
             System.out.println("This is a Scalene triangle");
         }}else {
            System.out.println("Not a valid triangle");
        }
    }
}
