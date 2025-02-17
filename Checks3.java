import java.util.Scanner;
public class Checks3 {
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        int inp1= inp.nextInt();
        int inp2= inp.nextInt();
        int inp3= inp.nextInt();
        if (inp1==inp2 && inp2==inp3 && inp3==inp1){
            System.out.println("All are equal");
        }
        else if(inp1!=inp2 && inp2!=inp3 && inp3!=inp1){
            System.out.println("All numbers are different");
        }
        else{
            System.out.println("neither all are equal nor different ");
        }

    }
}
