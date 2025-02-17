import java.util.Scanner;
public class Vowel {
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        char input=inp.next().toLowerCase().charAt(0);
        char[] arr={'a','e','i','o','u'};
        if (input=='a'||input=='e'||input=='i'||input=='o'||input=='u'){
            System.out.println("the given character is vowel");
        }else{
            System.out.println("Consonant");
        }

    }
}
