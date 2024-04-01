package Exercicio15;
import java.util.Scanner;

public class DescontoVeiculo {

    public static void GerarDesconto(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do veiculo: ");
        Double ValorVeiculo = scanner.nextDouble();

        Veiculo veiculo = new Veiculo(ValorVeiculo);

        Double desconto = ValorDesconto(veiculo);

        System.out.printf("Valor do veiculo: %.2f Valor descontado: %.2f",veiculo.getPreco() - desconto,desconto);

}

    private static Double ValorDesconto(Veiculo veiculo){

        if(veiculo.getTipoCombustivel().equals(veiculo.getTipoCombustivel().Alcool)){

            return (veiculo.getPreco()) - veiculo.getPreco() * 0.25;

        }else if(veiculo.getTipoCombustivel().equals(veiculo.getTipoCombustivel().Diesel)){


            return (veiculo.getPreco()) - veiculo.getPreco() * 0.14;

        }else{


            return (veiculo.getPreco()) - veiculo.getPreco() * 0.21;

        }

    }

}
