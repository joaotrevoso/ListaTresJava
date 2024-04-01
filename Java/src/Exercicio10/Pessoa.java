 package Exercicio10;

public class Pessoa {

    private String Nome;

    private int Idade;

    public Pessoa(int idade,String nome){

        this.Idade = idade;
        this.Nome = nome;

    }

    public int getIdade() {
        return Idade;
    }

    public String getNome() {
        return Nome;
    }

    public void setIdade(int idade) {
        Idade = idade;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

}


    
