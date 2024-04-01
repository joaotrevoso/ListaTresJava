package Exercicio10;

import java.util.Scanner;

public class CriarPessoaVerificarIdade {

    public static void GerarPessoa() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o numero de pessoas: ");
        int num = scanner.nextInt();

        for (int i = 0; i < num; i++) {

            System.out.println("Informe o nome: ");
            String nome = scanner.nextLine();

            System.out.println("Informe a idade: ");
            int idade = scanner.nextInt();

            Pessoa pessoa = new Pessoa(idade, nome);

            VerificarIdade(pessoa);

        }

    }

    private static void VerificarIdade(Pessoa pessoa) {

        if (pessoa.getIdade() >= 18) {

            System.out.println("Maior de idade ");

        } else {

            System.out.println("Menor de idade ");

        }

    }

}