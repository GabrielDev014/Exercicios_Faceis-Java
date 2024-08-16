package registro_jogador;

public class Jogadores {

    private String nome;
    private String posicao;
    private String time;
    private String nacionalidade;
    private int idade;
    private int uniforme;

    public Jogadores(String nome, String posicao, String time, String nacionalidade, int idade, int uniforme) {
        this.setNome(nome);
        this.setPosicao(posicao);
        this.setTime(time);
        this.setNacionalidade(nacionalidade);
        this.setIdade(idade);
        this.setUniforme(uniforme);
    }

    public String getNome() {
        return nome;
    }

    public String getPosicao() {
        return posicao;
    }

    public String getTime() {
        return time;
    }
    
    public String getNacionalidade() {
        return nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public int getUniforme() {
        return uniforme;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public void setTime(String time) {
        this.time = time;
    }
    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public void setIdade(int idade) {
        if (idade > 15 && idade < 61) {
            this.idade = idade;
        } else {
            System.out.println("Idade inválida. O intervalo deve estar entre 16 e 60 anos ");
            this.idade = 0;
        }
    }

    public void setUniforme(int uniforme) {
        if (uniforme > 0 && uniforme < 100) {
            this.uniforme = uniforme;
        } else {
            System.out.println("Número de uniforme inválido, o intervalo deve estar entre 1 e 99");
            this.uniforme = 0;
        }
    }

    public String relatorioJogador() {
        return "\n Nome do Jogador: " + getNome() + " \n Posição do Jogador: " + getPosicao() + " \n Time do Jogador: " + getTime() + " \n Nacionalidade do Jogador: " + getNacionalidade() + "\n Idade do Jogador: " + getIdade() + " anos " + " \n Número do uniforme: " + getUniforme() + "\n";
    }
}
