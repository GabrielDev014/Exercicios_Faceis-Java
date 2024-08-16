package loja;

public class Produto 
{
    public String nome;
    public String fabricante;
    public double valor;
    
    public String exibirProduto()
    {
        return "Produto Escolhido: " + nome + " Fabricante: " + fabricante + " Valor: " + valor + " Reais \n";
    }
}
