package Exercicio5;
public class Compra {

    private double ValorCompra;

    public Compra(double valorCompra) {
        ValorCompra = valorCompra;
    }

    public double getValorCompra() {
        return ValorCompra;
    }

    public void setValorCompra(double valorCompra) {
        ValorCompra = valorCompra;
    }

    public double getParcelas() {
        return Parcelas;
    }

    public void setParcelas(double parcelas) {
        Parcelas = parcelas;
    }

    private double Parcelas;

}
