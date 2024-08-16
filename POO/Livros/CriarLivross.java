package criarlivross;

import java.util.Scanner;
public class CriarLivross 
{
public static void main(String[] args) 
    {
        Scanner entradaDados = new Scanner ( System.in );
        
        Livro livroUm = new Livro();
        
        System.out.print( "Digite o titulo do livro: ");
        livroUm.titulo = entradaDados.nextLine();
        
        System.out.print( "Digite o nome do autor: ");
        livroUm.autor = entradaDados.nextLine();
        
        System.out.print("Digite o nome da editora: ");
        livroUm.editora = entradaDados.nextLine();
        
        System.out.print( "Digite o numero de paginas: ");
        livroUm.numeroPaginas = entradaDados.nextInt();
        
        System.out.println(livroUm.exibirLivro());
    } 
}
