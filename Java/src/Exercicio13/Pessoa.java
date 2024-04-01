package Exercicio13;
public class Pessoa {

    private String nome;

    private String sexo;

    private int Idade;

    private String Saude;

    public Pessoa(String nome, String sexo, int idade, String saude) {
        this.nome = nome;
        this.sexo = sexo;
        Idade = idade;
        Saude = saude;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return Idade;
    }

    public void setIdade(int idade) {
        Idade = idade;
    }

    public String getSaude() {
        return Saude;
    }

    public void setSaude(String saude) {
        Saude = saude;
    }

    

}
