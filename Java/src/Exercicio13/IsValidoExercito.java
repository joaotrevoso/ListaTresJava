package Exercicio13;
import java.util.Scanner;

public class IsValidoExercito {

    public static void PessoaAlistamento(){

        Scanner scanner = new Scanner(System.in);


        System.out.println("Informe a quantidade de pessoas: ");
        int quantPessoas = scanner.nextInt();

        for (int i = 0; i < quantPessoas; i++) {
            

        System.out.println("Informe o nome: ");
        String nome = scanner.nextLine();

        System.out.println("Informe o sexo: ");
        String sexo = scanner.nextLine();

        System.out.println("Informe a idade: ");
        int idade = scanner.nextInt();

        System.out.println("Informe a saude (Saudavel ou Nao Saudavel): ");
        String saude = scanner.nextLine();

            Pessoa p = new Pessoa(nome, sexo, idade, saude);
            
        ValidoExercito(p);

        }
        scanner.close();

    }

    private static void ValidoExercito(Pessoa pessoa){

        if(pessoa.getSaude().equalsIgnoreCase("saudavel") && pessoa.getIdade() >= 18){

            System.out.printf("%s esta Valido ao alistamento",pessoa.getNome());

        }else{

            System.out.printf("%s Nao esta valido ao alistamento",pessoa.getNome());

        }


    }
}
