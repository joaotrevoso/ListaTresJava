package Exercicio7;

import java.util.Scanner;

public class CalcularValorVeiculo {

    public static void Calcular(){

        Scanner scanner = new Scanner(System.in);

        double ValorFabrica = 0;

        System.out.println("Informe o preco de fabrica do veiculo: ");
        ValorFabrica = scanner.nextDouble();

        CarroImposto carro = new CarroImposto(ValorFabrica);

        System.out.println("Valor final do carro: " + carro.CustoImpostos());

    }

}
