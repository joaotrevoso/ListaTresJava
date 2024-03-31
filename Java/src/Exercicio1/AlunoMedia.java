package Exercicio1;
import java.lang.reflect.Array;
import java.util.Scanner;

public class AlunoMedia {

    public static void ExibirMedia(Aluno aluno){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o nome do aluno: ");
        aluno.setNome(scanner.nextLine());

        int array[] = aluno.getNotas();

        System.out.println();

        int notaMedia = 0;

        for (int i = 0; i < array.length; i++) {
            
            System.out.println("Informe a nota: ");

            array[i] = scanner.nextInt();

            notaMedia += array[i];

        }

        aluno.setMedia(notaMedia / 3);

        System.out.printf("Nota Media Do ALuno: %d",aluno.getMedia());




    }

}
