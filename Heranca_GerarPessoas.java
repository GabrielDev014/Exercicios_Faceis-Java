package gerarpessoas;

public class GerarPessoas 
{
    public static void main(String[] args) 
    {
        Pessoa pessoaUm = new Pessoa("Marta", 62);
        System.out.println(pessoaUm);
        
        Aluno alunoUm = new Aluno(10, "Pedro", 21);
        System.out.println(alunoUm);
        alunoUm.setIdade(23);
        System.out.println("Nova idade do indivíduo " + alunoUm.getIdade());
    }
}

package gerarpessoas;

public class Pessoa 
{
    private String nome;
    private int idade;
    
    public Pessoa (String nome, int idade)
    {
        this.nome = nome;
        this.idade = idade;
    }
    
    public String getNome()
    {
        return nome;
    }
    
    public void setNome(String nome)
    {
        this.nome = nome;
    }
    
    public int getIdade()
    {
        return idade;
    }
    
    public void setIdade(int idade)
    {
        this.idade = idade;
    }
    
    @Override
    public String toString()
    {
        return "Pessoa{" + "nome = " + nome + ", idade = " + idade + '}';
    }
}

package gerarpessoas;

public class Aluno extends Pessoa
{
    private double notaFinal;
    
    public Aluno(double notaFinal, String nome, int idade)
    {
        super(nome, idade);
        this.notaFinal = notaFinal;
    }
    
    public double getNotaFinal()
    {
        return notaFinal;
    }
    
    public void setNotaFinal(double notaFinal)
    {
        this.notaFinal = notaFinal;
    }
    
    @Override
    public String toString()
    {
        return "Aluno{" + "notaFinal= " + notaFinal + '}' + super.toString();
    }
}
