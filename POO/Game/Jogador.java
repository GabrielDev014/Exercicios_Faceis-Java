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
