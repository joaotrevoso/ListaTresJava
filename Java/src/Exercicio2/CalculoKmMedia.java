package Exercicio2;
import java.util.Scanner;

public class CalculoKmMedia {

    public static void CalcularMedia(Automovel automovel){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a quantidade de KM rodados: ");
        automovel.setDistanciaTotal(scanner.nextDouble());

        System.out.println("Informe a quantidade de combustivel gasto: ");
        automovel.setCombustivelGasto(scanner.nextDouble());

        double KmPorLitro = automovel.getDistanciaTotal() / automovel.getCombustivelGasto();

        automovel.setKMPorLitro(KmPorLitro);

        System.out.printf("\nA media do veiculo e de: %.2f",automovel.getKMPorLitro());

    }

}
