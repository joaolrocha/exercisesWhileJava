//4. Programa em Java que calcula a média das notas de uma turma
//Escreva um programa que pergunte ao usuário quantos alunos tem na sala dele.
//Em seguida, através de um laço while, pede ao usuário para que entre com as notas de todos os alunos da sala, um por vez.


import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o numero de alunos: ");
        int alunos = sc.nextInt();
        int n = 1;


        while(n <= alunos ) {

            System.out.println("Nota AV1: ");
            double nota1 = sc.nextDouble();

            System.out.println("Nota AV2: ");
            double nota2 = sc.nextDouble();

            double media = (nota1 + nota2) / 2.0;

            System.out.println("Media do Aluno " + n + ": " +media  );

            n = n + 1;

        }
        sc.close();
    }
}
