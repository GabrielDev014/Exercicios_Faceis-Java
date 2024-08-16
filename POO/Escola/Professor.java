package especificaprofessor;

public class Professor 
{
    private String nome;
    private int idade;
    
    public Professor (String nome, int idade)
    {
        this.nome = nome;
        this.idade = idade;
    }
    public void setNomeProfessor(String nome)
    {
        this.nome = nome;
    }
    public void setIdadeProfessor (int idade)
    {
        if (idade > 0 && idade < 130)
                {
                    this.idade = idade;
                }
        else
        {
            this.idade = 0;
        }
    }
    public String getNomeProfessor()
    {
        return nome;
    }
    public int getIdadeProfessor()
    {
        return idade;
    }
}
