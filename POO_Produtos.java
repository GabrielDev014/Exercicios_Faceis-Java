package loja;

import java.util.Scanner;
public class Loja 
{
    public static void main(String[] args) 
    {
        Scanner entradaDados = new Scanner ( System.in );
        
        Produto produtoUm= new Produto();
        
        System.out.print( "Digite o nome do produto: ");
        produtoUm.nome = entradaDados.nextLine();
        
        System.out.print( "Digite o nome do fabricante: ");
        produtoUm.fabricante = entradaDados.nextLine();
        
        System.out.print("Digite o valor do produto: ");
        produtoUm.valor = entradaDados.nextDouble();
        
        System.out.println(produtoUm.exibirProduto());
    }
}

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
