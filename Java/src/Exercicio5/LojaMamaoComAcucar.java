package Exercicio5;
public class LojaMamaoComAcucar {

    private static final int QuantiadePrestacoes = 5;

    public static void CalcularPrestacoes(Compra compra){

        double parcela = compra.getValorCompra() / QuantiadePrestacoes;

        compra.setParcelas(parcela);

        System.out.println("A parcela vai ficar : " + compra.getParcelas());

    }

}
