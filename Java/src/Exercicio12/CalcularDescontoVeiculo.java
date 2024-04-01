package Exercicio12;

import java.util.Scanner;

public class CalcularDescontoVeiculo {

    public static void CalcularDescontos(){

        String Continuar;
        double valorVeiculo;
        int AnoVeiculo;

        Scanner scanner = new Scanner(System.in);

        do{

            System.out.println("Informe o Valor do Veiculo: ");
            valorVeiculo = scanner.nextDouble();

            System.out.println("Informe o ano do veiculo: ");
            AnoVeiculo = scanner.nextInt();

            Carro12 carro = new Carro12(valorVeiculo, AnoVeiculo);

            System.out.printf("\nValor com desconto: %.2f valor do desconto: %.2f",carro.getValorCarro() - carro.getValorDesconto(),carro.getValorDesconto());

            System.out.println("Deseja continuar: (Sim) / (Nao) ");
            Continuar = scanner.nextLine();


        }while(Continuar.equalsIgnoreCase("Nao"));

    }


}
