package usarformprofessor;

public class Professor 
{
    private String nome;
    private int idade;
    
    public Professor (String nome, int idade)
    {
        this.nome = nome;
        this.idade = idade;
    }
    public String getNome()
    {
        return nome;
    }
    public void setNome (String nome)
    {
        this.nome = nome;
    }
    public int getIdade()
    {
        return idade;
    }
    public void setIdade (int idade)
    {
        this.idade = idade;
    }
    public String exibirProfessor()
    {
        return "nome: " + this.nome + "\n idade: " + this.idade;
    }
}
