package Exercicio14;
public class Produto {

    private Double precoVenda;

    private Double precoCusto;

    public Double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(Double precoVenda) {
        this.precoVenda = precoVenda;
    }

    public Double getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(Double precoCusto) {
        this.precoCusto = precoCusto;
    }

    public Produto(Double precoVenda, Double precoCusto) {
        this.precoVenda = precoVenda;
        this.precoCusto = precoCusto;
    }

    

}
