import java.util.Scanner;
public class CubeofNum {
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        int n=inp.nextInt();
        for (int i=1;i<=n;i++){
            System.out.println("cube value is "+i*i*i);
        }
    }
}
