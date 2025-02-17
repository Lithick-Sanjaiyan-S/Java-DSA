import java.util.Scanner;

public class area {
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        System.out.println("length:");
        int length= inp.nextInt();
        System.out.println("breadth:");
        int breadth= inp.nextInt();
        System.out.println("AREA:"+length*breadth);

    }
}
