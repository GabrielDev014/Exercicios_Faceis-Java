package usarformpedido;

public class Produto 
{
    //Criando os atributos da classe Produto
    private String nome;
    private String tipoProduto;
    private String codigoProduto;
    private double valor;
    
    //Criando o construtor para tornar funcional os atributos da classe
    public Produto (String nome, String tipoProduto, String codigoProduto, double valor)
    {
        this.nome = nome;
        this.tipoProduto = tipoProduto;
        this.codigoProduto = codigoProduto;
        this.valor = valor;
    }
    
    //Criando método de "captura"(pegar) no meu código, posso acioná-lo quando necessário
    public String getNome()
    {
        return nome;
    }
    //Criando método que grava as informações do atributo
    public void setNome (String nome)
    {
        this.nome = nome;
    }
    //Criando método de captura
    public String getTipoProduto()
    {
        return tipoProduto;
    }
    //Criando método de gravação
    public void setTipoProduto(String tipoProduto)
    {
        this.tipoProduto = tipoProduto;
    }
    //Criando método de captura
    public String getCodigoProduto()
    {
        return codigoProduto;
    }
    //Criando método de gravação
    public void setCodigoProduto(String codigoProduto)
    {
        this.codigoProduto = codigoProduto;
    }
    //Criando método de captura
    public double getValor()
    {
        return valor;
    }
    //Criando método de gravação
    public void setValor (double valor)
    {
        this.valor = valor;
    }
    //Método (ação) que realiza o pedido com base no código do produto
    public String realizarPedido()
    {
        //Se o código do produto for igual a '1065', executa este bloco
        if(codigoProduto.equals("1065"))
        {
            return "\n Código: " + this.codigoProduto + "\n Nome: " + this.nome + 
                    "\n Valor Unitário: " + this.valor + "\n Categoria: " + this.tipoProduto;
        }
        //Se o código é diferente de '1065' este bloco é executado
        else
        {
            return " Produto " + this.codigoProduto + " não encontrado!";
        }
    }
}
