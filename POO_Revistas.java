package programa_revistas;

public class Programa_Revistas 
{
    public static void main(String[] args) 
    {
        Revista revistaUm = new Revista("", "", null);
        revistaUm.setNome(" Java Magazine ");
        revistaUm.setIssn(" 223445566-77 ");
        
        Edicao edicao = new Edicao();
        edicao.setNumero(" 01 ");
        edicao.setTiragem(5000);
        
        Artigo artigoUm = new Artigo("", 0);
        artigoUm.setNomeArtigo(" Java para Web ");
        artigoUm.setNumeroPaginas(12);
        
        //vinculando
        revistaUm.setEdicao(edicao);
        edicao.setArtigo(artigoUm);
        System.out.println(revistaUm);
    }
}

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

package programa_revistas;

public class Revista 
{
    private String nome;
    private String issn;
    private Edicao edicao;
    
    public Revista(String nome, String issn, Edicao edicao)
    {
        this.nome = nome;
        this.issn = issn;
        this.edicao = edicao;
    }
    
    public void setNome(String nome)
    {
        this.nome = nome;
    }
    
    public String getNome()
    {
        return nome;
    }
    
    public void setIssn(String issn)
    {
        this.issn = issn;
    }
    
    public String getIssn()
    {
        return issn;
    }
    
    public void setEdicao(Edicao edicao)
    {
        this.edicao = edicao;
    }
    
    public Edicao getEdicao()
    {
        return edicao;
    }
    
    public String toString()
    {
        return "nome da revista: " + nome + " código issn: " + issn + " número da edição: " + edicao;
    }
}
