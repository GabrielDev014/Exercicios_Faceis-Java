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
