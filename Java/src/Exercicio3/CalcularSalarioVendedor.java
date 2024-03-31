package Exercicio3;
import java.util.Scanner;

public class CalcularSalarioVendedor {

    public static void GerarVendedorCalcularSalario(Vendedor vendedor){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o nome do vendedor: ");
        vendedor.setNome(scanner.nextLine());

        System.out.println("Informe o salario fixo do vendedor: ");
        vendedor.setSalarioFixo(scanner.nextDouble());

        System.out.println("Informe o total de vendas do Vendedor: ");
        vendedor.setTotalVendasMes(scanner.nextDouble());

        double SalarioComissao = vendedor.getSalarioFixo() + (vendedor.getTotalVendasMes() * 0.15);

        vendedor.setSalarioComissao(SalarioComissao);

        System.out.printf("Vendedor: %s recebe : %.2f De Salario Com comissao",vendedor.getNome(),vendedor.getSalarioComissao());


    }

}
