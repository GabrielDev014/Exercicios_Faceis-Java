package criarjogo;

public class CriarJogo 
{

    public static void main(String[] args) 
    {
        JogoSuposicoes meuJogo = new JogoSuposicoes();
        meuJogo.iniciarJogo();
    }
}
package criarjogo;

public class JogoSuposicoes 
{
    Jogador marcelo;
    Jogador eliane;
    Jogador pedro;
    
    public void iniciarJogo()
    {
        marcelo = new Jogador();
        eliane = new Jogador();
        pedro = new Jogador();
        
        int suposicaoUm = 0;
        int suposicaoDois = 0;
        int suposicaoTres = 0;
        
        int numeroAlvo = 2;
        
        int contador = 1;
        
        while (contador <= 2)
        {
            boolean mEstaCerto = false;
            boolean eEstaCerto = false;
            boolean pEstaCerto = false;
            System.out.println("\n O número a ser adivinhado é... " + numeroAlvo + "\n");
            
            marcelo.palpite();
            eliane.palpite();
            pedro.palpite();
            
            suposicaoUm = marcelo.numero;
            System.out.println("\n O jogador um forneceu o número.... " + suposicaoUm);
            suposicaoDois = eliane.numero;
            System.out.println(" O jogador dois forneceu o número.... " + suposicaoDois);
            suposicaoTres = pedro.numero;
            System.out.println(" O jogador três forneceu o número.... " + suposicaoTres + "\n");
            
            if (suposicaoUm == numeroAlvo)
            {
                mEstaCerto = true;
                System.out.println("Jogador um acertou! " + mEstaCerto);
            }
            if (suposicaoDois == numeroAlvo)
            {
                eEstaCerto = true;
                System.out.println("Jogador dois acertou! " + eEstaCerto);
            }
            if (suposicaoTres == numeroAlvo)
            {
                pEstaCerto = true;
                System.out.println("Jogador três acertou!" + pEstaCerto);
            }
            if (mEstaCerto && eEstaCerto && pEstaCerto)
            {
                System.out.println("Os três jogadores acertaram!");
            }
            if ((suposicaoUm != numeroAlvo) && (suposicaoDois != numeroAlvo) && (suposicaoTres != numeroAlvo))
            {
                System.out.println("Os três jogadores erraram!");
            }
            contador = contador + 1;
        }
    }
}
package criarjogo;

public class Jogador 
{
    int numero = 0;
    public void palpite()
    {
        numero = (int) (Math.random() * 3);
        System.out.println("Estou pensando no número....." + numero);
    }
}
