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
