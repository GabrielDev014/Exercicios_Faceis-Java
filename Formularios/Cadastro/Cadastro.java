package usarformcadastro;

public class Cadastro 
{
    //Criando os atributos da classe Cadastro
    private String nome;
    private int idade;
    private String email;
    
    //Criando o construtor para tornar funcional os atributos da classe
    public Cadastro (String nome, int idade, String email)
    {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
    }
    
    //Criando método de "captura" (pegar) no meu código, posso acioná-lo quando necessário.
    public String getNome()
    {
        return nome;
    }
    //Criando método que grava as informações do atributo
    public void setNome(String nome)
    {
        this.nome = nome;
    }
    //Criando método de captura
    public int getIdade()
    {
        return idade;
    }
    //Criando método de gravação
    public void setIdade(int idade)
    {
        this.idade = idade;
    }
    //Criando método de captura
    public String getEmail()
    {
        return email;
    }
    //Criando método de gravação
    public void setEmail(String email)
    {
        this.email = email;
    }
    //Método (ação) que retorna os dados inseridos do cadastro feito pelo usuário
    public String realizarCadastro()
    {
        return "Nome: " + this.nome + "\nIdade: " + this.idade + "\nE-mail: " + this.email + "\nSenha: ******* ";
    }
}
