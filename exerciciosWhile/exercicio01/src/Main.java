import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int password = sc.nextInt();

        while (password != 2002) {
            System.out.println(" Acess Denied");
            password = sc.nextInt();
        }

        System.out.println(password + " Password Accepted ");


        sc.close();

    }
}
