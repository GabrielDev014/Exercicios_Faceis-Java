package programa_revistas;

public class Artigo 
{
    private String nomeArtigo;
    private int numeroPaginas;
    
    public Artigo(String nomeArtigo, int numeroPaginas)
    {
        this.nomeArtigo = nomeArtigo;
        this.numeroPaginas = numeroPaginas;
    }
    
    public void setNomeArtigo(String nomeArtigo)
    {
        this.nomeArtigo = nomeArtigo;
    }
    
    public String getNomeArtigo()
    {
        return nomeArtigo;
    }
    
    public void setNumeroPaginas(int numeroPaginas)
    {
        this.numeroPaginas = numeroPaginas;
    }
    
    public int getNumeroPaginas()
    {
        return numeroPaginas;
    }
    
    public String toString()
    {
        return " nome do artigo: " + nomeArtigo + " número de páginas: " + numeroPaginas;
    }
}
