import java.util.Scanner;
public class Max {
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        int inp1=inp.nextInt();
        int inp2=inp.nextInt();
        int inp3=inp.nextInt();
        if (inp1 > inp2 && inp1 > inp3){
            System.out.println("Input 1 is greater: "+inp1);
        } else if (inp2 >inp3 && inp2 > inp1) {
            System.out.println("Input 2 is greater: "+inp2);
        }else{
            System.out.println("Input 3 is greater: "+inp3);
        }


    }
}
