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
