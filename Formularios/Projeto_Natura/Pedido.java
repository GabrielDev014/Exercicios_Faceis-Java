package usarformpedido;

/*A classe 'Produto' torna-se uma super classe, e a classe´pedido herda tudo
da super classe*/
public class Pedido extends Produto 
{
    //Criando atributo da classe 'Produto'
    private int quantidade;
    
    //Criando construtor, que desta vez herda os atributos da super classe.
    public Pedido (int quantidade, String nome, String tipoProduto, String codigoProduto,double valor)
    {
        //Atributos da super classe
        super(nome, tipoProduto, codigoProduto, valor);
        //Atributo de 'Pedido'
        this.quantidade = quantidade;
    }
    //Criando método de captura
    public int getQuantidade()
    {
        return quantidade;
    }
    //Criando método de gravação
    public void setQuantidade(int quantidade)
    {
        this.quantidade = quantidade;
    }
    
    /*Sobrescrevendo o método realizarPedido, porque agora é preciso considerar
    a quantidade*/
    @Override
    public String realizarPedido()
    {
        /* Se o código do produto for igual a 1065 e a quantidade entre valores
        de 1 a 20, este bloco é executado*/
        if (getCodigoProduto().equals("1065"))
        {
            if (quantidade > 0 && quantidade < 21)
            {
                return super.realizarPedido() + "\n Quantidade: " + this.quantidade;
            }
            /* Se o código for igual a 1065 e a quantidade menor que 0 e maior 
            do que 20, então este bloco é executado*/
            else
            {
                return "Selecione entre 1 e 20 unidades ";
            }
        }
        else
        {
            /*Se o código é diferente de 1065 este bloco é executado, e a 
            quantidade é zerada pois entende-se que o produto não está no estoque*/
            return super.realizarPedido() + "\n Quantidade: 0";
        }
    }
}
