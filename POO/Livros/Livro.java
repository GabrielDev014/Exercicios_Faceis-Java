package criarlivross;
public class Livro 
{
    public String titulo;
    public String autor;
    public String editora;
    public int numeroPaginas;
    
    
    public String exibirLivro()
    {
        return "Dados Livro " + titulo + " Escritor " + autor + " editora " + editora + " " + numeroPaginas + " Paginas \n";
    }
}
