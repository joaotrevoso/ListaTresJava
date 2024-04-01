package Exercicio7;

public class CarroImposto {

    private double CustoDeFabrica;

    public CarroImposto(double custoDeFabrica) {
        CustoDeFabrica = custoDeFabrica;
    }

    public double CustoImpostos(){

        double impostos = 0;

        impostos = (CustoDeFabrica * 45 / 100) * 28 / 100;

        return impostos;


    }

}
