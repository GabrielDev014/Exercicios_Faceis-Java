package programa_revistas;

public class Edicao 
{
    private String numero; //nº pode ser string porque não haverá cálculos.
    private int tiragem;
    private Artigo artigo;
    
    public void setNumero(String numero)
    {
        this.numero = numero;
    }
    
    public String getNumero()
    {
        return numero;
    }
    
    public void setTiragem(int tiragem)
    {
        this.tiragem = tiragem;
    }
    
    public int getTiragem()
    {
        return tiragem;
    }
    
    public void setArtigo(Artigo artigo)
    {
        this.artigo = artigo;
    }
    
    public Artigo getArtigo()
    {
        return artigo;
    }
    
    public String toString()
    {
        return numero + " tiragem: " + tiragem + artigo;
    }
}
