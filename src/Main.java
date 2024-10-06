//Atividade01

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("nome do aluno: ");
        String nome = input.nextLine();

        System.out.println("Digite a primeira nota: ");
        double nota1 = input.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double nota2 = input.nextDouble();

        System.out.println("Digite a terceira nota: ");
        double nota3 = input.nextDouble();

        double media = (nota1 + nota2 + nota3) /3;

        System.out.println("Aluno:" + nome);
        System.out.printf("Média: %.2f%n", media);

        if (media >=7) {
            System.out.println("Aprovado");
        }else if (media <4) {
            System.out.println("Reprovado");
        }else{
            System.out.println("Final");

        }
    }
}