package Exercicio14;
import java.util.Scanner;

public class LucroOrPrejuizo {

    public static void Produtos(){

        Double MediaPrecoCusto = 0D;

        Double MediaPrecoVenda = 0D;

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 40; i++) {
            
            System.out.println("Informe o Preco de Venda: ");
            Double precoVenda = scanner.nextDouble();

            MediaPrecoVenda += precoVenda;

            System.out.println("Informe o Preco de Custo: ");
            Double precoCusto = scanner.nextDouble();

            MediaPrecoCusto += precoCusto;

            Produto p = new Produto(precoVenda, precoCusto);

            String NameProduto = String.format("%dp ",i);

            IsLucro(p,NameProduto);
        }

        MediaPrecoCusto = MediaPrecoCusto / 40;

        MediaPrecoVenda = MediaPrecoVenda / 40;

        System.out.printf("Media preco venda: %.2f Media preco custo: %.2f ",MediaPrecoVenda,MediaPrecoCusto);

    }

    private static void IsLucro(Produto produto,String product){

        Double LucroOrPrejuizo = produto.getPrecoCusto() - produto.getPrecoVenda();

        if(LucroOrPrejuizo < 0 ){

            System.out.printf("Produto: %s deu prejuizo",product);

        }else{

            System.out.printf("Produto: %s deu lucro",product);

        }
    }

}
