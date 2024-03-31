package Exercicio6;
import java.util.Scanner;

public class CalcularValorCusto {

    public static void PrecoCusto(Produto produto){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o valor de Acrescimo: ");
        double percentualAcrescimo = scanner.nextDouble();

        double valorCusto = produto.getValorVenda() + (produto.getValorVenda() * percentualAcrescimo);

        produto.setValorCusto(valorCusto);

        System.out.printf("Valor de custo do produto: %.2f",produto.getValorCusto());


    }

}
