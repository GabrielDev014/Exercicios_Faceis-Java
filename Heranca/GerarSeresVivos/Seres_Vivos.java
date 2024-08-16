package gerarseres;

public class Seres_Vivos 
{
    private String nome;
    private int idade;
    
    public Seres_Vivos (String nome, int idade)
    {
        this.nome = nome;
        this.idade = idade;
    }
    public String getNome()
    {
        return nome;
    }
    public int getIdade()
    {
        return idade;
    }
    public void setNome(String nome)
    {
        this.nome = nome;
    }
    public void setIdade(int idade)
    {
        this.idade = idade;
    }
    
    @Override
    public String toString()
    {
        return "Nome: " + this.nome + "\nIdade: " + this.idade + " anos ";
    }
}
