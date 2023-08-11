import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);


        System.out.println("Please enter two numbers");
        int num1 = s.nextInt();
        int num2 = s.nextInt();


        System.out.println("Please enter two strings");
        String f1 = s.next();
        String f2 = s.next();


        if((f2.equals(f1)) && (num2 == num1)){
            System.out.println("AND");
        }else if((f2.equals(f1)) || (num2==num1)){
            System.out.println("OR");
        }else{
            System.out.println("NONE");
        }
    }
}