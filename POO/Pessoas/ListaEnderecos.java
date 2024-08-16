package listaenderecos;

public class ListaEnderecos 
{
    public static void main(String[] args)
    {
        Individuo individuoUm = new Individuo();
        individuoUm.setNome(" marcelo ");
        individuoUm.setCpf(" 222.222.222-00");
        
        Endereco enderecoUm = new Endereco();
        enderecoUm.setCidade(" Bauru ");
        enderecoUm.setRua(" Rua 7 de setembro ");
        enderecoUm.setNumero(" 5-10 ");
        
        //vincula o endereço
        individuoUm.setEndereco(enderecoUm);
        System.out.println(individuoUm);
    }
}

package listaenderecos;

public class Individuo 
{
   private Endereco endereco;
   private String nome;
   private String cpf;
   
   public String getNome()
   {
       return nome;
   }
   public void setNome(String nome)
   {
       this.nome = nome;
   }
   public String getCpf()
   {
       return cpf;
   }
   public void setCpf(String cpf)
   {
       this.cpf = cpf;
   }
   public Endereco getEndereco()
   {
       return endereco;
   }
   public void setEndereco(Endereco endereco)
   {
       this.endereco = endereco;
   }
   public String toString()
   {
       return " Nome: " + nome + " Doc: " + cpf + " Logradouro: " + endereco;
   }
}

package listaenderecos;

public class Endereco 
{
    private String rua;
    private String numero;
    private String cidade;
    
    public String getRua()
    {
        return rua;
    }
    public void setRua(String rua)
    {
        this.rua = rua;
    }
    public String getNumero()
    {
        return numero;
    }
    public void setNumero(String numero)
    {
        this.numero = numero;
    }
    public String getCidade()
    {
        return cidade;
    }
    public void setCidade(String cidade)
    {
        this.cidade = cidade;
    }
    public String toString()
    {
        return numero + rua + cidade;
    }     
}
