//1. Programa em Java que mostra os números ímpares
//   Escreva um aplicativo em Java mostra todos os números ímpares de 1 até 100.


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = 0;

        while (n < 100) {
            n = n + 1;
            if (n % 2 != 0) {
                System.out.println("numero impar " + n);
            }

        }

    }
}
