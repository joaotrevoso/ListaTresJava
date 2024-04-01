package Exercicio15;
import java.util.Scanner;

public class Veiculo {


    public enum Combustivel{

        Gasolina,Diesel,Alcool

}


    public Veiculo(Double preco) {
        this.preco = preco;
        this.TipoCombustivel = TipoDoCombustivel();
    }

    private Double preco;

    private Double PrecoDesconto;

    private Combustivel TipoCombustivel;
     
    private Combustivel TipoDoCombustivel(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o Tipo de combustivel: ");
        String type = scanner.nextLine();

        if(type.equalsIgnoreCase("gasolina")){

            return Combustivel.Gasolina;

        }else if(type.equalsIgnoreCase("Alcool")){

            return Combustivel.Gasolina;

        }else{

        return Combustivel.Diesel;

        }


    }

        public Double getPreco() {
        return preco;
    }


    public void setPreco(Double preco) {
        this.preco = preco;
    }




    public Combustivel getTipoCombustivel() {
        return TipoCombustivel;
    }




    public void setTipoCombustivel(Combustivel tipoCombustivel) {
        TipoCombustivel = tipoCombustivel;
    }





}
