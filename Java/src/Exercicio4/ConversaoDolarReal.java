package Exercicio4;
import java.util.Scanner;

public class ConversaoDolarReal {

    public static void Conversao(Dolar dolar,Real real){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o valor da cotacao do dolar: ");
        dolar.setCotacaoDolar(scanner.nextDouble());

        System.out.println("Informe a quantidade de dolares: ");
        dolar.setQuantidadeDolar(scanner.nextDouble());

        double reais = dolar.getCotacaoDolar() * dolar.getQuantidadeDolar();

        real.setQuantidadeReais(reais);

        System.out.printf("O total de reais e de: %.2f",real.getQuantidadeReais());

    }

}
