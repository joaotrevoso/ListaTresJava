package Exercicio1;
public class Aluno {

    private String nome;

    private int Notas[] = new int[3];

    private int media = 0;

    
    public int getMedia() {
        return media;
    }

    public void setMedia(int media) {
        this.media = media;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int[] getNotas() {
        return Notas;
    }

    public void setNotas(int[] notas) {
        Notas = notas;
    }


    

}
