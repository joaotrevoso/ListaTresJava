package Exercicio12;

public class Carro12 {

    private double ValorCarro;

    private double ValorDesconto;

    private int ano;

    public double getValorCarro() {
        return ValorCarro;
    }

    public void setValorCarro(double valorCarro) {
        ValorCarro = valorCarro;
    }

    public double getValorDesconto() {
        return ValorDesconto;
    }

    public void setValorDesconto(double valorDesconto) {
        ValorDesconto = valorDesconto;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Carro12(double valorCarro, int ano) {
        ValorCarro = valorCarro;
        this.ano = ano;
        ValorDesconto();
    }

    private void ValorDesconto(){

        if(this.ano <= 2000){

            this.ValorDesconto =  ValorCarro * 0.12;

        }

        this.ValorDesconto = ValorCarro  * 0.07;

    }
    

}
