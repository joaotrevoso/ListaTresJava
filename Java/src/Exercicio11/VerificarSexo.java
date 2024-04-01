package Exercicio11;

import java.util.Scanner;

public class VerificarSexo {

    public static void VerificarSexo() {

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 2; i++) {

            System.out.println("Informe o nome da pessoa: ");
            String nome = scanner.nextLine();

            System.out.println("Informe o sexo da pessoa: ");
            String sexo = scanner.nextLine();

            Pessoa pessoa = new Pessoa(nome, sexo);

            ChecarSexo(pessoa);

        }

    }

    private static void ChecarSexo(Pessoa pessoa) {

        if (pessoa.getSexo().equalsIgnoreCase("Masculino")) {

            System.out.printf("O:%s e: Homem ",pessoa.getNome());

        }else{

            System.out.printf("A: %s e : Mulher ",pessoa.getNome());

        }

    }

}
