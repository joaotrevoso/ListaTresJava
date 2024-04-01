package Exercicio8;
import java.util.Scanner;

public class CalcularMediaAprovacao {

    public static void CalcularMediaAprovado(AlunoExercicio8 aluno){

        Scanner scanner = new Scanner(System.in);

        double media = 0;

        double array[] = aluno.getNotas();

        for (int i = 0; i < array.length; i++) {
            
            System.out.println("Informe a nota: ");
            array[i] = scanner.nextDouble();
            media += array[i];
        }

        media = media / 3;

        aluno.setMedia(media);

        IsAprovado(aluno.getMedia());

    }

    private static void IsAprovado(double nota){

        if(nota >= 7){

            System.out.println("Aprovado");

        }else if(nota >= 5.1 && nota < 6.9){

            System.out.println("Recuperacao");

        }else{

            System.out.println("Reprovado");

        }


    }

}
