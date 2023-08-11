import java.util.Scanner;

public class T1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println(" Please enter two boolean");
        Boolean a=s.nextBoolean();
        Boolean b=s.nextBoolean();


            if (a.equals(b)&&!b.equals(a)) {
                    System.out.println("Looks like you need to drink Water");
                } else if (a.equals(b)&&a.equals(b)) {
                    System.out.println("Looks like you need to drink Coffee");
                } else if (!a.equals(b)&&a.equals(b)) {
                    System.out.println("Looks like you need to drink Tea");
                } else {
                    System.out.println("Nothing");
                }

    }
}
