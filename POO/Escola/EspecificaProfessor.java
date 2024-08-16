package especificaprofessor;

public class EspecificaProfessor 
{

    public static void main(String[] args) 
    {
        Professor professorUm = new Professor("Rosangela",37);
        
        System.out.println ("professor um: " + professorUm.getNomeProfessor());
        System.out.println ("idade: " + professorUm.getIdadeProfessor());
        
        Professor professorDois = new Professor ("Pedro Antonio", 34);
        
        System.out.println ("professor dois: " + professorDois.getNomeProfessor());
        System.out.println ("idade: " + professorDois.getIdadeProfessor());
        professorDois.setIdadeProfessor(36);
        System.out.println ("idade alterada para o prof dois: " + professorDois.getIdadeProfessor());
    }
    
}
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
