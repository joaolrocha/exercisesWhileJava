//3. Programa em Java que mostra os números pares e ímpares
//Escreva um aplicativo em Java que recebe inteiro e mostra os números pares e ímpares (separados), de 1 até esse inteiro.

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = 0;
        int z = sc.nextInt();

        while (n < z) {
            n = n + 1;
            if (n % 2 == 0) {

                System.out.println("É numero par: " + n );
            } else
                System.out.println("É numero impar: " + n);

        }
    }
}
