import java.util.Scanner;
public class add2num {
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        int a=inp.nextInt();
        int b=inp.nextInt();
        int x=a+(~b+1);
        System.out.println(x);
    }
}
