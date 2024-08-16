package registro_jogador;

import java.util.*;

public class Registro_Jogador {

    public static void main(String[] args) {
        Jogadores jogadorUm = new Jogadores("","","","",16, 1);
        Scanner info = new Scanner(System.in);
        System.out.println("Digite o nome do jogador:");
        jogadorUm.setNome(info.nextLine());
        System.out.println("Digite a posição do jogador:");
        jogadorUm.setPosicao(info.nextLine());
        System.out.println("Digite o time do jogador:");
        jogadorUm.setTime(info.nextLine());
        System.out.println("Digite a nacionalidade do jogador:");
        jogadorUm.setNacionalidade(info.nextLine());
        System.out.println("Digite a idade do jogador:");
        jogadorUm.setIdade(info.nextInt());
        System.out.println("Digite o número do uniforme do jogador: ");
        jogadorUm.setUniforme(info.nextInt());
        
        while (true) {
            Scanner entradaDados = new Scanner(System.in);
            System.out.println("\n Digite uma opcao do menu, sendo: \n [1] Relatório \n [2] Alterar Nome do Jogador \n [3] Alterar Posicao do Jogador \n [4] Alterar Time do Jogador \n [5] Alterar Nacionalidade do Jogador \n [6] Alterar Idade do Jogador \n [7] Alterar Número do Uniforme do Jogador \n ");
            
            int opcao = entradaDados.nextInt();
            
            if (opcao == 1) {
                System.out.println("" + jogadorUm.relatorioJogador());
            } else if (opcao == 2) {
                System.out.println("Altere o nome:");
                info.nextLine();
                jogadorUm.setNome(info.nextLine());
            } else if (opcao == 3) {
                System.out.println("Altere a posicao:");
                info.nextLine();
                jogadorUm.setPosicao(info.nextLine());
            } else if (opcao == 4) {
                System.out.println("Altere o time:");
                info.nextLine();
                jogadorUm.setTime(info.nextLine());
            } else if (opcao == 5) {
                System.out.println("Altere a nacionalidade:");
                info.nextLine();
                jogadorUm.setNacionalidade(info.nextLine());
            } else if (opcao == 6) {
                System.out.println("Altere a idade:");
                info.nextLine();
                jogadorUm.setIdade(info.nextInt());
            } else if (opcao == 7){
                System.out.println("Altere o número do uniforme:");
                info.nextLine();
                jogadorUm.setUniforme(info.nextInt());
            } else {
                System.out.println("Fim");
                break;
            }            
        }
    }
}

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
